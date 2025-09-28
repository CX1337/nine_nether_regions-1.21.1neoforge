package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static final List<ItemLike> UNDERWORLD_BRICK = List.of(ModBlocks.UNDERWORLDRACK);

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE, 1)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .define('#', Blocks.GOLD_BLOCK)
                .define('$', Items.APPLE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(recipeOutput, NineNetherRegions.MODID + ":" +"enc_gold_apple");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DRAGON_EGG, 2)
                .pattern("###")
                .pattern("R$R")
                .pattern("###")
                .define('#', ModItems.GHOSTLIUM)
                .define('$', Blocks.DRAGON_EGG)
                .define('R', ModBlocks.UNDERWORLD_CRYSTAL_ORE)
                .unlockedBy(getHasName(Blocks.DRAGON_EGG), has(Blocks.DRAGON_EGG))
                .save(recipeOutput, NineNetherRegions.MODID + ":" +"dragon_egg_new");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HELL_NUCLEUS, 1)
                .pattern("###")
                .pattern("#$#")
                .pattern("#R#")
                .define('#', ModBlocks.UNDERWORLD_CRYSTAL_ORE)
                .define('$', Blocks.DRAGON_EGG)
                .define('R', Items.LAVA_BUCKET)
                .unlockedBy(getHasName(Blocks.DRAGON_EGG), has(Blocks.DRAGON_EGG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.AMETHYST_BEETROOT, 1)
                .pattern("$#")
                .pattern("##")
                .define('#', Items.AMETHYST_SHARD)
                .define('$', Items.BEETROOT)
                .unlockedBy(getHasName(Items.BEETROOT), has(Items.BEETROOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOWING_UNDERWORLD_BRICKS, 5)
                .pattern("#$#")
                .pattern("$#$")
                .pattern("#$#")
                .define('#', ModBlocks.UNDERWORLD_BRICKS)
                .define('$', ModBlocks.HELLIGHT)
                .unlockedBy(getHasName(ModBlocks.HELLIGHT), has(ModBlocks.HELLIGHT))
                .unlockedBy(getHasName(ModBlocks.UNDERWORLD_BRICKS), has(ModBlocks.UNDERWORLD_BRICKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HELLALLOY_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HELLALLOY_INGOT)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STYX_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STYX_INGOT)
                .unlockedBy(getHasName(ModItems.STYX_INGOT), has(ModItems.STYX_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICK_FENCE, 8)
                .pattern("#$#")
                .pattern("#$#")
                .define('#', ModBlocks.UNDERWORLD_BRICKS)
                .define('$', ModItems.UNDERWORLD_BRICK)
                .unlockedBy(getHasName(ModItems.UNDERWORLD_BRICK), has(ModItems.UNDERWORLD_BRICK))
                .unlockedBy(getHasName(ModBlocks.UNDERWORLD_BRICKS),has(ModBlocks.UNDERWORLD_BRICKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICK_FENCE_GATE, 2)
                .pattern("#$#")
                .pattern("#$#")
                .define('#', ModItems.UNDERWORLD_BRICK)
                .define('$', ModBlocks.UNDERWORLD_BRICKS)
                .unlockedBy(getHasName(ModItems.UNDERWORLD_BRICK), has(ModItems.UNDERWORLD_BRICK))
                .unlockedBy(getHasName(ModBlocks.UNDERWORLD_BRICKS),has(ModBlocks.UNDERWORLD_BRICKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICKS, 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.UNDERWORLD_BRICK)
                .unlockedBy(getHasName(ModItems.UNDERWORLD_BRICK), has(ModItems.UNDERWORLD_BRICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HELLALLOY_ROD, 4)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.HELLALLOY_INGOT)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_ROD, 4)
                .pattern("#")
                .pattern("#")
                .define('#', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ALLOY_HILT, 1)
                .pattern("$T$")
                .pattern("#%#")
                .pattern(" R ")
                .define('#', ModItems.HELLALLOY_ROD)
                .define('R', ModItems.HELLALLOY_INGOT)
                .define('%', Items.NETHERITE_SWORD)
                .define('$', ModItems.UNDERWORLD_BRICK)
                .define('T', ModItems.HELL_NUCLEUS)
                .unlockedBy(getHasName(Items.NETHERITE_SWORD), has(Items.NETHERITE_SWORD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.HELLALLOY_SWORD, 1)
                .pattern(" QR")
                .pattern("Q%Q")
                .pattern("#Q ")
                .define('#', ModItems.ALLOY_HILT)
                .define('%', ModItems.HELL_NUCLEUS)
                .define('R', ModItems.HELLALLOY_INGOT)
                .define('Q', ModItems.HELLALLOY_ROD)
                .unlockedBy(getHasName(ModItems.ALLOY_HILT), has(ModItems.ALLOY_HILT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HELLALLOY_AXE, 1)
                .pattern("R% ")
                .pattern("%# ")
                .pattern(" # ")
                .define('#', ModItems.NETHERITE_ROD)
                .define('%', ModItems.HELLALLOY_INGOT)
                .define('R', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HELLALLOY_HOE, 1)
                .pattern("%R ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', ModItems.NETHERITE_ROD)
                .define('%', ModItems.HELLALLOY_INGOT)
                .define('R', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HELLALLOY_PICKAXE, 1)
                .pattern("%R%")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', ModItems.NETHERITE_ROD)
                .define('%', ModItems.HELLALLOY_INGOT)
                .define('R', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.HELLALLOY_SHOVEL, 1)
                .pattern(" % ")
                .pattern(" R ")
                .pattern(" # ")
                .define('#', ModItems.NETHERITE_ROD)
                .define('%', ModItems.HELLALLOY_INGOT)
                .define('R', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModItems.HELLALLOY_INGOT), has(ModItems.HELLALLOY_INGOT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICK_BUTTON, 4)
                .requires(ModBlocks.UNDERWORLD_BRICKS)
                .unlockedBy(getHasName(ModBlocks.UNDERWORLD_BRICKS), has(ModBlocks.UNDERWORLD_BRICKS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HELLALLOY_INGOT, 9)
                .requires(ModBlocks.HELLALLOY_BLOCK)
                .unlockedBy(getHasName(ModBlocks.HELLALLOY_BLOCK), has(ModBlocks.HELLALLOY_BLOCK))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STYX_INGOT, 9)
                .requires(ModBlocks.STYX_BLOCK)
                .unlockedBy(getHasName(ModBlocks.STYX_BLOCK), has(ModBlocks.STYX_BLOCK))
                .save(recipeOutput);

        oreSmelting(recipeOutput, UNDERWORLD_BRICK, RecipeCategory.MISC, ModItems.UNDERWORLD_BRICK, 0.20f, 150, "underworld_bricks");
        oreBlasting(recipeOutput, UNDERWORLD_BRICK, RecipeCategory.MISC, ModItems.UNDERWORLD_BRICK, 4.44f, 300, "underworld_bricks");

        //fenceBuilder(ModBlocks.???_FENCE.get(), Ingredient.of(ModItems/Blocks:???)).group("???")
        //        .unlockedBy("has_???", has(???)).save(recipeOutput);
        //fenceGateBuilder(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(), Ingredient.of(ModBlocks.UNDERWORLD_BRICKS)).group("underworld_bricks")
        //        .unlockedBy("has_underworld_bricks", has(ModBlocks.UNDERWORLD_BRICKS)).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICK_WALL.get(), ModBlocks.UNDERWORLD_BRICKS.get());

        stairBuilder(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.GLOWING_UNDERWORLD_BRICKS)).group("glowing_underworld_bricks")
                .unlockedBy("has_glowing_underworld_bricks", has(ModBlocks.GLOWING_UNDERWORLD_BRICKS)).save(recipeOutput);
        stairBuilder(ModBlocks.UNDERWORLD_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.UNDERWORLD_BRICKS)).group("underworld_bricks")
                .unlockedBy("has_underworld_bricks", has(ModBlocks.UNDERWORLD_BRICKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(), ModBlocks.GLOWING_UNDERWORLD_BRICKS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERWORLD_BRICK_SLAB.get(), ModBlocks.UNDERWORLD_BRICKS.get());

        //压力板的builder同半砖相似；门和活板门与其他一致。
    }
    protected static void oreSmelting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.SMELTING_RECIPE,
                SmeltingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_smelting"
        );
    }

    protected static void oreBlasting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.BLASTING_RECIPE,
                BlastingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_blasting"
        );
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput recipeOutput,
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<ItemLike> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (ItemLike itemlike : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, NineNetherRegions.MODID + ":" + getItemName(result) + suffix + "_" + getItemName(itemlike));
        }
    }
}
