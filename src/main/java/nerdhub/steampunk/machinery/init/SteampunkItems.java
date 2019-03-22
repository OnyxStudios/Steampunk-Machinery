package nerdhub.steampunk.machinery.init;

import com.github.glasspane.mesh.api.annotation.AutoRegistry;
import com.github.glasspane.mesh.api.registry.AutoRegistryHook;
import nerdhub.steampunk.machinery.SteampunkMachinery;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

@AutoRegistry(value = Item.class, modid = SteampunkMachinery.MODID, registry = "item")
public class SteampunkItems implements AutoRegistryHook {

    public static final Item STEAM_BUCKET = new BucketItem(SteampunkFluids.STEAM, new Item.Settings().stackSize(1).itemGroup(SteampunkMachinery.ITEM_GROUP).recipeRemainder(Items.BUCKET));

}
