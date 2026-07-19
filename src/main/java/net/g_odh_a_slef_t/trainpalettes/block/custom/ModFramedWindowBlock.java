package net.g_odh_a_slef_t.trainpalettes.block.custom;

import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;

public class ModFramedWindowBlock extends RotatedPillarBlock {
    public ModFramedWindowBlock(Properties properties) {
        super(properties
                .strength(2f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.GLASS));
    }
}
