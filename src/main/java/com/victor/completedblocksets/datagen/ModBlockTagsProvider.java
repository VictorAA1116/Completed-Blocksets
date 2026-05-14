package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider
{
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture)
    {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)

            .add(ModBlocks.POLISHED_CALCITE)
            .add(ModBlocks.CALCITE_BRICKS)
        ;

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;
    }
}
