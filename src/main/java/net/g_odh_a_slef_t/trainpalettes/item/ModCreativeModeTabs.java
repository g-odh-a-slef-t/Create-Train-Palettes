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
                    .icon(() -> new ItemStack(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL.get()))
                    .title(Component.translatable("creativetab.trainpalettes.mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_ALL);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_U);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_R);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_D);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_L);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UD);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_LR);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UL);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_UR);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DL);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DR);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RUL);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_RDL);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DRU);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_DLU);
                        output.accept(ModBlocks.FRAMED_WINDOW_MANGROVE_CLEAR_NONE);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}


