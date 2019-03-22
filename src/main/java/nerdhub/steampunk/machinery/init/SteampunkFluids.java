package nerdhub.steampunk.machinery.init;

import com.github.glasspane.mesh.api.annotation.AutoRegistry;
import com.github.glasspane.mesh.api.registry.AutoRegistryHook;
import nerdhub.steampunk.machinery.SteampunkMachinery;
import nerdhub.steampunk.machinery.fluid.SteamFluid;
import net.minecraft.fluid.BaseFluid;
import net.minecraft.fluid.Fluid;

@AutoRegistry(value = Fluid.class, modid = SteampunkMachinery.MODID, registry = "fluid")
public class SteampunkFluids implements AutoRegistryHook {

    public static final BaseFluid STEAM_FLOWING = new SteamFluid.Flowing();
    public static final BaseFluid STEAM = new SteamFluid();
}
