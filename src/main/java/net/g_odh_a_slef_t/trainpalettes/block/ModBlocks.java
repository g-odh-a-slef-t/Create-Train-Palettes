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

    public static final DeferredBlock<Block> FRAMED_WINDOW_GLASS_CLEAR = registerBlock("framed_window_glass_clear",
            () -> new ModFramedWindowBlock(BlockBehaviour.Properties.of()));
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
