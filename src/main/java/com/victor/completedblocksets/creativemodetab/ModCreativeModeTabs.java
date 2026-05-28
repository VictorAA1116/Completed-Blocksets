package com.victor.completedblocksets.creativemodetab;

import com.victor.completedblocksets.CompletedBlocksets;
import com.victor.completedblocksets.block.ModBlocks;
import com.victor.completedblocksets.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs
{
    public static final CreativeModeTab COMPLETED_BLOCKSETS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, "completed_blocksets"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POLISHED_CALCITE))
                    .title(Component.translatable("creativemodetab.completed-blocksets.completed_blocksets"))
                    .displayItems((parameters, output) -> {

                        // Amethyst Block Set
                        output.accept(ModBlocks.AMETHYST_STAIRS);
                        output.accept(ModBlocks.AMETHYST_SLAB);

                        // Calcite Block Set
                        output.accept(ModBlocks.CALCITE_STAIRS);
                        output.accept(ModBlocks.CALCITE_SLAB);
                        output.accept(ModBlocks.CALCITE_WALL);

                        // Polished Calcite Block Set
                        output.accept(ModBlocks.POLISHED_CALCITE);
                        output.accept(ModBlocks.POLISHED_CALCITE_STAIRS);
                        output.accept(ModBlocks.POLISHED_CALCITE_SLAB);
                        output.accept(ModBlocks.POLISHED_CALCITE_WALL);
                        output.accept(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_CALCITE_BUTTON);

                        // Calcite Brick Block Set
                        output.accept(ModBlocks.CALCITE_BRICKS);
                        output.accept(ModBlocks.CALCITE_BRICK_STAIRS);
                        output.accept(ModBlocks.CALCITE_BRICK_SLAB);
                        output.accept(ModBlocks.CALCITE_BRICK_WALL);

                        // Dark Prismarine Block Set
                        output.accept(ModBlocks.DARK_PRISMARINE_WALL);

                        // Deep Slate Block Set

                        output.accept(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_BUTTON);

                        // End Stone Block Set
                        output.accept(ModBlocks.END_STONE_STAIRS);
                        output.accept(ModBlocks.END_STONE_SLAB);
                        output.accept(ModBlocks.END_STONE_WALL);

                        // Gold Block Set
                        output.accept(ModBlocks.GOLD_DOOR);
                        output.accept(ModBlocks.GOLD_TRAPDOOR);
                        output.accept(ModBlocks.GOLD_BARS);
                        output.accept(ModBlocks.GOLD_CHAIN);

                        // Netherrack Block Set
                        output.accept(ModBlocks.NETHERRACK_STAIRS);
                        output.accept(ModBlocks.NETHERRACK_SLAB);
                        output.accept(ModBlocks.NETHERRACK_WALL);

                        // Packed Mud Block Set
                        output.accept(ModBlocks.PACKED_MUD_STAIRS);
                        output.accept(ModBlocks.PACKED_MUD_SLAB);
                        output.accept(ModBlocks.PACKED_MUD_WALL);

                        // Polished Andesite Block Set
                        output.accept(ModBlocks.POLISHED_ANDESITE_WALL);
                        output.accept(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_ANDESITE_BUTTON);

                        // Polished Diorite Block Set
                        output.accept(ModBlocks.POLISHED_DIORITE_WALL);
                        output.accept(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_DIORITE_BUTTON);

                        // Polished End Stone Block Set
                        output.accept(ModBlocks.POLISHED_END_STONE);
                        output.accept(ModBlocks.POLISHED_END_STONE_STAIRS);
                        output.accept(ModBlocks.POLISHED_END_STONE_SLAB);
                        output.accept(ModBlocks.POLISHED_END_STONE_WALL);
                        output.accept(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_END_STONE_BUTTON);

                        // Polished Granite Block Set
                        output.accept(ModBlocks.POLISHED_GRANITE_WALL);
                        output.accept(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
                        output.accept(ModBlocks.POLISHED_GRANITE_BUTTON);

                        // Prismarine Bricks Block Set
                        output.accept(ModBlocks.PRISMARINE_BRICK_WALL);

                        // Purpur Block Set
                        output.accept(ModBlocks.PURPUR_WALL);

                        // Quartz Block Set
                        output.accept(ModBlocks.QUARTZ_WALL);

                        // Quartz Bricks Block Set
                        output.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
                        output.accept(ModBlocks.QUARTZ_BRICK_SLAB);
                        output.accept(ModBlocks.QUARTZ_BRICK_WALL);

                        // Resin Block Set
                        output.accept(ModBlocks.RESIN_STAIRS);
                        output.accept(ModBlocks.RESIN_SLAB);
                        output.accept(ModBlocks.RESIN_WALL);

                        // Smooth Basalt Block Set
                        output.accept(ModBlocks.SMOOTH_BASALT_STAIRS);
                        output.accept(ModBlocks.SMOOTH_BASALT_SLAB);
                        output.accept(ModBlocks.SMOOTH_BASALT_WALL);

                        // Smooth Sandstone Block Set
                        output.accept(ModBlocks.SMOOTH_SANDSTONE_WALL);

                        // Smooth Red Sandstone Block Set
                        output.accept(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

                        // Cut Sandstone Block Set
                        output.accept(ModBlocks.CUT_SANDSTONE_STAIRS);
                        output.accept(ModBlocks.CUT_SANDSTONE_WALL);

                        // Cut Red Sandstone Block Set
                        output.accept(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
                        output.accept(ModBlocks.CUT_RED_SANDSTONE_WALL);

                        // Smooth Stone Block Set
                        output.accept(ModBlocks.SMOOTH_STONE_STAIRS);

                        // Smooth Quartz Block Set
                        output.accept(ModBlocks.SMOOTH_QUARTZ_WALL);

                        // Stone Block Set
                        output.accept(ModBlocks.STONE_WALL);

                        // White Concrete Block Set
                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB);
                        output.accept(ModBlocks.WHITE_CONCRETE_WALL);

                        // Light Gray Concrete Block Set
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

                        // Gray Concrete Block Set
                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.GRAY_CONCRETE_WALL);

                        // Black Concrete Block Set
                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLACK_CONCRETE_WALL);

                        // Red Concrete Block Set
                        output.accept(ModBlocks.RED_CONCRETE_STAIRS);
                        output.accept(ModBlocks.RED_CONCRETE_SLAB);
                        output.accept(ModBlocks.RED_CONCRETE_WALL);

                        // Orange Concrete Block Set
                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB);
                        output.accept(ModBlocks.ORANGE_CONCRETE_WALL);

                        // Yellow Concrete Block Set
                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB);
                        output.accept(ModBlocks.YELLOW_CONCRETE_WALL);

                        // Lime Concrete Block Set
                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIME_CONCRETE_WALL);

                        // Green Concrete Block Set
                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB);
                        output.accept(ModBlocks.GREEN_CONCRETE_WALL);

                        // Cyan Concrete Block Set
                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB);
                        output.accept(ModBlocks.CYAN_CONCRETE_WALL);

                        // Light Blue Concrete Block Set
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

                        // Blue Concrete Block Set
                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLUE_CONCRETE_WALL);

                        // Purple Concrete Block Set
                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB);
                        output.accept(ModBlocks.PURPLE_CONCRETE_WALL);

                        // Magenta Concrete Block Set
                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_WALL);

                        // Pink Concrete Block Set
                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB);
                        output.accept(ModBlocks.PINK_CONCRETE_WALL);

                        // Brown Concrete Block Set
                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB);
                        output.accept(ModBlocks.BROWN_CONCRETE_WALL);

                        // Terracotta Block Set
                        output.accept(ModBlocks.TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.TERRACOTTA_SLAB);
                        output.accept(ModBlocks.TERRACOTTA_WALL);

                        // White Terracotta Block Set
                        output.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.WHITE_TERRACOTTA_WALL);

                        // Light Gray Terracotta Block Set
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

                        // Gray Terracotta Block Set
                        output.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GRAY_TERRACOTTA_WALL);

                        // Black Terracotta Block Set
                        output.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLACK_TERRACOTTA_WALL);

                        // Red Terracotta Block Set
                        output.accept(ModBlocks.RED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.RED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.RED_TERRACOTTA_WALL);

                        // Orange Terracotta Block Set
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_WALL);

                        // Yellow Terracotta Block Set
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_WALL);

                        // Lime Terracotta Block Set
                        output.accept(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIME_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIME_TERRACOTTA_WALL);

                        // Green Terracotta Block Set
                        output.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GREEN_TERRACOTTA_WALL);

                        // Cyan Terracotta Block Set
                        output.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.CYAN_TERRACOTTA_WALL);

                        // Light Blue Terracotta Block Set
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

                        // Blue Terracotta Block Set
                        output.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLUE_TERRACOTTA_WALL);

                        // Purple Terracotta Block Set
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_WALL);

                        // Magenta Terracotta Block Set
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_WALL);

                        // Pink Terracotta Block Set
                        output.accept(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PINK_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PINK_TERRACOTTA_WALL);

                        // Brown Terracotta Block Set
                        output.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BROWN_TERRACOTTA_WALL);

                        // White Glazed Terracotta Block Set
                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

                        // Light Gray Glazed Terracotta Block Set
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

                        // Gray Glazed Terracotta Block Set
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

                        // Black Glazed Terracotta Block Set
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

                        // Red Glazed Terracotta Block Set
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

                        // Orange Glazed Terracotta Block Set
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

                        // Yellow Glazed Terracotta Block Set
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

                        // Lime Glazed Terracotta Block Set
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

                        // Green Glazed Terracotta Block Set
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

                        // Cyan Glazed Terracotta Block Set
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

                        // Light Blue Glazed Terracotta Block Set
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

                        // Blue Glazed Terracotta Block Set
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

                        // Purple Glazed Terracotta Block Set
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

                        // Magenta Glazed Terracotta Block Set
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

                        // Pink Glazed Terracotta Block Set
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

                        // Brown Glazed Terracotta Block Set
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
                        output.accept(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

                    }).build());

    public static void modifyTabs()
    {
        // Building Blocks Tab
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {

            entries.insertAfter(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS);
            entries.insertAfter(ModBlocks.AMETHYST_STAIRS, ModBlocks.AMETHYST_SLAB);

            entries.insertAfter(Blocks.CHISELED_TUFF_BRICKS, Blocks.CALCITE);
            entries.insertAfter(Blocks.CALCITE, ModBlocks.CALCITE_STAIRS);
            entries.insertAfter(ModBlocks.CALCITE_STAIRS, ModBlocks.CALCITE_SLAB);
            entries.insertAfter(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_WALL);

            entries.insertAfter(ModBlocks.CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
            entries.insertAfter(ModBlocks.POLISHED_CALCITE, ModBlocks.POLISHED_CALCITE_STAIRS);
            entries.insertAfter(ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE_SLAB);
            entries.insertAfter(ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE_WALL);
            entries.insertAfter(ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE, ModBlocks.POLISHED_CALCITE_BUTTON);

            entries.insertAfter(ModBlocks.POLISHED_CALCITE_BUTTON, ModBlocks.CALCITE_BRICKS);
            entries.insertAfter(ModBlocks.CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_STAIRS);
            entries.insertAfter(ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICK_SLAB);
            entries.insertAfter(ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICK_WALL);

            entries.insertAfter(Blocks.DARK_PRISMARINE_SLAB, ModBlocks.DARK_PRISMARINE_WALL);

            entries.insertAfter(Blocks.POLISHED_DEEPSLATE_WALL, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, ModBlocks.POLISHED_DEEPSLATE_BUTTON);

            entries.insertAfter(Blocks.END_STONE, ModBlocks.END_STONE_STAIRS);
            entries.insertAfter(ModBlocks.END_STONE_STAIRS, ModBlocks.END_STONE_SLAB);
            entries.insertAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_WALL);

            entries.insertAfter(Blocks.GOLD_BLOCK, ModBlocks.GOLD_BARS);
            entries.insertAfter(ModBlocks.GOLD_BARS, ModBlocks.GOLD_DOOR);
            entries.insertAfter(ModBlocks.GOLD_DOOR, ModBlocks.GOLD_TRAPDOOR);
            entries.insertAfter(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, ModBlocks.GOLD_CHAIN);

            entries.insertAfter(Blocks.NETHERRACK, ModBlocks.NETHERRACK_STAIRS);
            entries.insertAfter(ModBlocks.NETHERRACK_STAIRS, ModBlocks.NETHERRACK_SLAB);
            entries.insertAfter(ModBlocks.NETHERRACK_SLAB, ModBlocks.NETHERRACK_WALL);

            entries.insertAfter(Blocks.PACKED_MUD, ModBlocks.PACKED_MUD_STAIRS);
            entries.insertAfter(ModBlocks.PACKED_MUD_STAIRS, ModBlocks.PACKED_MUD_SLAB);
            entries.insertAfter(ModBlocks.PACKED_MUD_SLAB, ModBlocks.PACKED_MUD_WALL);

            entries.insertAfter(Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_WALL);
            entries.insertAfter(ModBlocks.POLISHED_ANDESITE_WALL, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, ModBlocks.POLISHED_ANDESITE_BUTTON);

            entries.insertAfter(Blocks.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_WALL);
            entries.insertAfter(ModBlocks.POLISHED_DIORITE_WALL, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, ModBlocks.POLISHED_DIORITE_BUTTON);

            entries.insertAfter(ModBlocks.END_STONE_WALL, ModBlocks.POLISHED_END_STONE);
            entries.insertAfter(ModBlocks.POLISHED_END_STONE, ModBlocks.POLISHED_END_STONE_STAIRS);
            entries.insertAfter(ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE_SLAB);
            entries.insertAfter(ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE_WALL);
            entries.insertAfter(ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE, ModBlocks.POLISHED_END_STONE_BUTTON);

            entries.insertAfter(Blocks.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_WALL);
            entries.insertAfter(ModBlocks.POLISHED_GRANITE_WALL, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
            entries.insertAfter(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, ModBlocks.POLISHED_GRANITE_BUTTON);

            entries.insertAfter(Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.PRISMARINE_BRICK_WALL);

            entries.insertAfter(Blocks.PURPUR_SLAB, ModBlocks.PURPUR_WALL);

            entries.insertAfter(Blocks.QUARTZ_SLAB, ModBlocks.QUARTZ_WALL);

            entries.insertAfter(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS);
            entries.insertAfter(ModBlocks.QUARTZ_BRICK_STAIRS, ModBlocks.QUARTZ_BRICK_SLAB);
            entries.insertAfter(ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_WALL);

            entries.insertAfter(Blocks.MUD_BRICK_WALL, Blocks.RESIN_BLOCK);
            entries.insertAfter(Blocks.RESIN_BLOCK, ModBlocks.RESIN_STAIRS);
            entries.insertAfter(ModBlocks.RESIN_STAIRS, ModBlocks.RESIN_SLAB);
            entries.insertAfter(ModBlocks.RESIN_SLAB, ModBlocks.RESIN_WALL);

            entries.insertAfter(Blocks.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_STAIRS);
            entries.insertAfter(ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_SLAB);
            entries.insertAfter(ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_WALL);

            entries.insertAfter(Blocks.SMOOTH_SANDSTONE_SLAB, ModBlocks.SMOOTH_SANDSTONE_WALL);

            entries.insertAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB, ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

            entries.insertAfter(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_STAIRS);
            entries.insertAfter(Blocks.CUT_SANDSTONE_SLAB, ModBlocks.CUT_SANDSTONE_WALL);

            entries.insertAfter(Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_STAIRS);
            entries.insertAfter(Blocks.CUT_RED_SANDSTONE_SLAB, ModBlocks.CUT_RED_SANDSTONE_WALL);

            entries.insertAfter(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);

            entries.insertAfter(Blocks.SMOOTH_QUARTZ_SLAB, ModBlocks.SMOOTH_QUARTZ_WALL);

            entries.insertAfter(Blocks.STONE_SLAB, ModBlocks.STONE_WALL);

        });

        // Colored Blocks Tab
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {

            entries.insertAfter(Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.WHITE_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_WALL);

            entries.insertAfter(Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

            entries.insertAfter(Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_WALL);

            entries.insertAfter(Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.BLACK_CONCRETE_STAIRS, ModBlocks.BLACK_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_WALL);

            entries.insertAfter(Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.RED_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_WALL);

            entries.insertAfter(Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_WALL);

            entries.insertAfter(Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_WALL);

            entries.insertAfter(Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.LIME_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_WALL);

            entries.insertAfter(Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_WALL);

            entries.insertAfter(Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.CYAN_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_WALL);

            entries.insertAfter(Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

            entries.insertAfter(Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.BLUE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_WALL);

            entries.insertAfter(Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_WALL);

            entries.insertAfter(Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_WALL);

            entries.insertAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.PINK_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_WALL);

            entries.insertAfter(Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS);
            entries.insertAfter(ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.BROWN_CONCRETE_SLAB);
            entries.insertAfter(ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_WALL);

            entries.insertAfter(Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.TERRACOTTA_STAIRS, ModBlocks.TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_WALL);

            entries.insertAfter(Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.PINK_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.WHITE_GLAZED_TERRACOTTA, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.GRAY_GLAZED_TERRACOTTA, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BLACK_GLAZED_TERRACOTTA, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.RED_GLAZED_TERRACOTTA, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.ORANGE_GLAZED_TERRACOTTA, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.YELLOW_GLAZED_TERRACOTTA, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIME_GLAZED_TERRACOTTA, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.GREEN_GLAZED_TERRACOTTA, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.CYAN_GLAZED_TERRACOTTA, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BLUE_GLAZED_TERRACOTTA, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.PURPLE_GLAZED_TERRACOTTA, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.MAGENTA_GLAZED_TERRACOTTA, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.PINK_GLAZED_TERRACOTTA, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

            entries.insertAfter(Blocks.BROWN_GLAZED_TERRACOTTA, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
            entries.insertAfter(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
            entries.insertAfter(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

        });

        // Functional Blocks Tab
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {

            entries.insertAfter(Blocks.IRON_CHAIN, ModBlocks.GOLD_CHAIN);

        });

        // Redstone Blocks Tab
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> {

            entries.insertAfter(Blocks.OAK_DOOR, ModBlocks.GOLD_DOOR);
            entries.insertAfter(Blocks.OAK_TRAPDOOR, ModBlocks.GOLD_TRAPDOOR);

        });
    }

    public static void registerCreativeModeTabs()
    {
        CompletedBlocksets.LOGGER.info("Registering Creative Mode Tabs for " + CompletedBlocksets.MOD_ID);
        modifyTabs();
    }
}
