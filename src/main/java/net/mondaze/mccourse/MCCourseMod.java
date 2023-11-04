package net.mondaze.mccourse;

import net.fabricmc.api.ModInitializer;

import net.mondaze.mccourse.block.ModBlocks;
import net.mondaze.mccourse.item.ModItemGroup;
import net.mondaze.mccourse.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger("mc-course");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItem();
		ModBlocks.registerModBlocks();
	}
}