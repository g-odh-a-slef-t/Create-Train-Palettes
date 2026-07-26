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
        // Glass
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_RED.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_ORANGE.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_YELLOW.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_LIME.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_GREEN.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_CYAN.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_BLUE.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_BLUE.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_PURPLE.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_MAGENTA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_PINK.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_WHITE.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_GRAY.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_GRAY.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_BLACK.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_GLASS_BROWN.get());

        // Mangrove
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get());

        // Acacia
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4.get());

        // Cherry
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4.get());

        // Oak
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4.get());

        // Spruce
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4.get());

        // Birch
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4.get());

        // Jungle
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4.get());

        // Dark Oak
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4.get());

        // Crimson
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4.get());

        // Warped
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
