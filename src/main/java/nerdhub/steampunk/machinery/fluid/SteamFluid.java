package nerdhub.steampunk.machinery.fluid;

import nerdhub.steampunk.machinery.init.SteampunkBlocks;
import nerdhub.steampunk.machinery.init.SteampunkFluids;
import nerdhub.steampunk.machinery.init.SteampunkItems;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.BaseFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;
import net.minecraft.world.ViewableWorld;

public class SteamFluid extends BaseFluid {
    @Override
    public Fluid getFlowing() {
        return SteampunkFluids.STEAM_FLOWING;
    }

    @Override
    public Fluid getStill() {
        return SteampunkFluids.STEAM;
    }

    //does the block "fall"
    @Override
    protected boolean method_15737() {
        //TODO what is this?
        return false;
    }

    @Override
    protected void method_15730(IWorld world, BlockPos pos, BlockState state) {
        //TODO what is this?
    }

    @Override
    protected int method_15733(ViewableWorld world) {
        //TODO what is this?
        return 4; //from WaterFluid
    }

    @Override
    protected int method_15739(ViewableWorld world) {
        //TODO what is this?
        return 1; //from WaterFluid
    }

    @Override
    protected BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public Item getBucketItem() {
        return SteampunkItems.STEAM_BUCKET;
    }

    //mix?
    @Override
    protected boolean method_15777(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        //TODO what is this?
        return false;
    }

    @Override
    public int getTickRate(ViewableWorld world) {
        return 5; //from WaterFluid
    }

    @Override
    protected float getBlastResistance() {
        return 100.0F; //from WaterFluid
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return SteampunkBlocks.STEAM.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return true;
    }

    @Override
    public int getLevel(FluidState state) {
        return 8;
    }

    @Override
    public boolean matchesType(Fluid other) {
        return other == SteampunkFluids.STEAM_FLOWING || other == SteampunkFluids.STEAM;
    }

    public static class Flowing extends SteamFluid {

        @Override
        protected void appendProperties(StateFactory.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.with(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }
    }
}
