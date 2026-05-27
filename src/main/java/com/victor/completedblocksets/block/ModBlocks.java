package com.victor.completedblocksets.block;

import com.victor.completedblocksets.CompletedBlocksets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks
{
    //
    // Amethyst Block Set
    //

    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            properties -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_MAGENTA)
            )
    );

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .mapColor(MapColor.COLOR_MAGENTA)
            )
    );

    //
    // Calcite Block Set
    //

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Polished Calcite Block Set
    //

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_CALCITE.defaultBlockState(), properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Calcite Bricks Block Set
    //

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(), properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_BUTTON = registerBlock("polished_calcite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_PRESSURE_PLATE = registerBlock("polished_calcite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    //
    // Dark Prismarine Block Set
    //

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIAMOND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Deepslate Block Set
    //

    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    //
    // End Stone Block Set
    //

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(), properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            properties -> new WallBlock(properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Gold Block Set
    //

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            properties -> new DoorBlock(BlockSetType.IRON, properties
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.IRON, properties
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    //
    // Netherrack Block Set
    //

    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            properties -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(), properties
                    .strength(0.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERRACK)
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            properties -> new SlabBlock(properties
                    .strength(0.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERRACK)
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            properties -> new WallBlock(properties
                    .strength(0.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERRACK)
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Packed Mud Block Set
    //

    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), properties
                    .strength(1.0f, 3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(MapColor.DIRT)
            )
    );

    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(properties
                    .strength(1.0f, 3.0f)
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(MapColor.DIRT)
            )
    );

    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(properties
                    .strength(1.0f,3.0f)
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(MapColor.DIRT)
            )
    );

    //
    // Polished End Stone Block Set
    //

    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            properties -> new Block(properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(), properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            properties -> new SlabBlock(properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            properties -> new WallBlock(properties
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Polished Andesite Block Set
    //

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Polished Diorite Block Set
    //

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Polished Granite Block Set
    //

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Prismarine Brick Block Set
    //

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Purpur Block Set
    //

    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Quartz Block Set
    //

    public static final Block QUARTZ_TEXTURE = registerBlock("quartz_texture",
            properties -> new Block(properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            properties -> new WallBlock(properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Quartz Bricks Block Set
    //

    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            properties -> new WallBlock(properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Resin Block Set
    //

    public static final Block RESIN_STAIRS = registerBlock("resin_stairs",
            properties -> new StairBlock(Blocks.RESIN_BLOCK.defaultBlockState(), properties
                    .sound(SoundType.RESIN)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RESIN_SLAB = registerBlock("resin_slab",
            properties -> new SlabBlock(properties
                    .sound(SoundType.RESIN)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RESIN_WALL = registerBlock("resin_wall",
            properties -> new WallBlock(properties
                    .sound(SoundType.RESIN)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Smooth Sandstone Block Set
    //

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Smooth Red Sandstone Block Set
    //

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Cut Sandstone Block Set
    //

    public static final Block CUT_SANDSTONE_TEXTURE = registerBlock("cut_sandstone_texture",
            properties -> new Block(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            properties -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Cut Red Sandstone Block Set
    //

    public static final Block CUT_RED_SANDSTONE_TEXTURE = registerBlock("cut_red_sandstone_texture",
            properties -> new Block(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            properties -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            properties -> new WallBlock(properties
                    .strength(2.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Smooth Basalt Block Set
    //

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Smooth Stone Block Set
    //

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), properties
                    .strength(1.25f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );


    //
    // Smooth Quartz Block Set
    //

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(properties
                    .strength(0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Stone Block Set
    //

    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // White Concrete Block Set
    //
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Light Gray Concrete Block Set
    //
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Gray Concrete Block Set
    //
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Black Concrete Block Set
    //
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Red Concrete Block Set
    //
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Orange Concrete Block Set
    //
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Yellow Concrete Block Set
    //
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Lime Concrete Block Set
    //
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Green Concrete Block Set
    //
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Cyan Concrete Block Set
    //
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Light Blue Concrete Block Set
    //
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Blue Concrete Block Set
    //
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Purple Concrete Block Set
    //
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Magenta Concrete Block Set
    //
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Pink Concrete Block Set
    //
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Brown Concrete Block Set
    //
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(properties
                    .strength(1.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function)
    {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name))));

        registerBlockItem(name, toRegister);

        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name))))
        );
    }

    public static void registerModBlocks()
    {
        CompletedBlocksets.LOGGER.info("Registering Mod Blocks for " + CompletedBlocksets.MOD_ID);
    }
}
