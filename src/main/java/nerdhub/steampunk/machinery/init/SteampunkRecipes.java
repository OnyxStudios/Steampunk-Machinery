package nerdhub.steampunk.machinery.init;

import com.github.glasspane.mesh.api.annotation.CalledByReflection;
import com.github.glasspane.mesh.api.crafting.RecipeCreator;
import com.github.glasspane.mesh.api.crafting.RecipeFactory;
import nerdhub.steampunk.machinery.SteampunkMachinery;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@CalledByReflection
public class SteampunkRecipes implements RecipeCreator {

    @Override
    public void createRecipes(RecipeFactory $) {
        //3 coal tar + sand + dye = concrete
        for(DyeColor color : DyeColor.values()) {
            Identifier concreteID = new Identifier(color.getName() + "_concrete");
            Item dyeItem = DyeItem.fromColor(color);
            $.addShapeless(new ItemStack(Registry.ITEM.get(concreteID)), new Identifier(SteampunkMachinery.MODID, "concrete/" + concreteID.getPath()), "concrete", Blocks.SAND, SteampunkItems.COAL_TAR, SteampunkItems.COAL_TAR, SteampunkItems.COAL_TAR, dyeItem);
        }
    }
}
