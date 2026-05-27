package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider
{
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate()
    {
        // Amethyst Block Set
        dropSelf(ModBlocks.AMETHYST_STAIRS);
        add(ModBlocks.AMETHYST_SLAB, this::createSlabItemTable);

        // Calcite Block Set
        dropSelf(ModBlocks.CALCITE_STAIRS);
        add(ModBlocks.CALCITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CALCITE_WALL);

        // Polished Calcite Block Set
        dropSelf(ModBlocks.POLISHED_CALCITE);
        dropSelf(ModBlocks.POLISHED_CALCITE_STAIRS);
        add(ModBlocks.POLISHED_CALCITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_CALCITE_WALL);
        dropSelf(ModBlocks.POLISHED_CALCITE_BUTTON);
        dropSelf(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE);

        // Calcite Brick Block Set
        dropSelf(ModBlocks.CALCITE_BRICKS);
        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        add(ModBlocks.CALCITE_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);

        // Dark Prismarine Block Set
        dropSelf(ModBlocks.DARK_PRISMARINE_WALL);

        // Deep Slate Block Set
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        dropSelf(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        // End Stone Block Set
        dropSelf(ModBlocks.END_STONE_STAIRS);
        add(ModBlocks.END_STONE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.END_STONE_WALL);

        // Gold Block Set
        add(ModBlocks.GOLD_DOOR, this::createDoorTable);
        dropSelf(ModBlocks.GOLD_TRAPDOOR);

        // Netherrack Block Set
        dropSelf(ModBlocks.NETHERRACK_STAIRS);
        add(ModBlocks.NETHERRACK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.NETHERRACK_WALL);

        // Packed Mud Block Set
        dropSelf(ModBlocks.PACKED_MUD_STAIRS);
        add(ModBlocks.PACKED_MUD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PACKED_MUD_WALL);

        // Polished Andesite Block Set
        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL);

        // Polished Diorite Block Set
        dropSelf(ModBlocks.POLISHED_DIORITE_WALL);

        // Polished End Stone Block Set
        dropSelf(ModBlocks.POLISHED_END_STONE);
        dropSelf(ModBlocks.POLISHED_END_STONE_STAIRS);
        add(ModBlocks.POLISHED_END_STONE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_END_STONE_WALL);

        // Polished Granite Block Set
        dropSelf(ModBlocks.POLISHED_GRANITE_WALL);

        // Prismarine Bricks Block Set
        dropSelf(ModBlocks.PRISMARINE_BRICK_WALL);

        // Purpur Block Set
        dropSelf(ModBlocks.PURPUR_WALL);

        // Quartz Block Set
        dropSelf(ModBlocks.QUARTZ_WALL);

        // Quartz Brick Block Set
        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS);
        add(ModBlocks.QUARTZ_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.QUARTZ_BRICK_WALL);

        // Smooth Basalt Block Set
        dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS);
        add(ModBlocks.SMOOTH_BASALT_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.SMOOTH_BASALT_WALL);

        // Smooth Sandstone Block Set
        dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL);

        // Smooth Red Sandstone Block Set
        dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

        // Cut Sandstone Block Set
        dropSelf(ModBlocks.CUT_SANDSTONE_STAIRS);
        dropSelf(ModBlocks.CUT_SANDSTONE_WALL);

        // Cut Red Sandstone Block Set
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_WALL);

        // Smooth Stone Block Set
        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS);

        // Smooth Quartz Block Set
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL);

        // Stone Block Set
        dropSelf(ModBlocks.STONE_WALL);

        // White Concrete Block Set
        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS);
        add(ModBlocks.WHITE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_CONCRETE_WALL);

        // Light Gray Concrete Block Set
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        // Gray Concrete Block Set
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS);
        add(ModBlocks.GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GRAY_CONCRETE_WALL);

        // Black Concrete Block Set
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS);
        add(ModBlocks.BLACK_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_CONCRETE_WALL);

        // Red Concrete Block Set
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS);
        add(ModBlocks.RED_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.RED_CONCRETE_WALL);

        // Orange Concrete Block Set
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS);
        add(ModBlocks.ORANGE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.ORANGE_CONCRETE_WALL);

        // Yellow Concrete Block Set
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS);
        add(ModBlocks.YELLOW_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.YELLOW_CONCRETE_WALL);

        // Lime Concrete Block Set
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS);
        add(ModBlocks.LIME_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIME_CONCRETE_WALL);

        // Green Concrete Block Set
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS);
        add(ModBlocks.GREEN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GREEN_CONCRETE_WALL);

        // Cyan Concrete Block Set
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS);
        add(ModBlocks.CYAN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CYAN_CONCRETE_WALL);

        // Light Blue Concrete Block Set
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        // Blue Concrete Block Set
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS);
        add(ModBlocks.BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLUE_CONCRETE_WALL);

        // Purple Concrete Block Set
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS);
        add(ModBlocks.PURPLE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PURPLE_CONCRETE_WALL);

        // Magenta Concrete Block Set
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        add(ModBlocks.MAGENTA_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL);

        // Pink Concrete Block Set
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS);
        add(ModBlocks.PINK_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_CONCRETE_WALL);

        // Brown Concrete Block Set
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS);
        add(ModBlocks.BROWN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BROWN_CONCRETE_WALL);
    }

//    public LootTable.Builder createMultipleOreDrops(final Block block, Item item,float minDrops, float maxDrops)
//    {
//        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
//
//        return this.createSilkTouchDispatchTable(
//                block, this.applyExplosionDecay(
//                        block, LootItem.lootTableItem(item)
//                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
//                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
//                )
//        );
//    }
}
