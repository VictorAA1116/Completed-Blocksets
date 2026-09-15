package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider.BlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
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

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AMETHYST_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PACKED_MUD_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RESIN_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_STONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_SANDSTONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_RED_SANDSTONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
        ;

        builder(BlockTags.SLABS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AMETHYST_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PACKED_MUD_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RESIN_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
        ;

        builder(BlockTags.WALLS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DARK_PRISMARINE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PACKED_MUD_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_ANDESITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DIORITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_GRANITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PRISMARINE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPUR_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RESIN_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_QUARTZ_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_SANDSTONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_RED_SANDSTONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_SANDSTONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_RED_SANDSTONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL).orElseThrow())
        ;

        builder(BlockTags.BUTTONS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_ANDESITE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CINNABAR_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DIORITE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DEEPSLATE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_GRANITE_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_BUTTON).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_SULFUR_BUTTON).orElseThrow())
        ;

        builder(BlockTags.PRESSURE_PLATES)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CINNABAR_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_SULFUR_PRESSURE_PLATE).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WAXED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE).orElseThrow())
        ;

        builder(BlockTags.DOORS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_DOOR).orElseThrow())
        ;

        builder(BlockTags.TRAPDOORS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_TRAPDOOR).orElseThrow())
        ;

        builder(BlockTags.BARS)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_BARS).orElseThrow())
        ;

        builder(BlockTags.CHAINS)
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_CHAIN).orElseThrow())
        ;

        builder(BlockTags.MINEABLE_WITH_PICKAXE)

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AMETHYST_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AMETHYST_SLAB).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICKS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ANDESITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_CALCITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICKS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CALCITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DARK_PRISMARINE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICKS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.DIORITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.END_STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_DOOR).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_TRAPDOOR).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_BARS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GOLD_CHAIN).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICKS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRANITE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.NETHERRACK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_ANDESITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_DIORITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_END_STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_GRANITE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PRISMARINE_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPUR_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.QUARTZ_BRICK_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.POLISHED_RESIN_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_BASALT_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_SANDSTONE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_RED_SANDSTONE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_SANDSTONE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_RED_SANDSTONE_WALL).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_SANDSTONE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CUT_RED_SANDSTONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_STONE_STAIRS).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.SMOOTH_QUARTZ_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.STONE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_CONCRETE_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RED_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL).orElseThrow())

            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB).orElseThrow())
            .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL).orElseThrow())
        ;

        builder(BlockTags.NEEDS_STONE_TOOL)

        ;

        builder(BlockTags.NEEDS_IRON_TOOL)

        ;

        builder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;
    }
}
