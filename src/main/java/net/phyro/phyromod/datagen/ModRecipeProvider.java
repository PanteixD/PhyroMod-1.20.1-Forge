package net.phyro.phyromod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.block.ModBlocks;
import net.phyro.phyromod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> PYRONIUM_SMELTABLES = List.of(ModItems.RAW_PYRONIUM.get(),
            ModBlocks.PYRONIUM_ORE.get(), ModBlocks.DEEPSLATE_PYRONIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }










    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Recipes for smelting/blasting raw metals
        oreSmelting(pWriter, PYRONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PYRONIUM_INGOT.get(), 0.25f, 200, "pyronium_ingot");
        oreBlasting(pWriter, PYRONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PYRONIUM_INGOT.get(), 0.25f, 100, "pyronium_ingot");









        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PYRONIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PYRONIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PYRONIUM_INGOT.get()), has(ModItems.PYRONIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PYRONIUM_INGOT.get(), 9)
                .requires(ModBlocks.PYRONIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PYRONIUM_BLOCK.get()), has(ModBlocks.PYRONIUM_BLOCK.get()))
                .save(pWriter);














    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, PhyroMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
