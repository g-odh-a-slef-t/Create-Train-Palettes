package net.g_odh_a_slef_t.trainpalettes.block.custom;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.g_odh_a_slef_t.trainpalettes.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class ModFramedWindowBlock extends GlazedTerracottaBlock implements IWrenchable {
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

    @Override
    public InteractionResult onWrenched(BlockState state, UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        if(!level.isClientSide) {
            Direction direction = state.getValue(FACING);
            level.setBlockAndUpdate(pos, state.setValue(FACING, direction.getClockWise()));
        }

        return InteractionResult.SUCCESS;
    }
}
