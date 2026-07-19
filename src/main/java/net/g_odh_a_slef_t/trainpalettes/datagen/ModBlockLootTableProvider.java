package net.g_odh_a_slef_t.trainpalettes.datagen;

import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
