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
