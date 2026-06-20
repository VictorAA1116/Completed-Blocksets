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

                // Andesite Bricks Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

                stairBuilder(ModBlocks.ANDESITE_BRICK_STAIRS, Ingredient.of(ModBlocks.ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ANDESITE_BRICKS), has(ModBlocks.ANDESITE_BRICKS))
                        .group("andesite_bricks")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);

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
                        .group("polished_calcite")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);

                pressurePlate(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE, ModBlocks.POLISHED_CALCITE);

                buttonBuilder(ModBlocks.POLISHED_CALCITE_BUTTON, Ingredient.of(ModBlocks.POLISHED_CALCITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_CALCITE), has(ModBlocks.POLISHED_CALCITE))
                        .group("polished_calcite")
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
                        .group("calcite_bricks")
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

                // Diorite Bricks Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

                stairBuilder(ModBlocks.DIORITE_BRICK_STAIRS, Ingredient.of(ModBlocks.DIORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.DIORITE_BRICKS), has(ModBlocks.DIORITE_BRICKS))
                        .group("diorite_bricks")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);

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

                 shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_BARS, 16)
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

                // Granite Bricks Block Set
                polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

                stairBuilder(ModBlocks.GRANITE_BRICK_STAIRS, Ingredient.of(ModBlocks.GRANITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GRANITE_BRICKS), has(ModBlocks.GRANITE_BRICKS))
                        .group("granite_bricks")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);

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

                // Polished Cinnabar Block Set
                pressurePlate(ModBlocks.POLISHED_CINNABAR_PRESSURE_PLATE, Blocks.POLISHED_CINNABAR);

                buttonBuilder(ModBlocks.POLISHED_CINNABAR_BUTTON, Ingredient.of(Blocks.POLISHED_CINNABAR))
                        .unlockedBy(getHasName(Blocks.POLISHED_CINNABAR), has(Blocks.POLISHED_CINNABAR))
                        .group("polished_cinnabar")
                        .save(output);
                ;

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
                        .group("polished_end_stone")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);

                pressurePlate(ModBlocks.POLISHED_END_STONE_PRESSURE_PLATE, ModBlocks.POLISHED_END_STONE);

                buttonBuilder(ModBlocks.POLISHED_END_STONE_BUTTON, Ingredient.of(ModBlocks.POLISHED_END_STONE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE), has(ModBlocks.POLISHED_END_STONE))
                        .group("polished_end_stone")
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

                // Polished Sulfur Block Set
                pressurePlate(ModBlocks.POLISHED_SULFUR_PRESSURE_PLATE, Blocks.POLISHED_SULFUR);

                buttonBuilder(ModBlocks.POLISHED_SULFUR_BUTTON, Ingredient.of(Blocks.POLISHED_SULFUR))
                        .unlockedBy(getHasName(Blocks.POLISHED_SULFUR), has(Blocks.POLISHED_SULFUR))
                        .group("polished_sulfur")
                        .save(output)
                ;

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
                        .group("quartz_bricks")
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

                // Polished Resin Block Set
                smeltingResultFromBase(ModBlocks.POLISHED_RESIN, Blocks.RESIN_BLOCK);

//                List<ItemLike> POLISHED_RESIN_ITEMS = List.of(ModBlocks.POLISHED_RESIN);
//
//                oreSmelting(POLISHED_RESIN_ITEMS, RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, Blocks.RESIN_BLOCK, 0.1f, 200, "resin");

                stairBuilder(ModBlocks.POLISHED_RESIN_STAIRS, Ingredient.of(ModBlocks.POLISHED_RESIN))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_RESIN), has(ModBlocks.POLISHED_RESIN))
                        .group("polished_resin")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RESIN_SLAB, ModBlocks.POLISHED_RESIN);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RESIN_WALL, ModBlocks.POLISHED_RESIN);

                buttonBuilder(ModBlocks.POLISHED_RESIN_BUTTON, Ingredient.of(ModBlocks.POLISHED_RESIN))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_RESIN), has(ModBlocks.POLISHED_RESIN))
                        .group("polished_resin")
                        .save(output)
                ;

                pressurePlate(ModBlocks.POLISHED_RESIN_PRESSURE_PLATE, ModBlocks.POLISHED_RESIN);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RESIN_STAIRS, ModBlocks.POLISHED_RESIN);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RESIN_SLAB, ModBlocks.POLISHED_RESIN, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RESIN_WALL, ModBlocks.POLISHED_RESIN);

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
                stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("white_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.CONCRETE.white());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.CONCRETE.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.CONCRETE.white(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());

                // Light Gray Concrete Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("light_gray_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.CONCRETE.lightGray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.CONCRETE.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.CONCRETE.lightGray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());

                // Gray Concrete Block Set
                stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("gray_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.CONCRETE.gray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.CONCRETE.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.CONCRETE.gray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());

                // Black Concrete Block Set
                stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("black_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.CONCRETE.black());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.CONCRETE.black());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.CONCRETE.black(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                // Red Concrete Block Set
                stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("red_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.CONCRETE.red());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.CONCRETE.red());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.CONCRETE.red(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());

                // Orange Concrete Block Set
                stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("orange_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.CONCRETE.orange());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.CONCRETE.orange());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.CONCRETE.orange(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());

                // Yellow Concrete Block Set
                stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("yellow_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.CONCRETE.yellow());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.CONCRETE.yellow());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.CONCRETE.yellow(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());

                // Lime Concrete Block Set
                stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("lime_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.CONCRETE.lime());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.CONCRETE.lime());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.CONCRETE.lime(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());

                // Green Concrete Block Set
                stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("green_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.CONCRETE.green());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.CONCRETE.green());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.CONCRETE.green(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());

                // Cyan Concrete Block Set
                stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("cyan_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CONCRETE.cyan());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CONCRETE.cyan());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CONCRETE.cyan(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());

                // Light Blue Concrete Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("light_blue_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.CONCRETE.lightBlue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.CONCRETE.lightBlue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.CONCRETE.lightBlue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());

                // Blue Concrete Block Set
                stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("blue_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.CONCRETE.blue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.CONCRETE.blue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.CONCRETE.blue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());

                // Purple Concrete Block Set
                stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("purple_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.CONCRETE.purple());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.CONCRETE.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.CONCRETE.purple(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());

                // Magenta Concrete Block Set
                stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("magenta_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.CONCRETE.purple());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.CONCRETE.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.CONCRETE.purple(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.purple());

                // Pink Concrete Block Set
                stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("pink_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.CONCRETE.pink());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.CONCRETE.pink());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.CONCRETE.pink(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink());

                // Brown Concrete Block Set
                stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("brown_concrete")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.CONCRETE.brown());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.CONCRETE.brown());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.CONCRETE.brown(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());

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
                stairBuilder(ModBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.white()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.white()), has(Blocks.DYED_TERRACOTTA.white()))
                        .group("white_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.white());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.white(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.white());

                // Light Gray Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.lightGray()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightGray()), has(Blocks.DYED_TERRACOTTA.lightGray()))
                        .group("light_gray_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightGray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightGray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightGray());

                // Gray Terracotta Block Set
                stairBuilder(ModBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.gray()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.gray()), has(Blocks.DYED_TERRACOTTA.gray()))
                        .group("gray_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.gray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.gray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.gray());

                // Black Terracotta Block Set
                stairBuilder(ModBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.black()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.black()), has(Blocks.DYED_TERRACOTTA.black()))
                        .group("black_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.black());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.black());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.black(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.black());

                // Red Terracotta Block Set
                stairBuilder(ModBlocks.RED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.red()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.red()), has(Blocks.DYED_TERRACOTTA.red()))
                        .group("red_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.red());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.red());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.red(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.red());

                // Orange Terracotta Block Set
                stairBuilder(ModBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.orange()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.orange()), has(Blocks.DYED_TERRACOTTA.orange()))
                        .group("orange_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.orange());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.orange());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.orange(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.orange());

                // Yellow Terracotta Block Set
                stairBuilder(ModBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.yellow()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.yellow()), has(Blocks.DYED_TERRACOTTA.yellow()))
                        .group("yellow_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.yellow());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.yellow());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.yellow(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.yellow());

                // Lime Terracotta Block Set
                stairBuilder(ModBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.lime()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lime()), has(Blocks.DYED_TERRACOTTA.lime()))
                        .group("lime_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lime());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lime());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lime(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lime());

                // Green Terracotta Block Set
                stairBuilder(ModBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.green()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.green()), has(Blocks.DYED_TERRACOTTA.green()))
                        .group("green_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.green());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.green());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.green(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.green());

                // Cyan Terracotta Block Set
                stairBuilder(ModBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.cyan()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.cyan()), has(Blocks.DYED_TERRACOTTA.cyan()))
                        .group("cyan_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.cyan());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.cyan());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.cyan(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.cyan());

                // Light Blue Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.lightBlue()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightBlue()), has(Blocks.DYED_TERRACOTTA.lightBlue()))
                        .group("light_blue_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightBlue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.lightBlue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.lightBlue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.lightBlue());

                // Blue Terracotta Block Set
                stairBuilder(ModBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.blue()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.blue()), has(Blocks.DYED_TERRACOTTA.blue()))
                        .group("blue_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.blue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.blue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.blue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.blue());

                // Purple Terracotta Block Set
                stairBuilder(ModBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.purple()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.purple()), has(Blocks.DYED_TERRACOTTA.purple()))
                        .group("purple_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.purple());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.purple(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.purple());

                // Magenta Terracotta Block Set
                stairBuilder(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.magenta()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.magenta()), has(Blocks.DYED_TERRACOTTA.magenta()))
                        .group("magenta_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.magenta());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.magenta());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.magenta(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.magenta());

                // Pink Terracotta Block Set
                stairBuilder(ModBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.pink()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.pink()), has(Blocks.DYED_TERRACOTTA.pink()))
                        .group("pink_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.pink());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.pink());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.pink(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.pink());

                // Brown Terracotta Block Set
                stairBuilder(ModBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.of(Blocks.DYED_TERRACOTTA.brown()))
                        .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.brown()), has(Blocks.DYED_TERRACOTTA.brown()))
                        .group("brown_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.brown());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.DYED_TERRACOTTA.brown());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.DYED_TERRACOTTA.brown(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.DYED_TERRACOTTA.brown());

                // White Glazed Terracotta Block Set
                stairBuilder(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.white()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.white()), has(Blocks.GLAZED_TERRACOTTA.white()))
                        .group("white_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.white());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.white(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.white());

                // Light Gray Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightGray()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightGray()), has(Blocks.GLAZED_TERRACOTTA.lightGray()))
                        .group("light_gray_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lightGray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lightGray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lightGray());

                // Gray Glazed Terracotta Block Set
                stairBuilder(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.gray()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.gray()), has(Blocks.GLAZED_TERRACOTTA.gray()))
                        .group("gray_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.gray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.gray(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.gray());

                // Black Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.black()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.black()), has(Blocks.GLAZED_TERRACOTTA.black()))
                        .group("black_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.black());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.black());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.black(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.black());

                // Red Glazed Terracotta Block Set
                stairBuilder(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.red()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.red()), has(Blocks.GLAZED_TERRACOTTA.red()))
                        .group("red_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.red());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.red());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.red(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.red());

                // Orange Glazed Terracotta Block Set
                stairBuilder(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.orange()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.orange()), has(Blocks.GLAZED_TERRACOTTA.orange()))
                        .group("orange_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.orange());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.orange());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.orange(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.orange());

                // Yellow Glazed Terracotta Block Set
                stairBuilder(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.yellow()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.yellow()), has(Blocks.GLAZED_TERRACOTTA.yellow()))
                        .group("yellow_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.yellow());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.yellow());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.yellow(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.yellow());

                // Lime Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.lime()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lime()), has(Blocks.GLAZED_TERRACOTTA.lime()))
                        .group("lime_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lime());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.lime());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lime(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lime());

                // Green Glazed Terracotta Block Set
                stairBuilder(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.green()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.green()), has(Blocks.GLAZED_TERRACOTTA.green()))
                        .group("green_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.green());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.green());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.green(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.green());

                // Cyan Glazed Terracotta Block Set
                stairBuilder(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.cyan()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.cyan()), has(Blocks.GLAZED_TERRACOTTA.cyan()))
                        .group("cyan_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.cyan());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.cyan());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.cyan(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.cyan());

                // Light Blue Glazed Terracotta Block Set
                stairBuilder(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightBlue()), has(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                        .group("light_blue_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lightBlue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.lightBlue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lightBlue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.lightBlue());

                // Blue Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.blue()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.blue()), has(Blocks.GLAZED_TERRACOTTA.blue()))
                        .group("blue_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.blue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.blue());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.blue(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.blue());

                // Purple Glazed Terracotta Block Set
                stairBuilder(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.purple()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.purple()), has(Blocks.GLAZED_TERRACOTTA.purple()))
                        .group("purple_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.purple());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.purple());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.purple(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.purple());

                // Magenta Glazed Terracotta Block Set
                stairBuilder(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.magenta()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.magenta()), has(Blocks.GLAZED_TERRACOTTA.magenta()))
                        .group("magenta_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.magenta());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.magenta());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.magenta(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.magenta());

                // Pink Glazed Terracotta Block Set
                stairBuilder(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.pink()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.pink()), has(Blocks.GLAZED_TERRACOTTA.pink()))
                        .group("pink_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.pink());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.pink());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.pink(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.pink());

                // Brown Glazed Terracotta Block Set
                stairBuilder(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Ingredient.of(Blocks.GLAZED_TERRACOTTA.brown()))
                        .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.brown()), has(Blocks.GLAZED_TERRACOTTA.brown()))
                        .group("brown_glazed_terracotta")
                        .save(output)
                ;

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.brown());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.brown());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.brown(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.GLAZED_TERRACOTTA.brown());

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
