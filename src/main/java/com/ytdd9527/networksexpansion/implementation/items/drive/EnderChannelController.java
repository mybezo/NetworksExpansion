package com.ytdd9527.networksexpansion.implementation.items.drive;

import com.balugaq.netex.utils.Debug;
import com.ytdd9527.networksexpansion.api.cell.CellnetText;
import io.github.sefiraat.networks.Networks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EnderChannelController {

    private static final String TABLE_CREATE_SQL = "CREATE TABLE IF NOT EXISTS ender_channels ("
        + "channel TEXT NOT NULL, "
        + "cell_uuid CHAR(36) NOT NULL, "
        + "PRIMARY KEY (channel, cell_uuid))";

    private static final String INDEX_CELL_UNIQUE_SQL =
        "CREATE UNIQUE INDEX IF NOT EXISTS idx_enders_cell_unique ON ender_channels(cell_uuid)";

    private static volatile EnderChannelController instance;

    private final AtomicBoolean tableReady = new AtomicBoolean();
    @NotNull
    private final File dbFile;

    public EnderChannelController(@NotNull File dbFile) {
        this.dbFile = dbFile;
        File parent = dbFile.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }
    }

    @NotNull
    public static EnderChannelController getInstance() {
        if (instance == null) {
            synchronized (EnderChannelController.class) {
                if (instance == null) {
                    File file = new File(new File(Networks.getInstance().getDataFolder(), "data"), "ender_channels.db");
                    instance = new EnderChannelController(file);
                }
            }
        }
        return instance;
    }

    public boolean bind(@NotNull String channelName, @NotNull String cellUuid) {
        String existing = getChannelOfCell(cellUuid);
        if (channelName.equals(existing)) {
            return true;
        }
        if (!execute("DELETE FROM ender_channels WHERE cell_uuid = ?", cellUuid)) {
            return false;
        }
        return execute("INSERT INTO ender_channels (channel, cell_uuid) VALUES (?, ?)", channelName, cellUuid);
    }

    public boolean unbindCell(@NotNull String cellUuid) {
        return execute("DELETE FROM ender_channels WHERE cell_uuid = ?", cellUuid);
    }

    @Nullable
    public String getChannelOfCell(@NotNull String cellUuid) {
        return querySingle("SELECT channel FROM ender_channels WHERE cell_uuid = ? LIMIT 1",
            rs -> rs.getString(1), cellUuid);
    }

    @NotNull
    public List<String> getCellUuidsOfChannel(@NotNull String channelName) {
        List<String> result = new ArrayList<>();
        queryEach("SELECT cell_uuid FROM ender_channels WHERE channel = ? ORDER BY rowid", rs -> {
            result.add(rs.getString(1));
        }, channelName);
        return result;
    }

    public void flushAndClose() {
        if (!tableReady.get()) {
            return;
        }
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("PRAGMA wal_checkpoint(TRUNCATE)")) {
            ps.execute();
        } catch (SQLException e) {
            Debug.trace(e, "EnderChannelController failed to flush data on shutdown");
        }
    }

    @NotNull
    private Connection getConnection() throws SQLException {
        ensureTable();
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile.getAbsolutePath());
        try (var stat = conn.createStatement()) {
            stat.execute("PRAGMA busy_timeout=5000");
        } catch (SQLException e) {
            Networks.getInstance().getLogger().warning("Failed to set PRAGMA on ender_channels connection");
            Debug.trace(e, "Failed to set PRAGMA on ender_channels connection");
        }
        return conn;
    }

    @NotNull
    private static String message(@NotNull String key, @NotNull String fallback) {
        try {
            var service = Networks.getLocalizationService();
            if (service != null) {
                return service.getString(key);
            }
        } catch (Throwable e) {
            Debug.trace(e, "EnderChannelController failed to read localized text: " + key);
        }
        return fallback;
    }

    private void ensureTable() throws SQLException {
        if (tableReady.get()) {
            return;
        }
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile.getAbsolutePath());
             var stat = conn.createStatement()) {
            stat.execute(TABLE_CREATE_SQL);
            stat.execute(INDEX_CELL_UNIQUE_SQL);
        } catch (SQLException e) {
            Networks.getInstance().getLogger().warning(message(CellnetText.ENDER_TABLE_CREATE_FAILED, "Failed to create Ender channel database table"));
            throw e;
        }
        tableReady.set(true);
    }

    private interface RowMapper<T> {
        T map(ResultSet rs) throws SQLException;
    }

    private interface RowConsumer {
        void accept(ResultSet rs) throws SQLException;
    }

    private boolean execute(@NotNull String sql, @NotNull Object... args) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            Networks.getInstance().getLogger().warning(message(CellnetText.ENDER_WRITE_FAILED, "Failed to write Ender channel data: {0}").replace("{0}", e.getMessage()));
            Debug.trace(e, "EnderChannelController write failed: " + sql);
            return false;
        }
    }

    @Nullable
    private <T> T querySingle(
            @NotNull String sql,
            @NotNull RowMapper<T> mapper,
            @NotNull Object... args) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapper.map(rs);
                }
                return null;
            }
        } catch (SQLException e) {
            Networks.getInstance().getLogger().warning(message(CellnetText.ENDER_READ_FAILED, "Failed to read Ender channel data: {0}").replace("{0}", e.getMessage()));
            Debug.trace(e, "EnderChannelController query failed: " + sql);
            return null;
        }
    }

    private void queryEach(@NotNull String sql, @NotNull RowConsumer consumer, @NotNull Object... args) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    consumer.accept(rs);
                }
            }
        } catch (SQLException e) {
            Networks.getInstance().getLogger().warning(message(CellnetText.ENDER_READ_FAILED, "Failed to read Ender channel data: {0}").replace("{0}", e.getMessage()));
            Debug.trace(e, "EnderChannelController iteration query failed: " + sql);
        }
    }
}
