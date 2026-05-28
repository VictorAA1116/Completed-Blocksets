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

    public static final Block POLISHED_CALCITE_PRESSURE_PLATE = registerBlock("polished_calcite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CALCITE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_CALCITE_BUTTON = registerBlock("polished_calcite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.CALCITE)
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

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.DEEPSLATE)
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
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.IRON, properties
                    .strength(3.0f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final Block GOLD_BARS = registerBlock("gold_bars",
            properties -> new IronBarsBlock(properties
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
            )
    );

    public static final Block GOLD_CHAIN = registerBlock("gold_chain",
            properties -> new ChainBlock(properties
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.CHAIN)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .forceSolidOn()
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

    public static final Block POLISHED_END_STONE_PRESSURE_PLATE = registerBlock("polished_end_stone_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.STONE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_END_STONE_BUTTON = registerBlock("polished_end_stone_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.STONE)
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

    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.STONE)
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

    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.QUARTZ)
                    .sound(SoundType.STONE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.STONE)
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

    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.STONE)
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20, properties
                    .strength(3f)
                    .sound(SoundType.STONE)
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

    //
    // Terracotta Block Set
    //
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            properties -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // White Terracotta Block Set
    //
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            properties -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Light Gray Terracotta Block Set
    //
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Gray Terracotta Block Set
    //
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Black Terracotta Block Set
    //
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Red Terracotta Block Set
    //
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            properties -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Orange Terracotta Block Set
    //
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            properties -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Yellow Terracotta Block Set
    //
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            properties -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Lime Terracotta Block Set
    //
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Green Terracotta Block Set
    //
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            properties -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Cyan Terracotta Block Set
    //
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            properties -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Light Blue Terracotta Block Set
    //
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Blue Terracotta Block Set
    //
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Purple Terracotta Block Set
    //
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            properties -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Magenta Terracotta Block Set
    //
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            properties -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Pink Terracotta Block Set
    //
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            properties -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // Brown Terracotta Block Set
    //
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            properties -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.25f, 4.2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    //
    // White Glazed Terracotta Block Set
    //
    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.WHITE_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Light Gray Glazed Terracotta Block Set
    //
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Gray Glazed Terracotta Block Set
    //
    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GRAY_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Black Glazed Terracotta Block Set
    //
    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLACK_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Red Glazed Terracotta Block Set
    //
    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.RED_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Orange Glazed Terracotta Block Set
    //
    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.ORANGE_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Yellow Glazed Terracotta Block Set
    //
    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.YELLOW_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Lime Glazed Terracotta Block Set
    //
    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIME_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Green Glazed Terracotta Block Set
    //
    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GREEN_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Cyan Glazed Terracotta Block Set
    //
    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.CYAN_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Light Blue Glazed Terracotta Block Set
    //
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Blue Terracotta Block Set
    //
    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.BLUE_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Purple Glazed Terracotta Block Set
    //

    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.PURPLE_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Magenta Glazed Terracotta Block Set
    //
    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Pink Glazed Terracotta Block Set
    //
    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.PINK_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    //
    // Brown Glazed Terracotta Block Set
    //
    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.BROWN_GLAZED_TERRACOTTA.defaultBlockState(), properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            properties -> new SlabBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
            )
    );

    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            properties -> new WallBlock(properties
                    .strength(1.4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(DyeColor.BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .pushReaction(PushReaction.PUSH_ONLY)
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
