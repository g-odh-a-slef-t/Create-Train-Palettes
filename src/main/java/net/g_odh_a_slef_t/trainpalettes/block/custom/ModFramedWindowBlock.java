package net.g_odh_a_slef_t.trainpalettes.block.custom;

import net.g_odh_a_slef_t.trainpalettes.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class ModFramedWindowBlock extends RotatedPillarBlock {
    public ModFramedWindowBlock(Properties properties) {
        super(properties
                .strength(2f)
                .requiresCorrectToolForDrops()
                .noOcclusion()
                .sound(SoundType.GLASS));
    }

    @Override
    protected boolean propagatesSkylightDown(BlockState blockState, BlockGetter block, BlockPos pos) {
        return true;
    }

    @Override
    protected float getShadeBrightness(BlockState state, BlockGetter level, BlockPos pos) {
        return 1.0F;
    }

    @Override
    protected boolean skipRendering(BlockState state, BlockState adjacentState, Direction direction) {
        return adjacentState.is(ModTags.Blocks.WINDOW_BLOCKS) ? true : super.skipRendering(state, adjacentState, direction);
    }
}
