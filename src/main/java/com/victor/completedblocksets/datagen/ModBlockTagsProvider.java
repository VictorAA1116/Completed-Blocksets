package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider
{
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture)
    {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        valueLookupBuilder(BlockTags.STAIRS)

            .add(ModBlocks.AMETHYST_STAIRS)

            .add(ModBlocks.CALCITE_STAIRS)
            .add(ModBlocks.POLISHED_CALCITE_STAIRS)
            .add(ModBlocks.CALCITE_BRICK_STAIRS)
        ;

        valueLookupBuilder(BlockTags.SLABS)

            .add(ModBlocks.AMETHYST_SLAB)

            .add(ModBlocks.CALCITE_SLAB)
            .add(ModBlocks.POLISHED_CALCITE_SLAB)
            .add(ModBlocks.CALCITE_BRICK_SLAB)
        ;

        valueLookupBuilder(BlockTags.WALLS)

            .add(ModBlocks.CALCITE_WALL)
            .add(ModBlocks.POLISHED_CALCITE_WALL)
            .add(ModBlocks.CALCITE_BRICK_WALL)
        ;

        valueLookupBuilder(BlockTags.BUTTONS)

            .add(ModBlocks.POLISHED_CALCITE_BUTTON)
        ;

        valueLookupBuilder(BlockTags.PRESSURE_PLATES)

            .add(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE)
        ;

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)

            .add(ModBlocks.AMETHYST_STAIRS)
            .add(ModBlocks.AMETHYST_SLAB)

            .add(ModBlocks.CALCITE_STAIRS)
            .add(ModBlocks.CALCITE_SLAB)
            .add(ModBlocks.CALCITE_WALL)

            .add(ModBlocks.POLISHED_CALCITE)
            .add(ModBlocks.POLISHED_CALCITE_STAIRS)
            .add(ModBlocks.POLISHED_CALCITE_SLAB)
            .add(ModBlocks.POLISHED_CALCITE_WALL)

            .add(ModBlocks.CALCITE_BRICKS)
            .add(ModBlocks.CALCITE_BRICK_STAIRS)
            .add(ModBlocks.CALCITE_BRICK_SLAB)
            .add(ModBlocks.CALCITE_BRICK_WALL)
        ;

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;
    }
}
