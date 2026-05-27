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

        // Amethyst Block Set
        blockModelGenerators.family(Blocks.AMETHYST_BLOCK)
                .stairs(ModBlocks.AMETHYST_STAIRS)
                .slab(ModBlocks.AMETHYST_SLAB)
        ;

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
                .button(ModBlocks.POLISHED_CALCITE_BUTTON)
                .pressurePlate(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE)
        ;

        blockModelGenerators.family(ModBlocks.CALCITE_BRICKS)
                .stairs(ModBlocks.CALCITE_BRICK_STAIRS)
                .slab(ModBlocks.CALCITE_BRICK_SLAB)
                .wall(ModBlocks.CALCITE_BRICK_WALL)
        ;

        // Dark Prismarine Block Set
        blockModelGenerators.family(Blocks.DARK_PRISMARINE)
                .wall(ModBlocks.DARK_PRISMARINE_WALL)
        ;

        // Deep Slate Block Set
        blockModelGenerators.family(Blocks.POLISHED_DEEPSLATE)
                .pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE)
        ;

        // End Stone Block Set
        blockModelGenerators.family(Blocks.END_STONE)
                .stairs(ModBlocks.END_STONE_STAIRS)
                .slab(ModBlocks.END_STONE_SLAB)
                .wall(ModBlocks.END_STONE_WALL)
        ;

        // Gold Block Set
        blockModelGenerators.createDoor(ModBlocks.GOLD_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.GOLD_TRAPDOOR);

        // Netherrack Block Set
        blockModelGenerators.family(Blocks.NETHERRACK)
                .stairs(ModBlocks.NETHERRACK_STAIRS)
                .slab(ModBlocks.NETHERRACK_SLAB)
                .wall(ModBlocks.NETHERRACK_WALL)
        ;

        // Packed Mud Block Set
        blockModelGenerators.family(Blocks.PACKED_MUD)
                .stairs(ModBlocks.PACKED_MUD_STAIRS)
                .slab(ModBlocks.PACKED_MUD_SLAB)
                .wall(ModBlocks.PACKED_MUD_WALL)
        ;

        // Polished Andesite Block Set
        blockModelGenerators.family(Blocks.POLISHED_ANDESITE)
                .wall(ModBlocks.POLISHED_ANDESITE_WALL)
        ;

        // Polished Diorite Block Set
        blockModelGenerators.family(Blocks.POLISHED_DIORITE)
                .wall(ModBlocks.POLISHED_DIORITE_WALL)
        ;

        // Polished End Stone Block Set
        blockModelGenerators.family(ModBlocks.POLISHED_END_STONE)
                .stairs(ModBlocks.POLISHED_END_STONE_STAIRS)
                .slab(ModBlocks.POLISHED_END_STONE_SLAB)
                .wall(ModBlocks.POLISHED_END_STONE_WALL)
        ;

        // Polished Granite Block Set
        blockModelGenerators.family(Blocks.POLISHED_GRANITE)
                .wall(ModBlocks.POLISHED_GRANITE_WALL)
        ;

        // Prismarine Bricks Block Set
        blockModelGenerators.family(Blocks.PRISMARINE_BRICKS)
                .wall(ModBlocks.PRISMARINE_BRICK_WALL)
        ;

        // Purpur Block Set
        blockModelGenerators.family(Blocks.PURPUR_BLOCK)
                .wall(ModBlocks.PURPUR_WALL)
        ;

        // Quartz Block Set
        blockModelGenerators.family(ModBlocks.QUARTZ_TEXTURE)
                .wall(ModBlocks.QUARTZ_WALL)
        ;

        // Quartz Bricks Block Set
        blockModelGenerators.family(Blocks.QUARTZ_BRICKS)
                .stairs(ModBlocks.QUARTZ_BRICK_STAIRS)
                .slab(ModBlocks.QUARTZ_BRICK_SLAB)
                .wall(ModBlocks.QUARTZ_BRICK_WALL)
        ;

        // Smooth Basalt Block Set
        blockModelGenerators.family(Blocks.SMOOTH_BASALT)
                .stairs(ModBlocks.SMOOTH_BASALT_STAIRS)
                .slab(ModBlocks.SMOOTH_BASALT_SLAB)
                .wall(ModBlocks.SMOOTH_BASALT_WALL)
        ;

        // Smooth Stone Block Set
        blockModelGenerators.family(Blocks.SMOOTH_STONE)
                .stairs(ModBlocks.SMOOTH_STONE_STAIRS)
        ;

        // Smooth Quartz Block Set
        blockModelGenerators.family(Blocks.SMOOTH_QUARTZ)
                .wall(ModBlocks.SMOOTH_QUARTZ_WALL)
        ;

        // Stone Block Set
        blockModelGenerators.family(Blocks.STONE)
                .wall(ModBlocks.STONE_WALL)
        ;
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {
        itemModelGenerators.generateFlatItem(ModItems.EXAMPLE_ITEM, ModelTemplates.FLAT_ITEM);
    }
}
