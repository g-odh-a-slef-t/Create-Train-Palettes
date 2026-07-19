package net.g_odh_a_slef_t.trainpalettes.block;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.custom.ModFramedWindowBlock;
import net.g_odh_a_slef_t.trainpalettes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TrainPalettes.MODID);

    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_ALL = registerBlock("framed_window_mangrove_clear_all",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_U = registerBlock("framed_window_mangrove_clear_u",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_D = registerBlock("framed_window_mangrove_clear_d",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_L = registerBlock("framed_window_mangrove_clear_l",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_R = registerBlock("framed_window_mangrove_clear_r",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_UD = registerBlock("framed_window_mangrove_clear_ud",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_LR = registerBlock("framed_window_mangrove_clear_lr",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_UL = registerBlock("framed_window_mangrove_clear_ul",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_UR = registerBlock("framed_window_mangrove_clear_ur",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_DL = registerBlock("framed_window_mangrove_clear_dl",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_DR = registerBlock("framed_window_mangrove_clear_dr",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_RUL = registerBlock("framed_window_mangrove_clear_rul",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_RDL = registerBlock("framed_window_mangrove_clear_rdl",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_DRU = registerBlock("framed_window_mangrove_clear_dru",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_DLU = registerBlock("framed_window_mangrove_clear_dlu",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> FRAMED_WINDOW_MANGROVE_CLEAR_NONE = registerBlock("framed_window_mangrove_clear_none",
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
