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
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get())
//                .pattern(" M ")
//                .pattern("MGM")
//                .pattern(" M ")
//                .define('M', Blocks.MANGROVE_PLANKS)
//                .define('G', Blocks.GLASS)
//                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
//                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get())
                .requires(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE.get())
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);
    }
}
