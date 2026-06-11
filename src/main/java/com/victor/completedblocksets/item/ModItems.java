package com.victor.completedblocksets.item;

import com.victor.completedblocksets.CompletedBlocksets;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems
{
    //public static final Item EXAMPLE_ITEM = registerItem("example_item", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function)
    {
        return Registry.register (
                BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CompletedBlocksets.MOD_ID, name))))
        );
    }

    public static void registerModItems()
    {
        CompletedBlocksets.LOGGER.info("Registering Mod Items for " + CompletedBlocksets.MOD_ID);

        //CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> output.accept(EXAMPLE_ITEM));
    }
}
