package net.g_odh_a_slef_t.trainpalettes.datagen;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TrainPalettes.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Glass
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_RED);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_YELLOW);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_ORANGE);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_LIME);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_GREEN);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_CYAN);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_BLUE);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_BLUE);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_PURPLE);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_MAGENTA);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_PINK);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_WHITE);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_GRAY);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_GRAY);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_BLACK);
        blockItem(ModBlocks.FRAMED_WINDOW_GLASS_BROWN);

        // Mangrove
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4);

        // Acacia
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_RED_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_RED_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_RED_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_RED_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_RED_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_4);

        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_1);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_3);
        blockItem(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_4);

        // Cherry
        blockItem(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4);

        // Oak
        blockItem(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4);

        // Spruce
        blockItem(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4);

        // Birch
        blockItem(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4);

        // Jungle
        blockItem(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4);

        // Dark Oak
        blockItem(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4);

        // Crimson
        blockItem(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4);

        // Warped
        blockItem(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1);
        blockItem(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA);
        blockItem(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER);
        blockItem(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3);
        blockItem(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock){
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("trainpalettes:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix){
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("trainpalettes:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
