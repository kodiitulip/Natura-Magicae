package net.kodie.naturamagicae;

import net.fabricmc.api.ModInitializer;

import net.kodie.naturamagicae.block.ModBlocks;
import net.kodie.naturamagicae.item.ModItemGroups;
import net.kodie.naturamagicae.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturaMagicae implements ModInitializer {
	public static final String MOD_ID = "naturamagicae";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}