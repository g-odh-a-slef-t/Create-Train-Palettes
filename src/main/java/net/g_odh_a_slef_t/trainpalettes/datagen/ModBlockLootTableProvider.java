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
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
