package com.ytdd9527.networksexpansion.setup;

import com.balugaq.netex.integrations.logitech.LinkBindingStore;
import com.ytdd9527.networksexpansion.implementation.ExpansionItems;
import com.ytdd9527.networksexpansion.implementation.ExpansionItemsMenus;
import com.ytdd9527.networksexpansion.api.cell.CellTier;
import io.github.sefiraat.networks.Networks;
import io.github.sefiraat.networks.slimefun.NetworkSlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import net.guizhanss.slimefun4.utils.WikiUtils;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class SetupUtil {

    @SuppressWarnings("deprecation")
    public static void setupItem() {
        NetworkSlimefunItems.setup();

        /* Items */
        List<SlimefunItem> items = new ArrayList<>();
        items.add(ExpansionItems.CARGO_NODE_QUICK_TOOL.registerThis());
        items.add(ExpansionItems.INFO_TOOL.registerThis());
        items.add(ExpansionItems.DUE_MACHINE_CONFIGURATOR.registerThis());
        items.add(ExpansionItems.ITEM_MOVER.registerThis());
        items.add(ExpansionItems.STATUS_VIEWER.registerThis());
        items.add(ExpansionItems.FACING_PRESETTER.registerThis());
        items.add(ExpansionItems.RUNE_COLLECT.registerThis());
        items.add(ExpansionItems.MAGIC_WORKBENCH_BLUEPRINT.registerThis());
        items.add(ExpansionItems.ARMOR_FORGE_BLUEPRINT.registerThis());
        items.add(ExpansionItems.SMELTERY_BLUEPRINT.registerThis());
        items.add(ExpansionItems.QUANTUM_WORKBENCH_BLUEPRINT.registerThis());
        items.add(ExpansionItems.ANCIENT_ALTAR_BLUEPRINT.registerThis());
        items.add(ExpansionItems.EXPANSION_WORKBENCH_BLUEPRINT.registerThis());
        items.add(ExpansionItems.COMPRESSOR_BLUEPRINT.registerThis());
        items.add(ExpansionItems.GRIND_STONE_BLUEPRINT.registerThis());
        items.add(ExpansionItems.JUICER_BLUEPRINT.registerThis());
        items.add(ExpansionItems.ORE_CRUSHER_BLUEPRINT.registerThis());
        items.add(ExpansionItems.PRESSURE_CHAMBER_BLUEPRINT.registerThis());
        ExpansionItemsMenus.MAIN_MENU_ITEM.addTo(items);

        /* Cargo */
        List<SlimefunItem> cargo = new ArrayList<>();
        cargo.add(ExpansionItems.NETWORK_INPUT_ONLY_MONITOR.registerThis());
        cargo.add(ExpansionItems.NETWORK_OUTPUT_ONLY_MONITOR.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PLUS.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PLUS_GRABBER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PLUS_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PLUS_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_PLUS_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_VANILLA_GRABBER.registerThis());
        cargo.add(ExpansionItems.LINE_TRANSFER_VANILLA_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PLUS.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PLUS_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PLUS_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PLUS_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_PLUS_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.TRANSFER.registerThis());
        cargo.add(ExpansionItems.TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.TRANSFER_PUSHER.registerThis());
        cargo.add(ExpansionItems.TRANSFER_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.TRANSFER_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_TRANSFER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_TRANSFER_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_TRANSFER_MORE_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_TRANSFER_BEST_PUSHER.registerThis());
        cargo.add(ExpansionItems.WHITELISTED_TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.BETTER_GRABBER.registerThis());
        cargo.add(ExpansionItems.WHITELISTED_LINE_TRANSFER_GRABBER.registerThis());
        cargo.add(ExpansionItems.WHITELISTED_TRANSFER_VANILLA_GRABBER.registerThis());
        cargo.add(ExpansionItems.WHITELISTED_LINE_TRANSFER_VANILLA_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_VANILLA_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_VANILLA_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_VANILLA_PLUS_GRABBER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_LINE_TRANSFER_VANILLA_PLUS_PUSHER.registerThis());
        cargo.add(ExpansionItems.SMART_GRABBER.registerThis());
        cargo.add(ExpansionItems.SMART_PUSHER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_IMPORT.registerThis());
        cargo.add(ExpansionItems.ADVANCED_EXPORT.registerThis());
        cargo.add(ExpansionItems.ADVANCED_PURGER.registerThis());
        cargo.add(ExpansionItems.ADVANCED_GREEDY_BLOCK.registerThis());
        cargo.add(ExpansionItems.ADVANCED_VACUUM.registerThis());
        cargo.add(ExpansionItems.ADVANCED_WIRELESS_TRANSMITTER.registerThis());
        cargo.add(ExpansionItems.DUE_MACHINE.registerThis());
        cargo.add(ExpansionItems.OFFSETTER.registerThis());
        cargo.add(ExpansionItems.SWITCHING_MONITOR.registerThis());
        cargo.add(ExpansionItems.SUPER_TRASH.registerThis());
        cargo.add(ExpansionItems.CHAIN_GRABBER.registerThis());
        cargo.add(ExpansionItems.CHAIN_PUSHER.registerThis());
        cargo.add(ExpansionItems.CHAIN_TRANSCEIVER.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_RANGE.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_CAPACITY.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_MODE.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_VANILLA.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_MULTI_DIRECTION.registerThis());
        cargo.add(ExpansionItems.CHAIN_MODULE_BINDING.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_ORDINAL.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_WHITE.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_LIGHT_GRAY.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_GRAY.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_BLACK.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_BROWN.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_RED.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_ORANGE.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_YELLOW.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_LIME.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_GREEN.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_CYAN.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_LIGHT_BLUE.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_BLUE.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_PURPLE.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_MAGENTA.registerThis());
        cargo.add(ExpansionItems.NETWORK_BRIDGE_PINK.registerThis());
        cargo.add(ExpansionItems.CHAIN_CONFIGURATOR.registerThis());
        cargo.add(ExpansionItems.CHAIN_BRUSH.registerThis());
        ExpansionItemsMenus.MAIN_MENU_CARGO_SYSTEM.addTo(cargo);

        /* Storage */
        List<SlimefunItem> storage = new ArrayList<>();
        storage.add(ExpansionItems.ADVANCED_QUANTUM_STORAGE.registerThis());
        storage.add(ExpansionItems.DRAWER_TIPS.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_1.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_2.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_3.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_4.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_5.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_6.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_7.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_8.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_9.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_10.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_11.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_12.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_13.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_1_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_2_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_3_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_4_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_5_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_6_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_7_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_8_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_9_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_10_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_11_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_12_MODEL.registerThis());
        storage.add(ExpansionItems.CARGO_STORAGE_UNIT_13_MODEL.registerThis());
        storage.add(ExpansionItems.STORAGE_UNIT_UPGRADE_TABLE.registerThis());
        storage.add(ExpansionItems.QUANTUM_MANAGER.registerThis());
        storage.add(ExpansionItems.DRAWER_MANAGER.registerThis());
        storage.add(ExpansionItems.STORAGE_CARD_CONVERTER.registerThis());
        storage.add(ExpansionItems.CELL_DRIVE.registerThis());
        storage.add(ExpansionItems.CELL_CLEANER.registerThis());
        storage.add(ExpansionItems.CELL_CONVERTER.registerThis());
        for (CellTier tier : CellTier.values()) {
            storage.add(tier.register(ExpansionItemsMenus.MENU_CARGO_SYSTEM));
        }
        storage.add(CellTier.Unlimited.register(ExpansionItemsMenus.MENU_CARGO_SYSTEM));
        storage.add(ExpansionItems.VOID_CELL.registerThis());
        storage.add(ExpansionItems.ENDER_DRIVE.registerThis());
        storage.add(ExpansionItems.CHANNEL_CONFIGURATOR.registerThis());
        storage.add(ExpansionItems.DRIVE_MONITOR.registerThis());
        ExpansionItemsMenus.MAIN_MENU_STORAGE.addTo(storage);

        /* Machines */
        List<SlimefunItem> machines = new ArrayList<>();
        machines.add(ExpansionItems.NETWORKS_EXPANSION_WORKBENCH.registerThis());
        machines.add(ExpansionItems.NETWORK_CAPACITOR_5.registerThis());
        machines.add(ExpansionItems.NETWORK_CAPACITOR_6.registerThis());
        machines.add(ExpansionItems.NETWORK_GRID_NEW_STYLE.registerThis());
        machines.add(ExpansionItems.NETWORK_CRAFTING_GRID_NEW_STYLE.registerThis());
        machines.add(ExpansionItems.NETWORK_BLUEPRINT_DECODER.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_1.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_2.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_3.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_4.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_5.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_6.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_7.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_8.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_9.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_10.registerThis());
        machines.add(ExpansionItems.LINE_POWER_OUTLET_11.registerThis());
        machines.add(ExpansionItems.CRAFTER_MANAGER.registerThis());
        machines.add(ExpansionItems.ITEM_FLOW_VIEWER.registerThis());
        machines.add(ExpansionItems.HANGING_GRID_NEW_STYLE.registerThis());
        machines.add(ExpansionItems.SMART_NETWORK_CRAFTING_GRID_NEW_STYLE.registerThis());
        machines.add(ExpansionItems.ITEM_DIFFERENTER.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_CRAFTING_TABLE.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_CRAFTING_TABLE_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.MAGIC_WORKBENCH_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.ARMOR_FORGE_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.SMELTERY_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.QUANTUM_WORKBENCH_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.ANCIENT_ALTAR_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.EXPANSION_WORKBENCH_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.COMPRESSOR_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.GRIND_STONE_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.JUICER_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.ORE_CRUSHER_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.PRESSURE_CHAMBER_RECIPE_ENCODER.registerThis());
        machines.add(ExpansionItems.AUTO_MAGIC_WORKBENCH.registerThis());
        machines.add(ExpansionItems.AUTO_ARMOR_FORGE.registerThis());
        machines.add(ExpansionItems.AUTO_SMELTERY.registerThis());
        machines.add(ExpansionItems.AUTO_QUANTUM_WORKBENCH.registerThis());
        machines.add(ExpansionItems.AUTO_ANCIENT_ALTAR.registerThis());
        machines.add(ExpansionItems.AUTO_EXPANSION_WORKBENCH.registerThis());
        machines.add(ExpansionItems.AUTO_COMPRESSOR.registerThis());
        machines.add(ExpansionItems.AUTO_GRIND_STONE.registerThis());
        machines.add(ExpansionItems.AUTO_JUICER.registerThis());
        machines.add(ExpansionItems.AUTO_ORE_CRUSHER.registerThis());
        machines.add(ExpansionItems.AUTO_PRESSURE_CHAMBER.registerThis());
        machines.add(ExpansionItems.AUTO_MAGIC_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_ARMOR_FORGE_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_SMELTERY_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_QUANTUM_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_ANCIENT_ALTAR_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_EXPANSION_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_COMPRESSOR_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_GRIND_STONE_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_JUICER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_ORE_CRUSHER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.AUTO_PRESSURE_CHAMBER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_MAGIC_WORKBENCH.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ARMOR_FORGE.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_SMELTERY.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_QUANTUM_WORKBENCH.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ANCIENT_ALTAR.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_EXPANSION_WORKBENCH.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_COMPRESSOR.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_GRIND_STONE.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_JUICER.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ORE_CRUSHER.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_PRESSURE_CHAMBER.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_MAGIC_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ARMOR_FORGE_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_SMELTERY_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_QUANTUM_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ANCIENT_ALTAR_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_EXPANSION_WORKBENCH_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_COMPRESSOR_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_GRIND_STONE_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_JUICER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_ORE_CRUSHER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ADVANCED_AUTO_PRESSURE_CHAMBER_WITHHOLDING.registerThis());
        machines.add(ExpansionItems.ASSEMBLY_DRIVE.registerThis());
        machines.add(ExpansionItems.ASSEMBLY_CARD.registerThis());
        machines.add(ExpansionItems.ASSEMBLY_WORKSHOP.registerThis());
        machines.add(ExpansionItems.CONTAINER_FILLER.registerThis());
        machines.add(ExpansionItems.OVERCLOCK_CORE.registerThis());
        machines.add(ExpansionItems.SMART_CORE.registerThis());
        machines.add(ExpansionItems.ASSEMBLY_MONITOR.registerThis());
        ExpansionItemsMenus.MAIN_MENU_FUNCTIONAL_MACHINE.addTo(machines);

        /* Info */
        List<SlimefunItem> info = new ArrayList<>();
        info.add(ExpansionItems.AUTHOR_SEFIRAAT.registerThis());
        info.add(ExpansionItems.AUTHOR_YBW0014.registerThis());
        info.add(ExpansionItems.AUTHOR_YITOUDAIDAI.registerThis());
        info.add(ExpansionItems.AUTHOR_TINALNESS.registerThis());
        info.add(ExpansionItems.AUTHOR_MYBEZO.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_1.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_2.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_3.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_4.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_5.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_6.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_7.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_8.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_9.registerThis());
        info.add(ExpansionItems.NTW_EXPANSION_ANNOUNCE_10.registerThis());
        ExpansionItemsMenus.MAIN_MENU_TROPHY.addTo(info);
    }

    private static void setupMenu() {
        Networks networks = Networks.getInstance();

        ExpansionItemsMenus.MAIN_MENU.setTier(0);

        ExpansionItemsMenus.MENU_ITEMS.setTier(0);
        ExpansionItemsMenus.MENU_CARGO_SYSTEM.setTier(0);
        ExpansionItemsMenus.MENU_FUNCTIONAL_MACHINE.setTier(0);
        ExpansionItemsMenus.MENU_TROPHY.setTier(0);

        // One flat row of categories; every item appears in exactly one of them
        ExpansionItemsMenus.MAIN_ITEM_GROUP.addTo(ExpansionItemsMenus.MAIN_MENU_ITEM);
        ExpansionItemsMenus.MAIN_ITEM_GROUP.addTo(ExpansionItemsMenus.MAIN_MENU_CARGO_SYSTEM);
        ExpansionItemsMenus.MAIN_ITEM_GROUP.addTo(ExpansionItemsMenus.MAIN_MENU_STORAGE);
        ExpansionItemsMenus.MAIN_ITEM_GROUP.addTo(ExpansionItemsMenus.MAIN_MENU_FUNCTIONAL_MACHINE);
        ExpansionItemsMenus.MAIN_ITEM_GROUP.addTo(ExpansionItemsMenus.MAIN_MENU_TROPHY);

        ExpansionItemsMenus.MAIN_ITEM_GROUP.setTier(0);
        ExpansionItemsMenus.MAIN_ITEM_GROUP.register(networks);
    }

    public static void setupWiki() {
        WikiUtils.setupJson(Networks.getInstance());
    }

    public static void setupIntegration() {
        Networks.getInstance().setupIntegrations();
    }

    public static void setupAll() {
        setupItem();
        setupWiki();
        setupIntegration();
        Bukkit.getScheduler().runTaskLater(Networks.getInstance(), LinkBindingStore::replayAll, 100L);

        // wait for logitech integration
        Bukkit.getScheduler().runTaskLaterAsynchronously(Networks.getInstance(), SetupUtil::setupMenu, 2L);
    }
}
