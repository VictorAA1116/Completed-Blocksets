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

            .add(ModBlocks.END_STONE_STAIRS)

            .add(ModBlocks.NETHERRACK_STAIRS)

            .add(ModBlocks.PACKED_MUD_STAIRS)

            .add(ModBlocks.POLISHED_END_STONE_STAIRS)

            .add(ModBlocks.QUARTZ_BRICK_STAIRS)

            .add(ModBlocks.SMOOTH_BASALT_STAIRS)

            .add(ModBlocks.SMOOTH_STONE_STAIRS)

            .add(ModBlocks.CUT_SANDSTONE_STAIRS)

            .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS)
        ;

        valueLookupBuilder(BlockTags.SLABS)

            .add(ModBlocks.AMETHYST_SLAB)

            .add(ModBlocks.CALCITE_SLAB)

            .add(ModBlocks.POLISHED_CALCITE_SLAB)

            .add(ModBlocks.CALCITE_BRICK_SLAB)

            .add(ModBlocks.END_STONE_SLAB)

            .add(ModBlocks.NETHERRACK_SLAB)

            .add(ModBlocks.PACKED_MUD_SLAB)

            .add(ModBlocks.POLISHED_END_STONE_SLAB)

            .add(ModBlocks.QUARTZ_BRICK_SLAB)

            .add(ModBlocks.SMOOTH_BASALT_SLAB)
        ;

        valueLookupBuilder(BlockTags.WALLS)

            .add(ModBlocks.CALCITE_WALL)

            .add(ModBlocks.POLISHED_CALCITE_WALL)

            .add(ModBlocks.CALCITE_BRICK_WALL)

            .add(ModBlocks.DARK_PRISMARINE_WALL)

            .add(ModBlocks.END_STONE_WALL)

            .add(ModBlocks.NETHERRACK_WALL)

            .add(ModBlocks.PACKED_MUD_WALL)

            .add(ModBlocks.POLISHED_ANDESITE_WALL)

            .add(ModBlocks.POLISHED_DIORITE_WALL)

            .add(ModBlocks.POLISHED_END_STONE_WALL)

            .add(ModBlocks.POLISHED_GRANITE_WALL)

            .add(ModBlocks.PRISMARINE_BRICK_WALL)

            .add(ModBlocks.PURPUR_WALL)

            .add(ModBlocks.QUARTZ_WALL)

            .add(ModBlocks.QUARTZ_BRICK_WALL)

            .add(ModBlocks.SMOOTH_BASALT_WALL)

            .add(ModBlocks.SMOOTH_QUARTZ_WALL)

            .add(ModBlocks.SMOOTH_SANDSTONE_WALL)

            .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)

            .add(ModBlocks.CUT_SANDSTONE_WALL)

            .add(ModBlocks.CUT_RED_SANDSTONE_WALL)

            .add(ModBlocks.STONE_WALL)
        ;

        valueLookupBuilder(BlockTags.BUTTONS)

            .add(ModBlocks.POLISHED_CALCITE_BUTTON)
        ;

        valueLookupBuilder(BlockTags.PRESSURE_PLATES)

            .add(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE)

            .add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE)
        ;

        valueLookupBuilder(BlockTags.DOORS)

            .add(ModBlocks.GOLD_DOOR)
        ;

        valueLookupBuilder(BlockTags.TRAPDOORS)

            .add(ModBlocks.GOLD_TRAPDOOR)
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

            .add(ModBlocks.DARK_PRISMARINE_WALL)

            .add(ModBlocks.END_STONE_STAIRS)
            .add(ModBlocks.END_STONE_SLAB)
            .add(ModBlocks.END_STONE_WALL)

            .add(ModBlocks.GOLD_DOOR)
            .add(ModBlocks.GOLD_TRAPDOOR)

            .add(ModBlocks.NETHERRACK_STAIRS)
            .add(ModBlocks.NETHERRACK_SLAB)
            .add(ModBlocks.NETHERRACK_WALL)

            .add(ModBlocks.POLISHED_ANDESITE_WALL)

            .add(ModBlocks.POLISHED_DIORITE_WALL)

            .add(ModBlocks.POLISHED_END_STONE)
            .add(ModBlocks.POLISHED_END_STONE_STAIRS)
            .add(ModBlocks.POLISHED_END_STONE_SLAB)
            .add(ModBlocks.POLISHED_END_STONE_WALL)

            .add(ModBlocks.POLISHED_GRANITE_WALL)

            .add(ModBlocks.PRISMARINE_BRICK_WALL)

            .add(ModBlocks.PURPUR_WALL)

            .add(ModBlocks.QUARTZ_WALL)

            .add(ModBlocks.QUARTZ_BRICK_STAIRS)
            .add(ModBlocks.QUARTZ_BRICK_SLAB)
            .add(ModBlocks.QUARTZ_BRICK_WALL)

            .add(ModBlocks.SMOOTH_BASALT_STAIRS)
            .add(ModBlocks.SMOOTH_BASALT_SLAB)
            .add(ModBlocks.SMOOTH_BASALT_WALL)

            .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
            .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
            .add(ModBlocks.CUT_SANDSTONE_WALL)
            .add(ModBlocks.CUT_RED_SANDSTONE_WALL)
            .add(ModBlocks.CUT_SANDSTONE_STAIRS)
            .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS)

            .add(ModBlocks.SMOOTH_STONE_STAIRS)

            .add(ModBlocks.SMOOTH_QUARTZ_WALL)

            .add(ModBlocks.STONE_WALL)
        ;

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;
    }
}
