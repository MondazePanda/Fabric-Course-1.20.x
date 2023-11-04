package net.mondaze.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mondaze.mccourse.MCCourseMod;
import net.mondaze.mccourse.block.ModBlocks;

public class ModItems {
    public static final Item FERRO_GLINT = registerItem("ferro_glint",
            new Item(new FabricItemSettings()));
    public static final Item FERRO_GEL = registerItem("ferro_gel",
            new Item(new FabricItemSettings()));

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(FERRO_GLINT);
        entries.add(FERRO_GEL);
        entries.add(ModBlocks.FERRO_GEL_BLOCK);
        entries.add(ModBlocks.STONE_FERRO_GLINT_ORE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItem() {
        MCCourseMod.LOGGER.info("Registering Mod Items For " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
