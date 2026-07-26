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
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_1 = registerBlock("framed_window_mangrove_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA = registerBlock("framed_window_mangrove_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER = registerBlock("framed_window_mangrove_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_3 = registerBlock("framed_window_mangrove_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_4 = registerBlock("framed_window_mangrove_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Acacia
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_1 = registerBlock("framed_window_acacia_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_2_PARA = registerBlock("framed_window_acacia_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER = registerBlock("framed_window_acacia_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_3 = registerBlock("framed_window_acacia_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_ACACIA_CLEAR_4 = registerBlock("framed_window_acacia_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Cherry
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_1 = registerBlock("framed_window_cherry_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_2_PARA = registerBlock("framed_window_cherry_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER = registerBlock("framed_window_cherry_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_3 = registerBlock("framed_window_cherry_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CHERRY_CLEAR_4 = registerBlock("framed_window_cherry_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Oak
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_1 = registerBlock("framed_window_oak_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_2_PARA = registerBlock("framed_window_oak_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_2_CORNER = registerBlock("framed_window_oak_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_3 = registerBlock("framed_window_oak_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_OAK_CLEAR_4 = registerBlock("framed_window_oak_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Spruce
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_1 = registerBlock("framed_window_spruce_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA = registerBlock("framed_window_spruce_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER = registerBlock("framed_window_spruce_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_3 = registerBlock("framed_window_spruce_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_SPRUCE_CLEAR_4 = registerBlock("framed_window_spruce_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Birch
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_1 = registerBlock("framed_window_birch_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_2_PARA = registerBlock("framed_window_birch_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER = registerBlock("framed_window_birch_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_3 = registerBlock("framed_window_birch_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_BIRCH_CLEAR_4 = registerBlock("framed_window_birch_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Jungle
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_1 = registerBlock("framed_window_jungle_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA = registerBlock("framed_window_jungle_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER = registerBlock("framed_window_jungle_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_3 = registerBlock("framed_window_jungle_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_JUNGLE_CLEAR_4 = registerBlock("framed_window_jungle_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Dark Oak
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_1 = registerBlock("framed_window_dark_oak_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA = registerBlock("framed_window_dark_oak_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER = registerBlock("framed_window_dark_oak_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_3 = registerBlock("framed_window_dark_oak_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_DARK_OAK_CLEAR_4 = registerBlock("framed_window_dark_oak_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Crimson
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_1 = registerBlock("framed_window_crimson_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA = registerBlock("framed_window_crimson_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER = registerBlock("framed_window_crimson_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_3 = registerBlock("framed_window_crimson_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_CRIMSON_CLEAR_4 = registerBlock("framed_window_crimson_clear_4",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));

    // Warped
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_1 = registerBlock("framed_window_warped_clear_1",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_2_PARA = registerBlock("framed_window_warped_clear_2_para",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_2_CORNER = registerBlock("framed_window_warped_clear_2_corner",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_3 = registerBlock("framed_window_warped_clear_3",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_WARPED_CLEAR_4 = registerBlock("framed_window_warped_clear_4",
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
