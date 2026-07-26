package net.g_odh_a_slef_t.trainpalettes.datagen;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.g_odh_a_slef_t.trainpalettes.util.ModTags;
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
                // Glass
                .add(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_RED.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_ORANGE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_YELLOW.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIME.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_GREEN.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_CYAN.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_BLUE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BLUE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_PURPLE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_MAGENTA.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_PINK.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_WHITE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_GRAY.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_GRAY.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BLACK.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BROWN.get())

                // Mangrove
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get())

                // Acacia
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4.get())

                // Cherry
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4.get())

                // Oak
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4.get())

                // Spruce
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4.get())

                // Birch
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4.get())

                // Jungle
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4.get())

                // Dark Oak
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4.get())

                // Crimson
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4.get())

                // Warped
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4.get());

        tag(ModTags.Blocks.WINDOW_BLOCKS)
                // Glass
                .add(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_RED.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_ORANGE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_YELLOW.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIME.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_GREEN.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_CYAN.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_BLUE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BLUE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_PURPLE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_MAGENTA.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_PINK.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_WHITE.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_GRAY.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_GRAY.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BLACK.get())
                .add(ModBlocks.FRAMED_WINDOW_GLASS_BROWN.get())

                // Mangrove
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get())

                // Acacia
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4.get())

                // Cherry
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4.get())

                // Oak
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4.get())

                // Spruce
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4.get())

                // Birch
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4.get())

                // Jungle
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4.get())

                // Dark Oak
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4.get())

                // Crimson
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4.get())

                // Warped
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3.get())
                .add(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4.get());
    }
}
