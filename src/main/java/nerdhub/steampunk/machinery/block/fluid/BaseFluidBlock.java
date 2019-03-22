package nerdhub.steampunk.machinery.block.fluid;

import com.github.glasspane.mesh.api.registry.ItemBlockProvider;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.BaseFluid;
import net.minecraft.item.Item;

public class BaseFluidBlock extends FluidBlock implements ItemBlockProvider {

    public BaseFluidBlock(BaseFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    public BaseFluidBlock(BaseFluid fluid, FabricBlockSettings settings) {
        super(fluid, settings.build());
    }

    @Override
    public Item createItem() {
        return null; //we don't want items for our fluid blocks
    }
}
