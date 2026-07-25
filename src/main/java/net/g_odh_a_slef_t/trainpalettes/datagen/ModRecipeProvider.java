package net.g_odh_a_slef_t.trainpalettes.datagen;

import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1.get())
                .requires(Blocks.MANGROVE_PLANKS)
                .requires(Blocks.GLASS)
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA.get())
                .pattern(" M ")
                .pattern(" G ")
                .pattern(" M ")
                .define('M', Blocks.MANGROVE_PLANKS)
                .define('G', Blocks.GLASS)
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER.get())
                .requires(Blocks.MANGROVE_PLANKS, 2)
                .requires(Blocks.GLASS)
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3.get())
                .requires(Blocks.MANGROVE_PLANKS, 3)
                .requires(Blocks.GLASS)
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get())
                .requires(Blocks.MANGROVE_PLANKS, 4)
                .requires(Blocks.GLASS)
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
    }
}
