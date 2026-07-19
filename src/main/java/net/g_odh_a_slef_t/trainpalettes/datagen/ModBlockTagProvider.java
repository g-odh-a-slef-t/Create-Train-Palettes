package net.g_odh_a_slef_t.trainpalettes.datagen;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TrainPalettes.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE.get());
    }
}
