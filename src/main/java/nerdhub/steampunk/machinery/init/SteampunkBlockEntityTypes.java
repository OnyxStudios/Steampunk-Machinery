package nerdhub.steampunk.machinery.init;


import com.github.glasspane.mesh.api.annotation.AutoRegistry;
import com.github.glasspane.mesh.api.registry.AutoRegistryHook;
import nerdhub.steampunk.machinery.SteampunkMachinery;
import net.minecraft.block.entity.BlockEntityType;

@AutoRegistry(value = BlockEntityType.class, modid = SteampunkMachinery.MODID, registry = "block_entity_type")
public class SteampunkBlockEntityTypes implements AutoRegistryHook {

}
