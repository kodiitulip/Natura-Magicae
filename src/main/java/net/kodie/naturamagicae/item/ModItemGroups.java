package net.kodie.naturamagicae.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kodie.naturamagicae.NaturaMagicae;
import net.kodie.naturamagicae.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NATURA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NaturaMagicae.MOD_ID, "natura"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.natura"))
                    .icon(() -> new ItemStack(ModItems.CHALK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHALK);
                        entries.add(ModItems.LEAF);

                        entries.add(ModBlocks.CHALK_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        NaturaMagicae.LOGGER.info("Registering Item Groups for " + NaturaMagicae.MOD_ID);
    }
}
