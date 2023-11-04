package net.mondaze.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mondaze.mccourse.MCCourseMod;
import net.mondaze.mccourse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup WAY_POINT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "way_point_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.way_point_group"))
                    .icon(() -> new ItemStack(ModItems.FERRO_GEL)).entries((displayContext, entries) -> {

                        entries.add(ModItems.FERRO_GEL);
                        entries.add(ModItems.FERRO_GLINT);
                        entries.add(ModBlocks.FERRO_GEL_BLOCK);
                        entries.add(ModBlocks.FERRO_GLINT_ORE);

                    }).build());


    public static  void registerItemGroup(){

    }
}
