package com.victor.completedblocksets;

import com.victor.completedblocksets.datagen.ModBlockLootTableProvider;
import com.victor.completedblocksets.datagen.ModBlockTagsProvider;
import com.victor.completedblocksets.datagen.ModModelProvider;
import com.victor.completedblocksets.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CompletedBlocksetsDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
