package com.ytdd9527.networksexpansion.core.managers;

import io.github.sefiraat.networks.Networks;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Per-item tick intervals set with {@code /networks tick <id> <ticks>}.
 * <p>
 * An item with interval N only runs its block ticker every N Slimefun ticks; every other
 * item keeps running each Slimefun tick. Intervals are stored in {@code config.yml}.
 */
public final class TickIntervalManager {
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 1200;
    private static final Map<String, Integer> INTERVALS = new ConcurrentHashMap<>();

    private TickIntervalManager() {
    }

    /**
     * Loads the intervals from the config. Called once during startup.
     */
    public static void load() {
        INTERVALS.clear();
        Networks.getConfigManager().getTickIntervals().forEach((id, interval) -> {
            if (interval > MIN_INTERVAL && interval <= MAX_INTERVAL) {
                INTERVALS.put(id, interval);
            }
        });
    }

    public static int getInterval(@NotNull String id) {
        return INTERVALS.getOrDefault(id, MIN_INTERVAL);
    }

    /**
     * Sets the interval of an item and saves it; an interval of 1 resets the item to normal speed.
     */
    public static void setInterval(@NotNull String id, int interval) {
        if (interval <= MIN_INTERVAL) {
            INTERVALS.remove(id);
            Networks.getConfigManager().setTickInterval(id, null);
        } else {
            INTERVALS.put(id, interval);
            Networks.getConfigManager().setTickInterval(id, interval);
        }
    }

    public static @NotNull Map<String, Integer> getIntervals() {
        return Collections.unmodifiableMap(new TreeMap<>(INTERVALS));
    }

    /**
     * Checked at the start of every block ticker: true when this Slimefun tick should be skipped for the item.
     */
    public static boolean shouldSkip(@Nullable SlimefunItem item) {
        if (item == null || INTERVALS.isEmpty()) {
            return false;
        }
        Integer interval = INTERVALS.get(item.getId());
        return interval != null && Networks.getSlimefunTickCount() % interval != 0;
    }
}
