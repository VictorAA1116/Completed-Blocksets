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

        // Smooth Stone Block Set
        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS);

        // Smooth Quartz Block Set
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL);

        // Stone Block Set
        dropSelf(ModBlocks.STONE_WALL);
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
