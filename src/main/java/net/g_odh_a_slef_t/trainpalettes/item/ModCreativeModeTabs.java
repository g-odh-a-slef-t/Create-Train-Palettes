package net.g_odh_a_slef_t.trainpalettes.item;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.g_odh_a_slef_t.trainpalettes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrainPalettes.MODID);

    public static final Supplier<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4.get()))
                    .title(Component.translatable("creativetab.trainpalettes.mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Glass
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_CLEAR);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_RED);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_ORANGE);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_YELLOW);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_LIME);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_GREEN);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_CYAN);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_BLUE);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_BLUE);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_PURPLE);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_MAGENTA);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_PINK);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_WHITE);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_LIGHT_GRAY);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_GRAY);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_BLACK);
                        output.accept(ModBlocks.FRAMED_WINDOW_GLASS_BROWN);

                        // Mangrove
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_4);

                        // Acacia
                        output.accept(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_ACACIA_CLEAR_4);

                        // Cherry
                        output.accept(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_CHERRY_CLEAR_4);

                        // Oak
                        output.accept(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_OAK_CLEAR_4);

                        // Spruce
                        output.accept(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_SPRUCE_CLEAR_4);

                        // Birch
                        output.accept(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_BIRCH_CLEAR_4);

                        // Jungle
                        output.accept(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_JUNGLE_CLEAR_4);

                        // Dark Oak
                        output.accept(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_DARK_OAK_CLEAR_4);

                        // Crimson
                        output.accept(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_CRIMSON_CLEAR_4);

                        // Warped
                        output.accept(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_1);
                        output.accept(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_PARA);
                        output.accept(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_2_CORNER);
                        output.accept(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_3);
                        output.accept(ModBlocks.FRAMED_WINDOW_WARPED_CLEAR_4);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}


