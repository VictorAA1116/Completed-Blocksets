package com.victor.completedblocksets.block;

import com.victor.completedblocksets.CompletedBlocksets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
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
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
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
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
            )
    );

    public static final Block POLISHED_CALCITE_PRESSURE_PLATE = registerBlock("polished_calcite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE, properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5F)
                    .pushReaction(PushReaction.DESTROY)
                    .forceSolidOn()
                    .noCollision()
            )
    );

    //
    // Dark Prismarine Block Set
    //

    //
    // Deepslate Block Set
    //

    //
    // End Stone Block Set
    //

    //
    // Gold Block Set
    //

    //
    // Netherrack Block Set
    //

    //
    // Packed Mud Block Set
    //

    //
    // Polished End Stone Block Set
    //

    //
    // Polished Granite Block Set
    //

    //
    // Polished Andesite Block Set
    //

    //
    // Polished Diorite Block Set
    //

    //
    // Purpur Block Set
    //

    //
    // Quartz Block Set
    //

    //
    // Sandstone Block Set
    //

    //
    // Smooth Basalt Block Set
    //

    //
    // Stone Block Set
    //

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
