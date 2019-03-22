package nerdhub.steampunk.machinery;

import com.github.glasspane.mesh.api.annotation.CalledByReflection;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

@CalledByReflection
public class SteampunkMachinery implements ModInitializer {

    public static final String MODID = "steampunk_machinery";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "items"), () -> new ItemStack(Items.GOLDEN_PICKAXE));

    @Override
    public void onInitialize() {

    }
}
