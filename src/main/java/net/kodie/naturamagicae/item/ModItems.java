package net.kodie.naturamagicae.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kodie.naturamagicae.NaturaMagicae;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LEAF = registerItem("leaf", new Item(new FabricItemSettings()));
    public static final Item CHALK = registerItem("chalk", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NaturaMagicae.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        NaturaMagicae.LOGGER.info("Registering Mod Items for " + NaturaMagicae.MOD_ID);

    }
}
