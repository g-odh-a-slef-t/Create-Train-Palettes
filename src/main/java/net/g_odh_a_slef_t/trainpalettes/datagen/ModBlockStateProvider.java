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
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU);
        blockItem(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE);
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
