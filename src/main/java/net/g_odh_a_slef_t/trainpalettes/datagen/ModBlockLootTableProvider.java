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

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_MANGROVE_BROWN_4.get());

        // Acacia
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_ACACIA_BROWN_4.get());

        // Cherry
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CHERRY_BROWN_4.get());

        // Oak
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_OAK_BROWN_4.get());
        
        // Spruce
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_SPRUCE_BROWN_4.get());

        // Birch
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_BIRCH_BROWN_4.get());

        // Jungle
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_JUNGLE_BROWN_4.get());

        // Dark Oak
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_DARK_OAK_BROWN_4.get());

        // Crimson
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_CRIMSON_BROWN_4.get());

        // Warped
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_RED_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_RED_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_RED_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_RED_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_RED_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_ORANGE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_ORANGE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_ORANGE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_ORANGE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_ORANGE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_YELLOW_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_YELLOW_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_YELLOW_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_YELLOW_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_YELLOW_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIME_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIME_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIME_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIME_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIME_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GREEN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GREEN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GREEN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GREEN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GREEN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CYAN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CYAN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CYAN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CYAN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_CYAN_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLUE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLUE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLUE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLUE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLUE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PURPLE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PURPLE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PURPLE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PURPLE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PURPLE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_MAGENTA_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_MAGENTA_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_MAGENTA_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_MAGENTA_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_MAGENTA_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PINK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PINK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PINK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PINK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_PINK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_WHITE_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_WHITE_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_WHITE_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_WHITE_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_WHITE_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_LIGHT_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GRAY_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GRAY_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GRAY_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GRAY_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_GRAY_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLACK_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLACK_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLACK_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLACK_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BLACK_4.get());

        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BROWN_1.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BROWN_2_PARA.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BROWN_2_CORNER.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BROWN_3.get());
        dropSelf(ModBlocks.FRAMED_WINDOW_WARPED_BROWN_4.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
