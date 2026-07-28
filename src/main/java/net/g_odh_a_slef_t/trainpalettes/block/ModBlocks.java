package net.g_odh_a_slef_t.trainpalettes.block;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.custom.ModFramedWindowBlock;
import net.g_odh_a_slef_t.trainpalettes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TrainPalettes.MODID);


    // Glass
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_CLEAR = registerBlock("framed_window_glass_clear",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_RED = registerBlock("framed_window_glass_red",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_ORANGE = registerBlock("framed_window_glass_orange",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_YELLOW = registerBlock("framed_window_glass_yellow",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_LIME = registerBlock("framed_window_glass_lime",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_GREEN = registerBlock("framed_window_glass_green",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_CYAN = registerBlock("framed_window_glass_cyan",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_LIGHT_BLUE = registerBlock("framed_window_glass_light_blue",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_BLUE = registerBlock("framed_window_glass_blue",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_PURPLE = registerBlock("framed_window_glass_purple",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_MAGENTA = registerBlock("framed_window_glass_magenta",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_PINK = registerBlock("framed_window_glass_pink",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_WHITE = registerBlock("framed_window_glass_white",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_LIGHT_GRAY = registerBlock("framed_window_glass_light_gray",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_GRAY = registerBlock("framed_window_glass_gray",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_BLACK = registerBlock("framed_window_glass_black",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_BROWN = registerBlock("framed_window_glass_brown",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Mangrove
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_1 = registerBlock("framed_window/mangrove/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA = registerBlock("framed_window/mangrove/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER = registerBlock("framed_window/mangrove/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_3 = registerBlock("framed_window/mangrove/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_4 = registerBlock("framed_window/mangrove/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    

    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_RED_1 = registerBlock("framed_window/mangrove/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_RED_2_PARA = registerBlock("framed_window/mangrove/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_RED_2_CORNER = registerBlock("framed_window/mangrove/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_RED_3 = registerBlock("framed_window/mangrove/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_RED_4 = registerBlock("framed_window/mangrove/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_ORANGE_1 = registerBlock("framed_window/mangrove/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_ORANGE_2_PARA = registerBlock("framed_window/mangrove/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_ORANGE_2_CORNER = registerBlock("framed_window/mangrove/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_ORANGE_3 = registerBlock("framed_window/mangrove/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_ORANGE_4 = registerBlock("framed_window/mangrove/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_YELLOW_1 = registerBlock("framed_window/mangrove/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_YELLOW_2_PARA = registerBlock("framed_window/mangrove/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_YELLOW_2_CORNER = registerBlock("framed_window/mangrove/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_YELLOW_3 = registerBlock("framed_window/mangrove/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_YELLOW_4 = registerBlock("framed_window/mangrove/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIME_1 = registerBlock("framed_window/mangrove/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIME_2_PARA = registerBlock("framed_window/mangrove/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIME_2_CORNER = registerBlock("framed_window/mangrove/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIME_3 = registerBlock("framed_window/mangrove/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIME_4 = registerBlock("framed_window/mangrove/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GREEN_1 = registerBlock("framed_window/mangrove/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GREEN_2_PARA = registerBlock("framed_window/mangrove/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GREEN_2_CORNER = registerBlock("framed_window/mangrove/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GREEN_3 = registerBlock("framed_window/mangrove/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GREEN_4 = registerBlock("framed_window/mangrove/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CYAN_1 = registerBlock("framed_window/mangrove/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CYAN_2_PARA = registerBlock("framed_window/mangrove/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CYAN_2_CORNER = registerBlock("framed_window/mangrove/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CYAN_3 = registerBlock("framed_window/mangrove/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CYAN_4 = registerBlock("framed_window/mangrove/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_1 = registerBlock("framed_window/mangrove/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_2_PARA = registerBlock("framed_window/mangrove/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/mangrove/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_3 = registerBlock("framed_window/mangrove/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_BLUE_4 = registerBlock("framed_window/mangrove/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLUE_1 = registerBlock("framed_window/mangrove/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLUE_2_PARA = registerBlock("framed_window/mangrove/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLUE_2_CORNER = registerBlock("framed_window/mangrove/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLUE_3 = registerBlock("framed_window/mangrove/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLUE_4 = registerBlock("framed_window/mangrove/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PURPLE_1 = registerBlock("framed_window/mangrove/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PURPLE_2_PARA = registerBlock("framed_window/mangrove/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PURPLE_2_CORNER = registerBlock("framed_window/mangrove/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PURPLE_3 = registerBlock("framed_window/mangrove/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PURPLE_4 = registerBlock("framed_window/mangrove/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_MAGENTA_1 = registerBlock("framed_window/mangrove/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_MAGENTA_2_PARA = registerBlock("framed_window/mangrove/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_MAGENTA_2_CORNER = registerBlock("framed_window/mangrove/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_MAGENTA_3 = registerBlock("framed_window/mangrove/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_MAGENTA_4 = registerBlock("framed_window/mangrove/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PINK_1 = registerBlock("framed_window/mangrove/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PINK_2_PARA = registerBlock("framed_window/mangrove/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PINK_2_CORNER = registerBlock("framed_window/mangrove/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PINK_3 = registerBlock("framed_window/mangrove/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_PINK_4 = registerBlock("framed_window/mangrove/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_WHITE_1 = registerBlock("framed_window/mangrove/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_WHITE_2_PARA = registerBlock("framed_window/mangrove/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_WHITE_2_CORNER = registerBlock("framed_window/mangrove/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_WHITE_3 = registerBlock("framed_window/mangrove/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_WHITE_4 = registerBlock("framed_window/mangrove/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_1 = registerBlock("framed_window/mangrove/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_2_PARA = registerBlock("framed_window/mangrove/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/mangrove/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_3 = registerBlock("framed_window/mangrove/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_LIGHT_GRAY_4 = registerBlock("framed_window/mangrove/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GRAY_1 = registerBlock("framed_window/mangrove/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GRAY_2_PARA = registerBlock("framed_window/mangrove/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GRAY_2_CORNER = registerBlock("framed_window/mangrove/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GRAY_3 = registerBlock("framed_window/mangrove/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_GRAY_4 = registerBlock("framed_window/mangrove/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLACK_1 = registerBlock("framed_window/mangrove/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLACK_2_PARA = registerBlock("framed_window/mangrove/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLACK_2_CORNER = registerBlock("framed_window/mangrove/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLACK_3 = registerBlock("framed_window/mangrove/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BLACK_4 = registerBlock("framed_window/mangrove/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BROWN_1 = registerBlock("framed_window/mangrove/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BROWN_2_PARA = registerBlock("framed_window/mangrove/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BROWN_2_CORNER = registerBlock("framed_window/mangrove/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BROWN_3 = registerBlock("framed_window/mangrove/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_BROWN_4 = registerBlock("framed_window/mangrove/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Acacia
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_1 = registerBlock("framed_window/acacia/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_2_PARA = registerBlock("framed_window/acacia/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER = registerBlock("framed_window/acacia/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_3 = registerBlock("framed_window/acacia/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_4 = registerBlock("framed_window/acacia/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_RED_1 = registerBlock("framed_window/acacia/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_RED_2_PARA = registerBlock("framed_window/acacia/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_RED_2_CORNER = registerBlock("framed_window/acacia/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_RED_3 = registerBlock("framed_window/acacia/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_RED_4 = registerBlock("framed_window/acacia/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_ORANGE_1 = registerBlock("framed_window/acacia/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_ORANGE_2_PARA = registerBlock("framed_window/acacia/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_ORANGE_2_CORNER = registerBlock("framed_window/acacia/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_ORANGE_3 = registerBlock("framed_window/acacia/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_ORANGE_4 = registerBlock("framed_window/acacia/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_YELLOW_1 = registerBlock("framed_window/acacia/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_YELLOW_2_PARA = registerBlock("framed_window/acacia/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_YELLOW_2_CORNER = registerBlock("framed_window/acacia/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_YELLOW_3 = registerBlock("framed_window/acacia/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_YELLOW_4 = registerBlock("framed_window/acacia/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIME_1 = registerBlock("framed_window/acacia/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIME_2_PARA = registerBlock("framed_window/acacia/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIME_2_CORNER = registerBlock("framed_window/acacia/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIME_3 = registerBlock("framed_window/acacia/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIME_4 = registerBlock("framed_window/acacia/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GREEN_1 = registerBlock("framed_window/acacia/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GREEN_2_PARA = registerBlock("framed_window/acacia/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GREEN_2_CORNER = registerBlock("framed_window/acacia/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GREEN_3 = registerBlock("framed_window/acacia/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GREEN_4 = registerBlock("framed_window/acacia/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CYAN_1 = registerBlock("framed_window/acacia/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CYAN_2_PARA = registerBlock("framed_window/acacia/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CYAN_2_CORNER = registerBlock("framed_window/acacia/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CYAN_3 = registerBlock("framed_window/acacia/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CYAN_4 = registerBlock("framed_window/acacia/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_BLUE_1 = registerBlock("framed_window/acacia/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_PARA = registerBlock("framed_window/acacia/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/acacia/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_BLUE_3 = registerBlock("framed_window/acacia/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_BLUE_4 = registerBlock("framed_window/acacia/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLUE_1 = registerBlock("framed_window/acacia/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLUE_2_PARA = registerBlock("framed_window/acacia/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLUE_2_CORNER = registerBlock("framed_window/acacia/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLUE_3 = registerBlock("framed_window/acacia/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLUE_4 = registerBlock("framed_window/acacia/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PURPLE_1 = registerBlock("framed_window/acacia/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PURPLE_2_PARA = registerBlock("framed_window/acacia/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PURPLE_2_CORNER = registerBlock("framed_window/acacia/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PURPLE_3 = registerBlock("framed_window/acacia/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PURPLE_4 = registerBlock("framed_window/acacia/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_MAGENTA_1 = registerBlock("framed_window/acacia/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_MAGENTA_2_PARA = registerBlock("framed_window/acacia/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_MAGENTA_2_CORNER = registerBlock("framed_window/acacia/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_MAGENTA_3 = registerBlock("framed_window/acacia/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_MAGENTA_4 = registerBlock("framed_window/acacia/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PINK_1 = registerBlock("framed_window/acacia/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PINK_2_PARA = registerBlock("framed_window/acacia/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PINK_2_CORNER = registerBlock("framed_window/acacia/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PINK_3 = registerBlock("framed_window/acacia/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_PINK_4 = registerBlock("framed_window/acacia/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_WHITE_1 = registerBlock("framed_window/acacia/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_WHITE_2_PARA = registerBlock("framed_window/acacia/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_WHITE_2_CORNER = registerBlock("framed_window/acacia/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_WHITE_3 = registerBlock("framed_window/acacia/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_WHITE_4 = registerBlock("framed_window/acacia/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_GRAY_1 = registerBlock("framed_window/acacia/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_PARA = registerBlock("framed_window/acacia/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/acacia/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_GRAY_3 = registerBlock("framed_window/acacia/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_LIGHT_GRAY_4 = registerBlock("framed_window/acacia/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GRAY_1 = registerBlock("framed_window/acacia/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GRAY_2_PARA = registerBlock("framed_window/acacia/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GRAY_2_CORNER = registerBlock("framed_window/acacia/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GRAY_3 = registerBlock("framed_window/acacia/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_GRAY_4 = registerBlock("framed_window/acacia/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLACK_1 = registerBlock("framed_window/acacia/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLACK_2_PARA = registerBlock("framed_window/acacia/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLACK_2_CORNER = registerBlock("framed_window/acacia/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLACK_3 = registerBlock("framed_window/acacia/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BLACK_4 = registerBlock("framed_window/acacia/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BROWN_1 = registerBlock("framed_window/acacia/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BROWN_2_PARA = registerBlock("framed_window/acacia/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BROWN_2_CORNER = registerBlock("framed_window/acacia/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BROWN_3 = registerBlock("framed_window/acacia/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_BROWN_4 = registerBlock("framed_window/acacia/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Cherry
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_1 = registerBlock("framed_window/cherry/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_2_PARA = registerBlock("framed_window/cherry/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER = registerBlock("framed_window/cherry/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_3 = registerBlock("framed_window/cherry/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_4 = registerBlock("framed_window/cherry/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_RED_1 = registerBlock("framed_window/cherry/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_RED_2_PARA = registerBlock("framed_window/cherry/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_RED_2_CORNER = registerBlock("framed_window/cherry/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_RED_3 = registerBlock("framed_window/cherry/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_RED_4 = registerBlock("framed_window/cherry/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_ORANGE_1 = registerBlock("framed_window/cherry/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_ORANGE_2_PARA = registerBlock("framed_window/cherry/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_ORANGE_2_CORNER = registerBlock("framed_window/cherry/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_ORANGE_3 = registerBlock("framed_window/cherry/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_ORANGE_4 = registerBlock("framed_window/cherry/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_YELLOW_1 = registerBlock("framed_window/cherry/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_YELLOW_2_PARA = registerBlock("framed_window/cherry/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_YELLOW_2_CORNER = registerBlock("framed_window/cherry/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_YELLOW_3 = registerBlock("framed_window/cherry/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_YELLOW_4 = registerBlock("framed_window/cherry/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIME_1 = registerBlock("framed_window/cherry/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIME_2_PARA = registerBlock("framed_window/cherry/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIME_2_CORNER = registerBlock("framed_window/cherry/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIME_3 = registerBlock("framed_window/cherry/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIME_4 = registerBlock("framed_window/cherry/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GREEN_1 = registerBlock("framed_window/cherry/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GREEN_2_PARA = registerBlock("framed_window/cherry/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GREEN_2_CORNER = registerBlock("framed_window/cherry/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GREEN_3 = registerBlock("framed_window/cherry/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GREEN_4 = registerBlock("framed_window/cherry/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CYAN_1 = registerBlock("framed_window/cherry/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CYAN_2_PARA = registerBlock("framed_window/cherry/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CYAN_2_CORNER = registerBlock("framed_window/cherry/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CYAN_3 = registerBlock("framed_window/cherry/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CYAN_4 = registerBlock("framed_window/cherry/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_BLUE_1 = registerBlock("framed_window/cherry/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_BLUE_2_PARA = registerBlock("framed_window/cherry/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/cherry/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_BLUE_3 = registerBlock("framed_window/cherry/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_BLUE_4 = registerBlock("framed_window/cherry/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLUE_1 = registerBlock("framed_window/cherry/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLUE_2_PARA = registerBlock("framed_window/cherry/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLUE_2_CORNER = registerBlock("framed_window/cherry/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLUE_3 = registerBlock("framed_window/cherry/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLUE_4 = registerBlock("framed_window/cherry/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PURPLE_1 = registerBlock("framed_window/cherry/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PURPLE_2_PARA = registerBlock("framed_window/cherry/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PURPLE_2_CORNER = registerBlock("framed_window/cherry/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PURPLE_3 = registerBlock("framed_window/cherry/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PURPLE_4 = registerBlock("framed_window/cherry/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_MAGENTA_1 = registerBlock("framed_window/cherry/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_MAGENTA_2_PARA = registerBlock("framed_window/cherry/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_MAGENTA_2_CORNER = registerBlock("framed_window/cherry/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_MAGENTA_3 = registerBlock("framed_window/cherry/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_MAGENTA_4 = registerBlock("framed_window/cherry/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PINK_1 = registerBlock("framed_window/cherry/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PINK_2_PARA = registerBlock("framed_window/cherry/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PINK_2_CORNER = registerBlock("framed_window/cherry/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PINK_3 = registerBlock("framed_window/cherry/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_PINK_4 = registerBlock("framed_window/cherry/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_WHITE_1 = registerBlock("framed_window/cherry/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_WHITE_2_PARA = registerBlock("framed_window/cherry/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_WHITE_2_CORNER = registerBlock("framed_window/cherry/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_WHITE_3 = registerBlock("framed_window/cherry/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_WHITE_4 = registerBlock("framed_window/cherry/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_GRAY_1 = registerBlock("framed_window/cherry/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_GRAY_2_PARA = registerBlock("framed_window/cherry/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/cherry/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_GRAY_3 = registerBlock("framed_window/cherry/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_LIGHT_GRAY_4 = registerBlock("framed_window/cherry/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GRAY_1 = registerBlock("framed_window/cherry/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GRAY_2_PARA = registerBlock("framed_window/cherry/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GRAY_2_CORNER = registerBlock("framed_window/cherry/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GRAY_3 = registerBlock("framed_window/cherry/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_GRAY_4 = registerBlock("framed_window/cherry/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLACK_1 = registerBlock("framed_window/cherry/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLACK_2_PARA = registerBlock("framed_window/cherry/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLACK_2_CORNER = registerBlock("framed_window/cherry/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLACK_3 = registerBlock("framed_window/cherry/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BLACK_4 = registerBlock("framed_window/cherry/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BROWN_1 = registerBlock("framed_window/cherry/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BROWN_2_PARA = registerBlock("framed_window/cherry/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BROWN_2_CORNER = registerBlock("framed_window/cherry/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BROWN_3 = registerBlock("framed_window/cherry/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_BROWN_4 = registerBlock("framed_window/cherry/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Oak
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_1 = registerBlock("framed_window/oak/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_2_PARA = registerBlock("framed_window/oak/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_2_CORNER = registerBlock("framed_window/oak/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_3 = registerBlock("framed_window/oak/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_4 = registerBlock("framed_window/oak/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_RED_1 = registerBlock("framed_window/oak/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_RED_2_PARA = registerBlock("framed_window/oak/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_RED_2_CORNER = registerBlock("framed_window/oak/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_RED_3 = registerBlock("framed_window/oak/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_RED_4 = registerBlock("framed_window/oak/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_ORANGE_1 = registerBlock("framed_window/oak/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_ORANGE_2_PARA = registerBlock("framed_window/oak/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_ORANGE_2_CORNER = registerBlock("framed_window/oak/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_ORANGE_3 = registerBlock("framed_window/oak/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_ORANGE_4 = registerBlock("framed_window/oak/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_YELLOW_1 = registerBlock("framed_window/oak/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_YELLOW_2_PARA = registerBlock("framed_window/oak/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_YELLOW_2_CORNER = registerBlock("framed_window/oak/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_YELLOW_3 = registerBlock("framed_window/oak/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_YELLOW_4 = registerBlock("framed_window/oak/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIME_1 = registerBlock("framed_window/oak/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIME_2_PARA = registerBlock("framed_window/oak/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIME_2_CORNER = registerBlock("framed_window/oak/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIME_3 = registerBlock("framed_window/oak/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIME_4 = registerBlock("framed_window/oak/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GREEN_1 = registerBlock("framed_window/oak/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GREEN_2_PARA = registerBlock("framed_window/oak/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GREEN_2_CORNER = registerBlock("framed_window/oak/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GREEN_3 = registerBlock("framed_window/oak/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GREEN_4 = registerBlock("framed_window/oak/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CYAN_1 = registerBlock("framed_window/oak/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CYAN_2_PARA = registerBlock("framed_window/oak/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CYAN_2_CORNER = registerBlock("framed_window/oak/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CYAN_3 = registerBlock("framed_window/oak/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CYAN_4 = registerBlock("framed_window/oak/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_BLUE_1 = registerBlock("framed_window/oak/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_BLUE_2_PARA = registerBlock("framed_window/oak/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/oak/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_BLUE_3 = registerBlock("framed_window/oak/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_BLUE_4 = registerBlock("framed_window/oak/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLUE_1 = registerBlock("framed_window/oak/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLUE_2_PARA = registerBlock("framed_window/oak/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLUE_2_CORNER = registerBlock("framed_window/oak/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLUE_3 = registerBlock("framed_window/oak/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLUE_4 = registerBlock("framed_window/oak/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PURPLE_1 = registerBlock("framed_window/oak/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PURPLE_2_PARA = registerBlock("framed_window/oak/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PURPLE_2_CORNER = registerBlock("framed_window/oak/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PURPLE_3 = registerBlock("framed_window/oak/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PURPLE_4 = registerBlock("framed_window/oak/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_MAGENTA_1 = registerBlock("framed_window/oak/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_MAGENTA_2_PARA = registerBlock("framed_window/oak/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_MAGENTA_2_CORNER = registerBlock("framed_window/oak/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_MAGENTA_3 = registerBlock("framed_window/oak/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_MAGENTA_4 = registerBlock("framed_window/oak/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PINK_1 = registerBlock("framed_window/oak/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PINK_2_PARA = registerBlock("framed_window/oak/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PINK_2_CORNER = registerBlock("framed_window/oak/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PINK_3 = registerBlock("framed_window/oak/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_PINK_4 = registerBlock("framed_window/oak/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_WHITE_1 = registerBlock("framed_window/oak/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_WHITE_2_PARA = registerBlock("framed_window/oak/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_WHITE_2_CORNER = registerBlock("framed_window/oak/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_WHITE_3 = registerBlock("framed_window/oak/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_WHITE_4 = registerBlock("framed_window/oak/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_GRAY_1 = registerBlock("framed_window/oak/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_GRAY_2_PARA = registerBlock("framed_window/oak/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/oak/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_GRAY_3 = registerBlock("framed_window/oak/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_LIGHT_GRAY_4 = registerBlock("framed_window/oak/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GRAY_1 = registerBlock("framed_window/oak/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GRAY_2_PARA = registerBlock("framed_window/oak/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GRAY_2_CORNER = registerBlock("framed_window/oak/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GRAY_3 = registerBlock("framed_window/oak/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_GRAY_4 = registerBlock("framed_window/oak/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLACK_1 = registerBlock("framed_window/oak/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLACK_2_PARA = registerBlock("framed_window/oak/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLACK_2_CORNER = registerBlock("framed_window/oak/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLACK_3 = registerBlock("framed_window/oak/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BLACK_4 = registerBlock("framed_window/oak/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BROWN_1 = registerBlock("framed_window/oak/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BROWN_2_PARA = registerBlock("framed_window/oak/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BROWN_2_CORNER = registerBlock("framed_window/oak/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BROWN_3 = registerBlock("framed_window/oak/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_BROWN_4 = registerBlock("framed_window/oak/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Spruce
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_1 = registerBlock("framed_window/spruce/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA = registerBlock("framed_window/spruce/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER = registerBlock("framed_window/spruce/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_3 = registerBlock("framed_window/spruce/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_4 = registerBlock("framed_window/spruce/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_RED_1 = registerBlock("framed_window/spruce/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_RED_2_PARA = registerBlock("framed_window/spruce/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_RED_2_CORNER = registerBlock("framed_window/spruce/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_RED_3 = registerBlock("framed_window/spruce/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_RED_4 = registerBlock("framed_window/spruce/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_ORANGE_1 = registerBlock("framed_window/spruce/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_ORANGE_2_PARA = registerBlock("framed_window/spruce/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_ORANGE_2_CORNER = registerBlock("framed_window/spruce/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_ORANGE_3 = registerBlock("framed_window/spruce/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_ORANGE_4 = registerBlock("framed_window/spruce/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_YELLOW_1 = registerBlock("framed_window/spruce/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_YELLOW_2_PARA = registerBlock("framed_window/spruce/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_YELLOW_2_CORNER = registerBlock("framed_window/spruce/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_YELLOW_3 = registerBlock("framed_window/spruce/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_YELLOW_4 = registerBlock("framed_window/spruce/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIME_1 = registerBlock("framed_window/spruce/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIME_2_PARA = registerBlock("framed_window/spruce/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIME_2_CORNER = registerBlock("framed_window/spruce/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIME_3 = registerBlock("framed_window/spruce/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIME_4 = registerBlock("framed_window/spruce/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GREEN_1 = registerBlock("framed_window/spruce/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GREEN_2_PARA = registerBlock("framed_window/spruce/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GREEN_2_CORNER = registerBlock("framed_window/spruce/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GREEN_3 = registerBlock("framed_window/spruce/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GREEN_4 = registerBlock("framed_window/spruce/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CYAN_1 = registerBlock("framed_window/spruce/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CYAN_2_PARA = registerBlock("framed_window/spruce/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CYAN_2_CORNER = registerBlock("framed_window/spruce/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CYAN_3 = registerBlock("framed_window/spruce/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CYAN_4 = registerBlock("framed_window/spruce/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_1 = registerBlock("framed_window/spruce/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_2_PARA = registerBlock("framed_window/spruce/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/spruce/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_3 = registerBlock("framed_window/spruce/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_BLUE_4 = registerBlock("framed_window/spruce/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLUE_1 = registerBlock("framed_window/spruce/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLUE_2_PARA = registerBlock("framed_window/spruce/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLUE_2_CORNER = registerBlock("framed_window/spruce/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLUE_3 = registerBlock("framed_window/spruce/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLUE_4 = registerBlock("framed_window/spruce/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PURPLE_1 = registerBlock("framed_window/spruce/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PURPLE_2_PARA = registerBlock("framed_window/spruce/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PURPLE_2_CORNER = registerBlock("framed_window/spruce/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PURPLE_3 = registerBlock("framed_window/spruce/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PURPLE_4 = registerBlock("framed_window/spruce/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_MAGENTA_1 = registerBlock("framed_window/spruce/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_MAGENTA_2_PARA = registerBlock("framed_window/spruce/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_MAGENTA_2_CORNER = registerBlock("framed_window/spruce/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_MAGENTA_3 = registerBlock("framed_window/spruce/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_MAGENTA_4 = registerBlock("framed_window/spruce/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PINK_1 = registerBlock("framed_window/spruce/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PINK_2_PARA = registerBlock("framed_window/spruce/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PINK_2_CORNER = registerBlock("framed_window/spruce/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PINK_3 = registerBlock("framed_window/spruce/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_PINK_4 = registerBlock("framed_window/spruce/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_WHITE_1 = registerBlock("framed_window/spruce/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_WHITE_2_PARA = registerBlock("framed_window/spruce/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_WHITE_2_CORNER = registerBlock("framed_window/spruce/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_WHITE_3 = registerBlock("framed_window/spruce/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_WHITE_4 = registerBlock("framed_window/spruce/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_1 = registerBlock("framed_window/spruce/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_2_PARA = registerBlock("framed_window/spruce/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/spruce/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_3 = registerBlock("framed_window/spruce/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_LIGHT_GRAY_4 = registerBlock("framed_window/spruce/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GRAY_1 = registerBlock("framed_window/spruce/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GRAY_2_PARA = registerBlock("framed_window/spruce/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GRAY_2_CORNER = registerBlock("framed_window/spruce/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GRAY_3 = registerBlock("framed_window/spruce/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_GRAY_4 = registerBlock("framed_window/spruce/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLACK_1 = registerBlock("framed_window/spruce/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLACK_2_PARA = registerBlock("framed_window/spruce/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLACK_2_CORNER = registerBlock("framed_window/spruce/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLACK_3 = registerBlock("framed_window/spruce/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BLACK_4 = registerBlock("framed_window/spruce/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BROWN_1 = registerBlock("framed_window/spruce/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BROWN_2_PARA = registerBlock("framed_window/spruce/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BROWN_2_CORNER = registerBlock("framed_window/spruce/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BROWN_3 = registerBlock("framed_window/spruce/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_BROWN_4 = registerBlock("framed_window/spruce/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Birch
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_1 = registerBlock("framed_window/birch/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_2_PARA = registerBlock("framed_window/birch/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER = registerBlock("framed_window/birch/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_3 = registerBlock("framed_window/birch/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_4 = registerBlock("framed_window/birch/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_RED_1 = registerBlock("framed_window/birch/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_RED_2_PARA = registerBlock("framed_window/birch/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_RED_2_CORNER = registerBlock("framed_window/birch/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_RED_3 = registerBlock("framed_window/birch/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_RED_4 = registerBlock("framed_window/birch/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_ORANGE_1 = registerBlock("framed_window/birch/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_ORANGE_2_PARA = registerBlock("framed_window/birch/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_ORANGE_2_CORNER = registerBlock("framed_window/birch/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_ORANGE_3 = registerBlock("framed_window/birch/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_ORANGE_4 = registerBlock("framed_window/birch/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_YELLOW_1 = registerBlock("framed_window/birch/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_YELLOW_2_PARA = registerBlock("framed_window/birch/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_YELLOW_2_CORNER = registerBlock("framed_window/birch/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_YELLOW_3 = registerBlock("framed_window/birch/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_YELLOW_4 = registerBlock("framed_window/birch/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIME_1 = registerBlock("framed_window/birch/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIME_2_PARA = registerBlock("framed_window/birch/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIME_2_CORNER = registerBlock("framed_window/birch/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIME_3 = registerBlock("framed_window/birch/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIME_4 = registerBlock("framed_window/birch/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GREEN_1 = registerBlock("framed_window/birch/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GREEN_2_PARA = registerBlock("framed_window/birch/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GREEN_2_CORNER = registerBlock("framed_window/birch/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GREEN_3 = registerBlock("framed_window/birch/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GREEN_4 = registerBlock("framed_window/birch/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CYAN_1 = registerBlock("framed_window/birch/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CYAN_2_PARA = registerBlock("framed_window/birch/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CYAN_2_CORNER = registerBlock("framed_window/birch/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CYAN_3 = registerBlock("framed_window/birch/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CYAN_4 = registerBlock("framed_window/birch/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_BLUE_1 = registerBlock("framed_window/birch/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_BLUE_2_PARA = registerBlock("framed_window/birch/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/birch/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_BLUE_3 = registerBlock("framed_window/birch/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_BLUE_4 = registerBlock("framed_window/birch/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLUE_1 = registerBlock("framed_window/birch/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLUE_2_PARA = registerBlock("framed_window/birch/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLUE_2_CORNER = registerBlock("framed_window/birch/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLUE_3 = registerBlock("framed_window/birch/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLUE_4 = registerBlock("framed_window/birch/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PURPLE_1 = registerBlock("framed_window/birch/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PURPLE_2_PARA = registerBlock("framed_window/birch/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PURPLE_2_CORNER = registerBlock("framed_window/birch/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PURPLE_3 = registerBlock("framed_window/birch/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PURPLE_4 = registerBlock("framed_window/birch/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_MAGENTA_1 = registerBlock("framed_window/birch/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_MAGENTA_2_PARA = registerBlock("framed_window/birch/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_MAGENTA_2_CORNER = registerBlock("framed_window/birch/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_MAGENTA_3 = registerBlock("framed_window/birch/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_MAGENTA_4 = registerBlock("framed_window/birch/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PINK_1 = registerBlock("framed_window/birch/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PINK_2_PARA = registerBlock("framed_window/birch/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PINK_2_CORNER = registerBlock("framed_window/birch/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PINK_3 = registerBlock("framed_window/birch/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_PINK_4 = registerBlock("framed_window/birch/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_WHITE_1 = registerBlock("framed_window/birch/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_WHITE_2_PARA = registerBlock("framed_window/birch/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_WHITE_2_CORNER = registerBlock("framed_window/birch/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_WHITE_3 = registerBlock("framed_window/birch/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_WHITE_4 = registerBlock("framed_window/birch/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_GRAY_1 = registerBlock("framed_window/birch/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_GRAY_2_PARA = registerBlock("framed_window/birch/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/birch/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_GRAY_3 = registerBlock("framed_window/birch/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_LIGHT_GRAY_4 = registerBlock("framed_window/birch/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GRAY_1 = registerBlock("framed_window/birch/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GRAY_2_PARA = registerBlock("framed_window/birch/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GRAY_2_CORNER = registerBlock("framed_window/birch/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GRAY_3 = registerBlock("framed_window/birch/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_GRAY_4 = registerBlock("framed_window/birch/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLACK_1 = registerBlock("framed_window/birch/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLACK_2_PARA = registerBlock("framed_window/birch/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLACK_2_CORNER = registerBlock("framed_window/birch/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLACK_3 = registerBlock("framed_window/birch/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BLACK_4 = registerBlock("framed_window/birch/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BROWN_1 = registerBlock("framed_window/birch/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BROWN_2_PARA = registerBlock("framed_window/birch/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BROWN_2_CORNER = registerBlock("framed_window/birch/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BROWN_3 = registerBlock("framed_window/birch/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_BROWN_4 = registerBlock("framed_window/birch/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    // Jungle
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_1 = registerBlock("framed_window/jungle/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA = registerBlock("framed_window/jungle/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER = registerBlock("framed_window/jungle/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_3 = registerBlock("framed_window/jungle/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_4 = registerBlock("framed_window/jungle/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_RED_1 = registerBlock("framed_window/jungle/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_RED_2_PARA = registerBlock("framed_window/jungle/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_RED_2_CORNER = registerBlock("framed_window/jungle/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_RED_3 = registerBlock("framed_window/jungle/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_RED_4 = registerBlock("framed_window/jungle/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_ORANGE_1 = registerBlock("framed_window/jungle/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_ORANGE_2_PARA = registerBlock("framed_window/jungle/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_ORANGE_2_CORNER = registerBlock("framed_window/jungle/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_ORANGE_3 = registerBlock("framed_window/jungle/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_ORANGE_4 = registerBlock("framed_window/jungle/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_YELLOW_1 = registerBlock("framed_window/jungle/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_YELLOW_2_PARA = registerBlock("framed_window/jungle/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_YELLOW_2_CORNER = registerBlock("framed_window/jungle/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_YELLOW_3 = registerBlock("framed_window/jungle/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_YELLOW_4 = registerBlock("framed_window/jungle/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIME_1 = registerBlock("framed_window/jungle/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIME_2_PARA = registerBlock("framed_window/jungle/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIME_2_CORNER = registerBlock("framed_window/jungle/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIME_3 = registerBlock("framed_window/jungle/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIME_4 = registerBlock("framed_window/jungle/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GREEN_1 = registerBlock("framed_window/jungle/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GREEN_2_PARA = registerBlock("framed_window/jungle/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GREEN_2_CORNER = registerBlock("framed_window/jungle/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GREEN_3 = registerBlock("framed_window/jungle/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GREEN_4 = registerBlock("framed_window/jungle/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CYAN_1 = registerBlock("framed_window/jungle/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CYAN_2_PARA = registerBlock("framed_window/jungle/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CYAN_2_CORNER = registerBlock("framed_window/jungle/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CYAN_3 = registerBlock("framed_window/jungle/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CYAN_4 = registerBlock("framed_window/jungle/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_1 = registerBlock("framed_window/jungle/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_2_PARA = registerBlock("framed_window/jungle/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/jungle/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_3 = registerBlock("framed_window/jungle/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_BLUE_4 = registerBlock("framed_window/jungle/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLUE_1 = registerBlock("framed_window/jungle/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLUE_2_PARA = registerBlock("framed_window/jungle/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLUE_2_CORNER = registerBlock("framed_window/jungle/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLUE_3 = registerBlock("framed_window/jungle/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLUE_4 = registerBlock("framed_window/jungle/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PURPLE_1 = registerBlock("framed_window/jungle/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PURPLE_2_PARA = registerBlock("framed_window/jungle/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PURPLE_2_CORNER = registerBlock("framed_window/jungle/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PURPLE_3 = registerBlock("framed_window/jungle/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PURPLE_4 = registerBlock("framed_window/jungle/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_MAGENTA_1 = registerBlock("framed_window/jungle/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_MAGENTA_2_PARA = registerBlock("framed_window/jungle/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_MAGENTA_2_CORNER = registerBlock("framed_window/jungle/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_MAGENTA_3 = registerBlock("framed_window/jungle/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_MAGENTA_4 = registerBlock("framed_window/jungle/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PINK_1 = registerBlock("framed_window/jungle/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PINK_2_PARA = registerBlock("framed_window/jungle/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PINK_2_CORNER = registerBlock("framed_window/jungle/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PINK_3 = registerBlock("framed_window/jungle/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_PINK_4 = registerBlock("framed_window/jungle/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_WHITE_1 = registerBlock("framed_window/jungle/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_WHITE_2_PARA = registerBlock("framed_window/jungle/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_WHITE_2_CORNER = registerBlock("framed_window/jungle/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_WHITE_3 = registerBlock("framed_window/jungle/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_WHITE_4 = registerBlock("framed_window/jungle/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_1 = registerBlock("framed_window/jungle/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_2_PARA = registerBlock("framed_window/jungle/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/jungle/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_3 = registerBlock("framed_window/jungle/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_LIGHT_GRAY_4 = registerBlock("framed_window/jungle/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GRAY_1 = registerBlock("framed_window/jungle/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GRAY_2_PARA = registerBlock("framed_window/jungle/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GRAY_2_CORNER = registerBlock("framed_window/jungle/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GRAY_3 = registerBlock("framed_window/jungle/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_GRAY_4 = registerBlock("framed_window/jungle/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLACK_1 = registerBlock("framed_window/jungle/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLACK_2_PARA = registerBlock("framed_window/jungle/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLACK_2_CORNER = registerBlock("framed_window/jungle/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLACK_3 = registerBlock("framed_window/jungle/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BLACK_4 = registerBlock("framed_window/jungle/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BROWN_1 = registerBlock("framed_window/jungle/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BROWN_2_PARA = registerBlock("framed_window/jungle/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BROWN_2_CORNER = registerBlock("framed_window/jungle/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BROWN_3 = registerBlock("framed_window/jungle/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_BROWN_4 = registerBlock("framed_window/jungle/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    

    // Dark Oak
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_1 = registerBlock("framed_window/dark_oak/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA = registerBlock("framed_window/dark_oak/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER = registerBlock("framed_window/dark_oak/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_3 = registerBlock("framed_window/dark_oak/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_4 = registerBlock("framed_window/dark_oak/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_RED_1 = registerBlock("framed_window/dark_oak/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_RED_2_PARA = registerBlock("framed_window/dark_oak/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_RED_2_CORNER = registerBlock("framed_window/dark_oak/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_RED_3 = registerBlock("framed_window/dark_oak/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_RED_4 = registerBlock("framed_window/dark_oak/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_ORANGE_1 = registerBlock("framed_window/dark_oak/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_ORANGE_2_PARA = registerBlock("framed_window/dark_oak/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_ORANGE_2_CORNER = registerBlock("framed_window/dark_oak/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_ORANGE_3 = registerBlock("framed_window/dark_oak/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_ORANGE_4 = registerBlock("framed_window/dark_oak/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_YELLOW_1 = registerBlock("framed_window/dark_oak/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_YELLOW_2_PARA = registerBlock("framed_window/dark_oak/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_YELLOW_2_CORNER = registerBlock("framed_window/dark_oak/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_YELLOW_3 = registerBlock("framed_window/dark_oak/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_YELLOW_4 = registerBlock("framed_window/dark_oak/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIME_1 = registerBlock("framed_window/dark_oak/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIME_2_PARA = registerBlock("framed_window/dark_oak/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIME_2_CORNER = registerBlock("framed_window/dark_oak/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIME_3 = registerBlock("framed_window/dark_oak/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIME_4 = registerBlock("framed_window/dark_oak/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GREEN_1 = registerBlock("framed_window/dark_oak/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GREEN_2_PARA = registerBlock("framed_window/dark_oak/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GREEN_2_CORNER = registerBlock("framed_window/dark_oak/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GREEN_3 = registerBlock("framed_window/dark_oak/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GREEN_4 = registerBlock("framed_window/dark_oak/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CYAN_1 = registerBlock("framed_window/dark_oak/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CYAN_2_PARA = registerBlock("framed_window/dark_oak/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CYAN_2_CORNER = registerBlock("framed_window/dark_oak/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CYAN_3 = registerBlock("framed_window/dark_oak/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CYAN_4 = registerBlock("framed_window/dark_oak/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_1 = registerBlock("framed_window/dark_oak/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_2_PARA = registerBlock("framed_window/dark_oak/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/dark_oak/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_3 = registerBlock("framed_window/dark_oak/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_BLUE_4 = registerBlock("framed_window/dark_oak/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLUE_1 = registerBlock("framed_window/dark_oak/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLUE_2_PARA = registerBlock("framed_window/dark_oak/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLUE_2_CORNER = registerBlock("framed_window/dark_oak/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLUE_3 = registerBlock("framed_window/dark_oak/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLUE_4 = registerBlock("framed_window/dark_oak/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PURPLE_1 = registerBlock("framed_window/dark_oak/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PURPLE_2_PARA = registerBlock("framed_window/dark_oak/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PURPLE_2_CORNER = registerBlock("framed_window/dark_oak/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PURPLE_3 = registerBlock("framed_window/dark_oak/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PURPLE_4 = registerBlock("framed_window/dark_oak/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_MAGENTA_1 = registerBlock("framed_window/dark_oak/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_MAGENTA_2_PARA = registerBlock("framed_window/dark_oak/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_MAGENTA_2_CORNER = registerBlock("framed_window/dark_oak/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_MAGENTA_3 = registerBlock("framed_window/dark_oak/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_MAGENTA_4 = registerBlock("framed_window/dark_oak/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PINK_1 = registerBlock("framed_window/dark_oak/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PINK_2_PARA = registerBlock("framed_window/dark_oak/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PINK_2_CORNER = registerBlock("framed_window/dark_oak/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PINK_3 = registerBlock("framed_window/dark_oak/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_PINK_4 = registerBlock("framed_window/dark_oak/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_WHITE_1 = registerBlock("framed_window/dark_oak/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_WHITE_2_PARA = registerBlock("framed_window/dark_oak/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_WHITE_2_CORNER = registerBlock("framed_window/dark_oak/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_WHITE_3 = registerBlock("framed_window/dark_oak/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_WHITE_4 = registerBlock("framed_window/dark_oak/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_1 = registerBlock("framed_window/dark_oak/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_2_PARA = registerBlock("framed_window/dark_oak/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/dark_oak/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_3 = registerBlock("framed_window/dark_oak/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_LIGHT_GRAY_4 = registerBlock("framed_window/dark_oak/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GRAY_1 = registerBlock("framed_window/dark_oak/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GRAY_2_PARA = registerBlock("framed_window/dark_oak/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GRAY_2_CORNER = registerBlock("framed_window/dark_oak/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GRAY_3 = registerBlock("framed_window/dark_oak/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_GRAY_4 = registerBlock("framed_window/dark_oak/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLACK_1 = registerBlock("framed_window/dark_oak/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLACK_2_PARA = registerBlock("framed_window/dark_oak/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLACK_2_CORNER = registerBlock("framed_window/dark_oak/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLACK_3 = registerBlock("framed_window/dark_oak/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BLACK_4 = registerBlock("framed_window/dark_oak/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BROWN_1 = registerBlock("framed_window/dark_oak/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BROWN_2_PARA = registerBlock("framed_window/dark_oak/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BROWN_2_CORNER = registerBlock("framed_window/dark_oak/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BROWN_3 = registerBlock("framed_window/dark_oak/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_BROWN_4 = registerBlock("framed_window/dark_oak/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));    
    

    // Crimson
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_1 = registerBlock("framed_window/crimson/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA = registerBlock("framed_window/crimson/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER = registerBlock("framed_window/crimson/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_3 = registerBlock("framed_window/crimson/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_4 = registerBlock("framed_window/crimson/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_RED_1 = registerBlock("framed_window/crimson/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_RED_2_PARA = registerBlock("framed_window/crimson/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_RED_2_CORNER = registerBlock("framed_window/crimson/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_RED_3 = registerBlock("framed_window/crimson/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_RED_4 = registerBlock("framed_window/crimson/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_ORANGE_1 = registerBlock("framed_window/crimson/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_ORANGE_2_PARA = registerBlock("framed_window/crimson/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_ORANGE_2_CORNER = registerBlock("framed_window/crimson/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_ORANGE_3 = registerBlock("framed_window/crimson/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_ORANGE_4 = registerBlock("framed_window/crimson/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_YELLOW_1 = registerBlock("framed_window/crimson/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_YELLOW_2_PARA = registerBlock("framed_window/crimson/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_YELLOW_2_CORNER = registerBlock("framed_window/crimson/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_YELLOW_3 = registerBlock("framed_window/crimson/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_YELLOW_4 = registerBlock("framed_window/crimson/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIME_1 = registerBlock("framed_window/crimson/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIME_2_PARA = registerBlock("framed_window/crimson/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIME_2_CORNER = registerBlock("framed_window/crimson/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIME_3 = registerBlock("framed_window/crimson/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIME_4 = registerBlock("framed_window/crimson/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GREEN_1 = registerBlock("framed_window/crimson/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GREEN_2_PARA = registerBlock("framed_window/crimson/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GREEN_2_CORNER = registerBlock("framed_window/crimson/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GREEN_3 = registerBlock("framed_window/crimson/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GREEN_4 = registerBlock("framed_window/crimson/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CYAN_1 = registerBlock("framed_window/crimson/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CYAN_2_PARA = registerBlock("framed_window/crimson/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CYAN_2_CORNER = registerBlock("framed_window/crimson/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CYAN_3 = registerBlock("framed_window/crimson/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CYAN_4 = registerBlock("framed_window/crimson/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_1 = registerBlock("framed_window/crimson/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_2_PARA = registerBlock("framed_window/crimson/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/crimson/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_3 = registerBlock("framed_window/crimson/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_BLUE_4 = registerBlock("framed_window/crimson/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLUE_1 = registerBlock("framed_window/crimson/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLUE_2_PARA = registerBlock("framed_window/crimson/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLUE_2_CORNER = registerBlock("framed_window/crimson/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLUE_3 = registerBlock("framed_window/crimson/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLUE_4 = registerBlock("framed_window/crimson/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PURPLE_1 = registerBlock("framed_window/crimson/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PURPLE_2_PARA = registerBlock("framed_window/crimson/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PURPLE_2_CORNER = registerBlock("framed_window/crimson/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PURPLE_3 = registerBlock("framed_window/crimson/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PURPLE_4 = registerBlock("framed_window/crimson/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_MAGENTA_1 = registerBlock("framed_window/crimson/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_MAGENTA_2_PARA = registerBlock("framed_window/crimson/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_MAGENTA_2_CORNER = registerBlock("framed_window/crimson/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_MAGENTA_3 = registerBlock("framed_window/crimson/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_MAGENTA_4 = registerBlock("framed_window/crimson/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PINK_1 = registerBlock("framed_window/crimson/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PINK_2_PARA = registerBlock("framed_window/crimson/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PINK_2_CORNER = registerBlock("framed_window/crimson/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PINK_3 = registerBlock("framed_window/crimson/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_PINK_4 = registerBlock("framed_window/crimson/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_WHITE_1 = registerBlock("framed_window/crimson/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_WHITE_2_PARA = registerBlock("framed_window/crimson/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_WHITE_2_CORNER = registerBlock("framed_window/crimson/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_WHITE_3 = registerBlock("framed_window/crimson/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_WHITE_4 = registerBlock("framed_window/crimson/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_1 = registerBlock("framed_window/crimson/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_2_PARA = registerBlock("framed_window/crimson/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/crimson/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_3 = registerBlock("framed_window/crimson/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_LIGHT_GRAY_4 = registerBlock("framed_window/crimson/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GRAY_1 = registerBlock("framed_window/crimson/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GRAY_2_PARA = registerBlock("framed_window/crimson/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GRAY_2_CORNER = registerBlock("framed_window/crimson/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GRAY_3 = registerBlock("framed_window/crimson/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_GRAY_4 = registerBlock("framed_window/crimson/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLACK_1 = registerBlock("framed_window/crimson/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLACK_2_PARA = registerBlock("framed_window/crimson/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLACK_2_CORNER = registerBlock("framed_window/crimson/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLACK_3 = registerBlock("framed_window/crimson/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BLACK_4 = registerBlock("framed_window/crimson/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BROWN_1 = registerBlock("framed_window/crimson/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BROWN_2_PARA = registerBlock("framed_window/crimson/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BROWN_2_CORNER = registerBlock("framed_window/crimson/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BROWN_3 = registerBlock("framed_window/crimson/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_BROWN_4 = registerBlock("framed_window/crimson/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    

    // Warped
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_1 = registerBlock("framed_window/warped/clear/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_2_PARA = registerBlock("framed_window/warped/clear/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_2_CORNER = registerBlock("framed_window/warped/clear/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_3 = registerBlock("framed_window/warped/clear/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_4 = registerBlock("framed_window/warped/clear/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_RED_1 = registerBlock("framed_window/warped/red/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_RED_2_PARA = registerBlock("framed_window/warped/red/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_RED_2_CORNER = registerBlock("framed_window/warped/red/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_RED_3 = registerBlock("framed_window/warped/red/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_RED_4 = registerBlock("framed_window/warped/red/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_ORANGE_1 = registerBlock("framed_window/warped/orange/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_ORANGE_2_PARA = registerBlock("framed_window/warped/orange/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_ORANGE_2_CORNER = registerBlock("framed_window/warped/orange/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_ORANGE_3 = registerBlock("framed_window/warped/orange/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_ORANGE_4 = registerBlock("framed_window/warped/orange/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_YELLOW_1 = registerBlock("framed_window/warped/yellow/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_YELLOW_2_PARA = registerBlock("framed_window/warped/yellow/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_YELLOW_2_CORNER = registerBlock("framed_window/warped/yellow/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_YELLOW_3 = registerBlock("framed_window/warped/yellow/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_YELLOW_4 = registerBlock("framed_window/warped/yellow/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIME_1 = registerBlock("framed_window/warped/lime/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIME_2_PARA = registerBlock("framed_window/warped/lime/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIME_2_CORNER = registerBlock("framed_window/warped/lime/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIME_3 = registerBlock("framed_window/warped/lime/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIME_4 = registerBlock("framed_window/warped/lime/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GREEN_1 = registerBlock("framed_window/warped/green/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GREEN_2_PARA = registerBlock("framed_window/warped/green/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GREEN_2_CORNER = registerBlock("framed_window/warped/green/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GREEN_3 = registerBlock("framed_window/warped/green/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GREEN_4 = registerBlock("framed_window/warped/green/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CYAN_1 = registerBlock("framed_window/warped/cyan/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CYAN_2_PARA = registerBlock("framed_window/warped/cyan/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CYAN_2_CORNER = registerBlock("framed_window/warped/cyan/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CYAN_3 = registerBlock("framed_window/warped/cyan/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CYAN_4 = registerBlock("framed_window/warped/cyan/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_BLUE_1 = registerBlock("framed_window/warped/light_blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_BLUE_2_PARA = registerBlock("framed_window/warped/light_blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_BLUE_2_CORNER = registerBlock("framed_window/warped/light_blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_BLUE_3 = registerBlock("framed_window/warped/light_blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_BLUE_4 = registerBlock("framed_window/warped/light_blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLUE_1 = registerBlock("framed_window/warped/blue/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLUE_2_PARA = registerBlock("framed_window/warped/blue/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLUE_2_CORNER = registerBlock("framed_window/warped/blue/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLUE_3 = registerBlock("framed_window/warped/blue/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLUE_4 = registerBlock("framed_window/warped/blue/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PURPLE_1 = registerBlock("framed_window/warped/purple/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PURPLE_2_PARA = registerBlock("framed_window/warped/purple/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PURPLE_2_CORNER = registerBlock("framed_window/warped/purple/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PURPLE_3 = registerBlock("framed_window/warped/purple/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PURPLE_4 = registerBlock("framed_window/warped/purple/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_MAGENTA_1 = registerBlock("framed_window/warped/magenta/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_MAGENTA_2_PARA = registerBlock("framed_window/warped/magenta/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_MAGENTA_2_CORNER = registerBlock("framed_window/warped/magenta/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_MAGENTA_3 = registerBlock("framed_window/warped/magenta/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_MAGENTA_4 = registerBlock("framed_window/warped/magenta/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PINK_1 = registerBlock("framed_window/warped/pink/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PINK_2_PARA = registerBlock("framed_window/warped/pink/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PINK_2_CORNER = registerBlock("framed_window/warped/pink/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PINK_3 = registerBlock("framed_window/warped/pink/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_PINK_4 = registerBlock("framed_window/warped/pink/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_WHITE_1 = registerBlock("framed_window/warped/white/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_WHITE_2_PARA = registerBlock("framed_window/warped/white/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_WHITE_2_CORNER = registerBlock("framed_window/warped/white/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_WHITE_3 = registerBlock("framed_window/warped/white/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_WHITE_4 = registerBlock("framed_window/warped/white/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_GRAY_1 = registerBlock("framed_window/warped/light_gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_GRAY_2_PARA = registerBlock("framed_window/warped/light_gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_GRAY_2_CORNER = registerBlock("framed_window/warped/light_gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_GRAY_3 = registerBlock("framed_window/warped/light_gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_LIGHT_GRAY_4 = registerBlock("framed_window/warped/light_gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GRAY_1 = registerBlock("framed_window/warped/gray/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GRAY_2_PARA = registerBlock("framed_window/warped/gray/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GRAY_2_CORNER = registerBlock("framed_window/warped/gray/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GRAY_3 = registerBlock("framed_window/warped/gray/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_GRAY_4 = registerBlock("framed_window/warped/gray/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLACK_1 = registerBlock("framed_window/warped/black/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLACK_2_PARA = registerBlock("framed_window/warped/black/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLACK_2_CORNER = registerBlock("framed_window/warped/black/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLACK_3 = registerBlock("framed_window/warped/black/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BLACK_4 = registerBlock("framed_window/warped/black/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BROWN_1 = registerBlock("framed_window/warped/brown/1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BROWN_2_PARA = registerBlock("framed_window/warped/brown/2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BROWN_2_CORNER = registerBlock("framed_window/warped/brown/2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BROWN_3 = registerBlock("framed_window/warped/brown/3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_BROWN_4 = registerBlock("framed_window/warped/brown/4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
