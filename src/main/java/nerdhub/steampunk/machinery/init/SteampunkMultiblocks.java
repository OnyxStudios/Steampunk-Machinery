package nerdhub.steampunk.machinery.init;

import com.github.glasspane.mesh.api.annotation.AutoRegistry;
import com.github.glasspane.mesh.api.multiblock.MultiblockTemplate;
import com.github.glasspane.mesh.api.registry.AutoRegistryHook;
import nerdhub.steampunk.machinery.SteampunkMachinery;

@AutoRegistry(value = MultiblockTemplate.class, modid = SteampunkMachinery.MODID, registry = "mesh:multiblocks")
public class SteampunkMultiblocks implements AutoRegistryHook {

}
