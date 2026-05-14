package com.victor.completedblocksets;

import com.victor.completedblocksets.block.ModBlocks;
import com.victor.completedblocksets.creativemodetab.ModCreativeModeTabs;
import com.victor.completedblocksets.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompletedBlocksets implements ModInitializer
{
	public static final String MOD_ID = "completed-blocksets";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModCreativeModeTabs.registerCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}