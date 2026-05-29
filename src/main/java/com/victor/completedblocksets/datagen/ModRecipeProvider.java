package com.victor.completedblocksets.datagen;

import com.victor.completedblocksets.block.ModBlocks;
import com.victor.completedblocksets.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput)
        {
            @Override
            public void buildRecipes()
            {
                // Amethyst Block Set
                stairBuilder(ModBlocks.AMETHYST_STAIRS, Ingredient.of(Blocks.AMETHYST_BLOCK))
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .group("amethyst")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);

                // Calcite Block Set
                stairBuilder(ModBlocks.CALCITE_STAIRS, Ingredient.of(Blocks.CALCITE))
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .group("calcite")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                // Polished Calcite Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

                stairBuilder(ModBlocks.POLISHED_CALCITE_STAIRS, Ingredient.of(ModBlocks.POLISHED_CALCITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_CALCITE), has(ModBlocks.POLISHED_CALCITE))
                        .group("calcite")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                pressurePlate(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE, ModBlocks.POLISHED_CALCITE);

                buttonBuilder(ModBlocks.POLISHED_CALCITE_BUTTON, Ingredient.of(ModBlocks.POLISHED_CALCITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_CALCITE), has(ModBlocks.POLISHED_CALCITE))
                        .group("calcite")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE);

                // Calcite Bricks Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

                stairBuilder(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .group("calcite")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE);

                // Copper Block Set
                pressurePlate(ModBlocks.COPPER_PRESSURE_PLATE, Items.COPPER_INGOT);

                // Dark Prismarine Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

                // Deep Slate Block Set
                pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.DEEPSLATE);

                buttonBuilder(ModBlocks.POLISHED_DEEPSLATE_BUTTON, Ingredient.of(Blocks.DEEPSLATE))
                        .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                        .group("polished_deepslate")
                        .save(output)
                ;

                // End Stone Block Set
                stairBuilder(ModBlocks.END_STONE_STAIRS, Ingredient.of(Blocks.END_STONE))
                        .unlockedBy(getHasName(Blocks.END_STONE), has(Blocks.END_STONE))
                        .group("end_stone")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

                // Gold Block Set
                doorBuilder(ModBlocks.GOLD_DOOR, Ingredient.of(Items.GOLD_INGOT))
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output)
                ;

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_TRAPDOOR)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Items.GOLD_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output)
                ;

                 shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_BARS)
                         .pattern("###")
                         .pattern("###")
                         .define('#', Items.GOLD_INGOT)
                         .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                         .group("gold")
                         .save(output)
                 ;

                 shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_CHAIN)
                         .pattern(".")
                         .pattern("#")
                         .pattern(".")
                         .define('#', Items.GOLD_INGOT)
                         .define('.', Items.GOLD_NUGGET)
                         .unlockedBy(getHasName(Items.GOLD_NUGGET), has(Items.GOLD_NUGGET))
                         .group("gold")
                         .save(output)
                 ;

                // Netherrack Block Set
                stairBuilder(ModBlocks.NETHERRACK_STAIRS, Ingredient.of(Blocks.NETHERRACK))
                        .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                        .group("netherrack")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

                // Packed Mud Block Set
                stairBuilder(ModBlocks.PACKED_MUD_STAIRS, Ingredient.of(Blocks.PACKED_MUD))
                        .unlockedBy(getHasName(Blocks.PACKED_MUD), has(Blocks.PACKED_MUD))
                        .group("packed_mud")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

                // Polished Andesite Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

                pressurePlate(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);

                buttonBuilder(ModBlocks.POLISHED_ANDESITE_BUTTON, Ingredient.of(Blocks.POLISHED_ANDESITE))
                        .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE), has(Blocks.POLISHED_ANDESITE))
                        .group("polished_andesite")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);

                // Polished Diorite Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

                pressurePlate(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);

                buttonBuilder(ModBlocks.POLISHED_DIORITE_BUTTON, Ingredient.of(Blocks.POLISHED_DIORITE))
                        .unlockedBy(getHasName(Blocks.POLISHED_DIORITE), has(Blocks.POLISHED_DIORITE))
                        .group("polished_diorite")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);

                // Polished End Stone Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);

                stairBuilder(ModBlocks.POLISHED_END_STONE_STAIRS, Ingredient.of(ModBlocks.POLISHED_END_STONE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE), has(ModBlocks.POLISHED_END_STONE))
                        .group("end_stone")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                pressurePlate(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE, ModBlocks.POLISHED_END_STONE);

                buttonBuilder(ModBlocks.POLISHED_END_STONE_BUTTON, Ingredient.of(ModBlocks.POLISHED_END_STONE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE), has(ModBlocks.POLISHED_END_STONE))
                        .group("end_stone")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE);

                // End Stone Bricks Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE);

                // Polished Granite Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

                pressurePlate(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);

                buttonBuilder(ModBlocks.POLISHED_GRANITE_BUTTON, Ingredient.of(Blocks.POLISHED_GRANITE))
                        .unlockedBy(getHasName(Blocks.POLISHED_GRANITE), has(Blocks.POLISHED_GRANITE))
                        .group("polished_granite")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);

                // Prismarine Bricks Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);

                // Purpur Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

                // Quartz Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);

                // Quartz Bricks Block Set
                stairBuilder(ModBlocks.QUARTZ_BRICK_STAIRS, Ingredient.of(Blocks.QUARTZ_BRICKS))
                        .unlockedBy(getHasName(Blocks.QUARTZ_BRICKS), has(Blocks.QUARTZ_BRICKS))
                        .group("quartz")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);

                // Resin Block Set
                stairBuilder(ModBlocks.RESIN_STAIRS, Ingredient.of(Blocks.RESIN_BLOCK))
                        .unlockedBy(getHasName(Blocks.RESIN_BLOCK), has(Blocks.RESIN_BLOCK))
                        .group("resin")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RESIN_SLAB, Blocks.RESIN_BLOCK);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RESIN_WALL, Blocks.RESIN_BLOCK);

                // Smooth Basalt Block Set
                stairBuilder(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.of(Blocks.SMOOTH_BASALT))
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .group("smooth_basalt")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

                // Smooth Stone Block Set
                stairBuilder(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.of(Blocks.SMOOTH_STONE))
                        .unlockedBy(getHasName(Blocks.SMOOTH_STONE), has(Blocks.SMOOTH_STONE))
                        .group("smooth_stone")
                        .save(output)
                ;

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                // Smooth Quartz Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                // Smooth Sandstone Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);

                // Smooth Red Sandstone Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);

                // Cut Sandstone Block Set
                stairBuilder(ModBlocks.CUT_SANDSTONE_STAIRS, Ingredient.of(Blocks.CUT_SANDSTONE))
                        .unlockedBy(getHasName(Blocks.CUT_SANDSTONE), has(Blocks.CUT_SANDSTONE))
                        .group("cut_sandstone")
                        .save(output)
                ;

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);

                // Cut Red Sandstone Block Set
                stairBuilder(ModBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.of(Blocks.CUT_RED_SANDSTONE))
                        .unlockedBy(getHasName(Blocks.CUT_RED_SANDSTONE), has(Blocks.CUT_RED_SANDSTONE))
                        .group("cut_red_sandstone")
                        .save(output)
                ;

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);

                // Stone Block Set
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);

                // White Concrete Block Set
                stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.WHITE_CONCRETE))
                        .unlockedBy(getHasName(Blocks.WHITE_CONCRETE), has(Blocks.WHITE_CONCRETE))
                        .group("white_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

                // Light Gray Concrete Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE))
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_CONCRETE), has(Blocks.LIGHT_GRAY_CONCRETE))
                        .group("light_gray_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

                // Gray Concrete Block Set
                stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.GRAY_CONCRETE))
                        .unlockedBy(getHasName(Blocks.GRAY_CONCRETE), has(Blocks.GRAY_CONCRETE))
                        .group("gray_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

                // Black Concrete Block Set
                stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.BLACK_CONCRETE))
                        .unlockedBy(getHasName(Blocks.BLACK_CONCRETE), has(Blocks.BLACK_CONCRETE))
                        .group("black_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

                // Red Concrete Block Set
                stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.RED_CONCRETE))
                        .unlockedBy(getHasName(Blocks.RED_CONCRETE), has(Blocks.RED_CONCRETE))
                        .group("red_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

                // Orange Concrete Block Set
                stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.ORANGE_CONCRETE))
                        .unlockedBy(getHasName(Blocks.ORANGE_CONCRETE), has(Blocks.ORANGE_CONCRETE))
                        .group("orange_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

                // Yellow Concrete Block Set
                stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.YELLOW_CONCRETE))
                        .unlockedBy(getHasName(Blocks.YELLOW_CONCRETE), has(Blocks.YELLOW_CONCRETE))
                        .group("yellow_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

                // Lime Concrete Block Set
                stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.LIME_CONCRETE))
                        .unlockedBy(getHasName(Blocks.LIME_CONCRETE), has(Blocks.LIME_CONCRETE))
                        .group("lime_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

                // Green Concrete Block Set
                stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.GREEN_CONCRETE))
                        .unlockedBy(getHasName(Blocks.GREEN_CONCRETE), has(Blocks.GREEN_CONCRETE))
                        .group("green_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

                // Cyan Concrete Block Set
                stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CYAN_CONCRETE))
                        .unlockedBy(getHasName(Blocks.CYAN_CONCRETE), has(Blocks.CYAN_CONCRETE))
                        .group("cyan_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

                // Light Blue Concrete Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE))
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_CONCRETE), has(Blocks.LIGHT_BLUE_CONCRETE))
                        .group("light_blue_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

                // Blue Concrete Block Set
                stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.BLUE_CONCRETE))
                        .unlockedBy(getHasName(Blocks.BLUE_CONCRETE), has(Blocks.BLUE_CONCRETE))
                        .group("blue_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

                // Purple Concrete Block Set
                stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.PURPLE_CONCRETE))
                        .unlockedBy(getHasName(Blocks.PURPLE_CONCRETE), has(Blocks.PURPLE_CONCRETE))
                        .group("purple_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

                // Magenta Concrete Block Set
                stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.MAGENTA_CONCRETE))
                        .unlockedBy(getHasName(Blocks.MAGENTA_CONCRETE), has(Blocks.MAGENTA_CONCRETE))
                        .group("magenta_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

                // Pink Concrete Block Set
                stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.PINK_CONCRETE))
                        .unlockedBy(getHasName(Blocks.PINK_CONCRETE), has(Blocks.PINK_CONCRETE))
                        .group("pink_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

                // Brown Concrete Block Set
                stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.BROWN_CONCRETE))
                        .unlockedBy(getHasName(Blocks.BROWN_CONCRETE), has(Blocks.BROWN_CONCRETE))
                        .group("brown_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

                // Terracotta Block Set
                stairBuilder(ModBlocks.TERRACOTTA_STAIRS, Ingredient.of(Blocks.TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.TERRACOTTA), has(Blocks.TERRACOTTA))
                        .group("terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

                // White Terracotta Block Set
                stairBuilder(ModBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.WHITE_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.WHITE_TERRACOTTA), has(Blocks.WHITE_TERRACOTTA))
                        .group("white_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

                // Light Gray Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_TERRACOTTA), has(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .group("light_gray_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

                // Gray Terracotta Block Set
                stairBuilder(ModBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GRAY_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.GRAY_TERRACOTTA), has(Blocks.GRAY_TERRACOTTA))
                        .group("gray_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

                // Black Terracotta Block Set
                stairBuilder(ModBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BLACK_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BLACK_TERRACOTTA), has(Blocks.BLACK_TERRACOTTA))
                        .group("black_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

                // Red Terracotta Block Set
                stairBuilder(ModBlocks.RED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.RED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.RED_TERRACOTTA), has(Blocks.RED_TERRACOTTA))
                        .group("red_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

                // Orange Terracotta Block Set
                stairBuilder(ModBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.ORANGE_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.ORANGE_TERRACOTTA), has(Blocks.ORANGE_TERRACOTTA))
                        .group("orange_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

                // Yellow Terracotta Block Set
                stairBuilder(ModBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.of(Blocks.YELLOW_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.YELLOW_TERRACOTTA), has(Blocks.YELLOW_TERRACOTTA))
                        .group("yellow_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

                // Lime Terracotta Block Set
                stairBuilder(ModBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIME_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIME_TERRACOTTA), has(Blocks.LIME_TERRACOTTA))
                        .group("lime_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

                // Green Terracotta Block Set
                stairBuilder(ModBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GREEN_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.GREEN_TERRACOTTA), has(Blocks.GREEN_TERRACOTTA))
                        .group("green_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

                // Cyan Terracotta Block Set
                stairBuilder(ModBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.CYAN_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.CYAN_TERRACOTTA), has(Blocks.CYAN_TERRACOTTA))
                        .group("cyan_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

                // Light Blue Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_TERRACOTTA), has(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .group("light_blue_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

                // Blue Terracotta Block Set
                stairBuilder(ModBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BLUE_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BLUE_TERRACOTTA), has(Blocks.BLUE_TERRACOTTA))
                        .group("blue_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

                // Purple Terracotta Block Set
                stairBuilder(ModBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.PURPLE_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.PURPLE_TERRACOTTA), has(Blocks.PURPLE_TERRACOTTA))
                        .group("purple_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

                // Magenta Terracotta Block Set
                stairBuilder(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.of(Blocks.MAGENTA_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.MAGENTA_TERRACOTTA), has(Blocks.MAGENTA_TERRACOTTA))
                        .group("magenta_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

                // Pink Terracotta Block Set
                stairBuilder(ModBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.of(Blocks.PINK_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.PINK_TERRACOTTA), has(Blocks.PINK_TERRACOTTA))
                        .group("pink_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

                // Brown Terracotta Block Set
                stairBuilder(ModBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BROWN_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BROWN_TERRACOTTA), has(Blocks.BROWN_TERRACOTTA))
                        .group("brown_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

                // White Glazed Terracotta Block Set
                stairBuilder(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.WHITE_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.WHITE_GLAZED_TERRACOTTA), has(Blocks.WHITE_GLAZED_TERRACOTTA))
                        .group("white_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.WHITE_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.WHITE_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.WHITE_GLAZED_TERRACOTTA);

                // Light Gray Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), has(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                        .group("light_gray_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

                // Gray Glazed Terracotta Block Set
                stairBuilder(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GRAY_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.GRAY_GLAZED_TERRACOTTA), has(Blocks.GRAY_GLAZED_TERRACOTTA))
                        .group("gray_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GRAY_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GRAY_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GRAY_GLAZED_TERRACOTTA);

                // Black Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BLACK_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BLACK_GLAZED_TERRACOTTA), has(Blocks.BLACK_GLAZED_TERRACOTTA))
                        .group("black_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.BLACK_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Blocks.BLACK_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.BLACK_GLAZED_TERRACOTTA);

                // Red Glazed Terracotta Block Set
                stairBuilder(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.RED_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.RED_GLAZED_TERRACOTTA), has(Blocks.RED_GLAZED_TERRACOTTA))
                        .group("red_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.RED_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Blocks.RED_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.RED_GLAZED_TERRACOTTA);

                // Orange Glazed Terracotta Block Set
                stairBuilder(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.ORANGE_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.ORANGE_GLAZED_TERRACOTTA), has(Blocks.ORANGE_GLAZED_TERRACOTTA))
                        .group("orange_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.ORANGE_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Blocks.ORANGE_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.ORANGE_GLAZED_TERRACOTTA);

                // Yellow Glazed Terracotta Block Set
                stairBuilder(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.YELLOW_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.YELLOW_GLAZED_TERRACOTTA), has(Blocks.YELLOW_GLAZED_TERRACOTTA))
                        .group("yellow_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.YELLOW_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Blocks.YELLOW_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.YELLOW_GLAZED_TERRACOTTA);

                // Lime Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIME_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIME_GLAZED_TERRACOTTA), has(Blocks.LIME_GLAZED_TERRACOTTA))
                        .group("lime_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.LIME_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Blocks.LIME_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.LIME_GLAZED_TERRACOTTA);

                // Green Glazed Terracotta Block Set
                stairBuilder(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GREEN_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.GREEN_GLAZED_TERRACOTTA), has(Blocks.GREEN_GLAZED_TERRACOTTA))
                        .group("green_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GREEN_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Blocks.GREEN_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GREEN_GLAZED_TERRACOTTA);

                // Cyan Glazed Terracotta Block Set
                stairBuilder(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.CYAN_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.CYAN_GLAZED_TERRACOTTA), has(Blocks.CYAN_GLAZED_TERRACOTTA))
                        .group("cyan_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.CYAN_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Blocks.CYAN_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.CYAN_GLAZED_TERRACOTTA);

                // Light Blue Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), has(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                        .group("light_blue_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

                // Blue Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BLUE_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BLUE_GLAZED_TERRACOTTA), has(Blocks.BLUE_GLAZED_TERRACOTTA))
                        .group("blue_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.BLUE_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.BLUE_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.BLUE_GLAZED_TERRACOTTA);

                // Purple Glazed Terracotta Block Set
                stairBuilder(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.PURPLE_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.PURPLE_GLAZED_TERRACOTTA), has(Blocks.PURPLE_GLAZED_TERRACOTTA))
                        .group("purple_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.PURPLE_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Blocks.PURPLE_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.PURPLE_GLAZED_TERRACOTTA);

                // Magenta Glazed Terracotta Block Set
                stairBuilder(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.MAGENTA_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.MAGENTA_GLAZED_TERRACOTTA), has(Blocks.MAGENTA_GLAZED_TERRACOTTA))
                        .group("magenta_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.MAGENTA_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Blocks.MAGENTA_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.MAGENTA_GLAZED_TERRACOTTA);

                // Pink Glazed Terracotta Block Set
                stairBuilder(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.PINK_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.PINK_GLAZED_TERRACOTTA), has(Blocks.PINK_GLAZED_TERRACOTTA))
                        .group("pink_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.PINK_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Blocks.PINK_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.PINK_GLAZED_TERRACOTTA);

                // Brown Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.BROWN_GLAZED_TERRACOTTA))
                        .unlockedBy(getHasName(Blocks.BROWN_GLAZED_TERRACOTTA), has(Blocks.BROWN_GLAZED_TERRACOTTA))
                        .group("brown_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.BROWN_GLAZED_TERRACOTTA);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Blocks.BROWN_GLAZED_TERRACOTTA);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.BROWN_GLAZED_TERRACOTTA);

                // List<ItemLike> CALCITE_BLOCKS = List.of(ModBlocks.POLISHED_CALCITE, ModBlocks.CALCITE_BRICKS);

                // shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, 9)
                //            .requires(ModBlocks.POLISHED_CALCITE)
                //            .unlockedBy(getHasName(ModBlocks.POLISHED_CALCITE), has(ModBlocks.POLISHED_CALCITE))
                //            .group("calcite")
                //            .save(output, ModBlocks.CALCITE_BRICKS.getRegistryName().getPath() + "_from_polished_calcite");

                // shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE)
                //        .pattern("##")
                //        .pattern("##")
                //        .define('#', Blocks.CALCITE)
                //        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                //        .group("calcite")
                //        .save(output);

                // nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS);

                // oreSmelting(CALCITE_BLOCKS, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModItems.EXAMPLE_ITEM, 0.1f, 200, "smelting");
                // oreBlasting(CALCITE_BLOCKS, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, ModItems.EXAMPLE_ITEM, 0.1f, 200, "smelting");
            }
        };
    }

    @Override
    public String getName() {
        return "Completed Block Sets Recipes";
    }
}
