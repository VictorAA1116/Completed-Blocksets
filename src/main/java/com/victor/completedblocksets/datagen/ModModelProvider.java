package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import com.victor.completedblocksets.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricPackOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators)
    {
        //blockModelGenerators.createTrivialCube(ModBlocks.EXAMPLE_BLOCK);

        // Calcite Block Set
        blockModelGenerators.family(Blocks.CALCITE)
                .stairs(ModBlocks.CALCITE_STAIRS)
                .slab(ModBlocks.CALCITE_SLAB)
                .wall(ModBlocks.CALCITE_WALL)
        ;

        blockModelGenerators.family(ModBlocks.POLISHED_CALCITE)
                .stairs(ModBlocks.POLISHED_CALCITE_STAIRS)
                .slab(ModBlocks.POLISHED_CALCITE_SLAB)
                .wall(ModBlocks.POLISHED_CALCITE_WALL)
        ;

        blockModelGenerators.family(ModBlocks.CALCITE_BRICKS)
                .stairs(ModBlocks.CALCITE_BRICK_STAIRS)
                .slab(ModBlocks.CALCITE_BRICK_SLAB)
                .wall(ModBlocks.CALCITE_BRICK_WALL)
        ;
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {
        itemModelGenerators.generateFlatItem(ModItems.EXAMPLE_ITEM, ModelTemplates.FLAT_ITEM);
    }
}
