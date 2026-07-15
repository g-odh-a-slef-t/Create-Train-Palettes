package net.g_odh_a_slef_t.trainpalettes.item;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TrainPalettes.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
