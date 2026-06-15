package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider.BlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture)
    {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries)
    {
        builder(BlockTags.STAIRS)

            .add(ModBlocks.AMETHYST_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_BRICK_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.END_STONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.NETHERRACK_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.PACKED_MUD_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_BRICK_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.RESIN_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_BASALT_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_STONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.CUT_SANDSTONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_CONCRETE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
        ;

        builder(BlockTags.SLABS)

            .add(ModBlocks.AMETHYST_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_BRICK_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.END_STONE_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.NETHERRACK_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.PACKED_MUD_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_BRICK_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.RESIN_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_BASALT_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_CONCRETE_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_TERRACOTTA_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
        ;

        builder(BlockTags.WALLS)

            .add(ModBlocks.CALCITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.DARK_PRISMARINE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.END_STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.NETHERRACK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PACKED_MUD_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_ANDESITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DIORITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_GRANITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PRISMARINE_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PURPUR_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.RESIN_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_BASALT_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_QUARTZ_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_SANDSTONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CUT_SANDSTONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CUT_RED_SANDSTONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.RED_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_CONCRETE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.RED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
        ;

        builder(BlockTags.BUTTONS)

            .add(ModBlocks.POLISHED_ANDESITE_BUTTON.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE_BUTTON.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DIORITE_BUTTON.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DEEPSLATE_BUTTON.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE_BUTTON.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_GRANITE_BUTTON.builtInRegistryHolder().key())
        ;

        builder(BlockTags.PRESSURE_PLATES)

            .add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE.builtInRegistryHolder().key())

            .add(ModBlocks.COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.WAXED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
            .add(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE.builtInRegistryHolder().key())
        ;

        builder(BlockTags.DOORS)

            .add(ModBlocks.GOLD_DOOR.builtInRegistryHolder().key())
        ;

        builder(BlockTags.TRAPDOORS)

            .add(ModBlocks.GOLD_TRAPDOOR.builtInRegistryHolder().key())
        ;

        builder(BlockTags.BARS)

            .add(ModBlocks.GOLD_BARS.builtInRegistryHolder().key())
        ;

        builder(BlockTags.CHAINS)
            .add(ModBlocks.GOLD_CHAIN.builtInRegistryHolder().key())
        ;

        builder(BlockTags.MINEABLE_WITH_PICKAXE)

            .add(ModBlocks.AMETHYST_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.AMETHYST_SLAB.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CALCITE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CALCITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_CALCITE.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_CALCITE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_CALCITE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_CALCITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CALCITE_BRICKS.builtInRegistryHolder().key())
            .add(ModBlocks.CALCITE_BRICK_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CALCITE_BRICK_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CALCITE_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.DARK_PRISMARINE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.END_STONE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.END_STONE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.END_STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GOLD_DOOR.builtInRegistryHolder().key())
            .add(ModBlocks.GOLD_TRAPDOOR.builtInRegistryHolder().key())
            .add(ModBlocks.GOLD_BARS.builtInRegistryHolder().key())
            .add(ModBlocks.GOLD_CHAIN.builtInRegistryHolder().key())

            .add(ModBlocks.NETHERRACK_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.NETHERRACK_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.NETHERRACK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_ANDESITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_DIORITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_END_STONE.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_END_STONE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_END_STONE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.POLISHED_END_STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.POLISHED_GRANITE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PRISMARINE_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PURPUR_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.QUARTZ_BRICK_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.QUARTZ_BRICK_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.QUARTZ_BRICK_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_BASALT_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.SMOOTH_BASALT_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.SMOOTH_BASALT_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_SANDSTONE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CUT_SANDSTONE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CUT_RED_SANDSTONE_WALL.builtInRegistryHolder().key())
            .add(ModBlocks.CUT_SANDSTONE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_STONE_STAIRS.builtInRegistryHolder().key())

            .add(ModBlocks.SMOOTH_QUARTZ_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.STONE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLACK_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.RED_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.ORANGE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.YELLOW_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIME_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GREEN_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CYAN_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PURPLE_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PINK_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BROWN_CONCRETE_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_CONCRETE_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_CONCRETE_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GRAY_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLACK_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.RED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIME_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GREEN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CYAN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLUE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PINK_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BROWN_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())

            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.builtInRegistryHolder().key())
            .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.builtInRegistryHolder().key())
        ;

        builder(BlockTags.NEEDS_STONE_TOOL)

        ;

        builder(BlockTags.NEEDS_IRON_TOOL)

        ;

        builder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;
    }
}
