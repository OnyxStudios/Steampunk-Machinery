package nerdhub.steampunk.machinery.init;

import com.github.glasspane.mesh.api.annotation.AutoRegistry;
import com.github.glasspane.mesh.api.registry.AutoRegistryHook;
import nerdhub.steampunk.machinery.SteampunkMachinery;
import nerdhub.steampunk.machinery.block.fluid.BaseFluidBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

@AutoRegistry(value = Block.class, modid = SteampunkMachinery.MODID, registry = "block")
public class SteampunkBlocks implements AutoRegistryHook {

    public static final Block STEAM = new BaseFluidBlock(SteampunkFluids.STEAM, FabricBlockSettings.of(Material.WATER).strength(100.0F, 100.0F).noCollision().dropsNothing());
}
