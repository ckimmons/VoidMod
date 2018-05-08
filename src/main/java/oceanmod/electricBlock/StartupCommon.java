package oceanmod.electricBlock;

import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import oceanmod.drainBlock.DrainBlock;

import javax.annotation.Nonnull;

public class StartupCommon {

	public static ElectricBlock electricBlock;
	public static ItemBlock itemElectricBlock;
	
	public static void preInitCommon(){
		electricBlock = (ElectricBlock)(new ElectricBlock().setUnlocalizedName("electricblock_unlocalised_name"));
		electricBlock.setRegistryName("electricblock_registry_name");
	    ForgeRegistries.BLOCKS.register(electricBlock);

	    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
	    itemElectricBlock = new ItemBlock(electricBlock);
	    itemElectricBlock.setRegistryName(electricBlock.getRegistryName());
	    ForgeRegistries.ITEMS.register(itemElectricBlock);
	}

	public static void InitCommon(){

	}

	public static void postInitCommon(){

	}
}
