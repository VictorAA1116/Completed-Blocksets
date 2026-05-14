package com.victor.completedblocksets.creativemodetab;

import com.victor.completedblocksets.CompletedBlocksets;
import com.victor.completedblocksets.block.ModBlocks;
import com.victor.completedblocksets.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs
{
    public static final CreativeModeTab COMPLETED_BLOCKSETS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, "completed_blocksets"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POLISHED_CALCITE))
                    .title(Component.translatable("creativemodetab.completed-blocksets.completed_blocksets"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.EXAMPLE_ITEM);
                        //output.accept(ModBlocks.EXAMPLE_BLOCK);

                        output.accept(ModBlocks.POLISHED_CALCITE);
                        output.accept(ModBlocks.CALCITE_BRICKS);

                    }).build());

    public static void registerCreativeModeTabs()
    {
        CompletedBlocksets.LOGGER.info("Registering Creative Mode Tabs for " + CompletedBlocksets.MOD_ID);
    }
}
