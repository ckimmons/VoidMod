package oceanmod.drainBlock;

import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nonnull;

public class StartupCommon {
	
	public static DrainBlock drain;
	public static ItemBlock itemDrain;
	
	public static void preInitCommon(){
		drain = (DrainBlock)(new DrainBlock().setUnlocalizedName("drainblock_unlocalised_name"));
	    drain.setRegistryName("drainblock_registry_name");
	    ForgeRegistries.BLOCKS.register(drain);

	    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
	    itemDrain = new ItemBlock(drain);
	    itemDrain.setRegistryName(drain.getRegistryName());
	    ForgeRegistries.ITEMS.register(itemDrain);
	}
	
	public static void InitCommon(){
		
	}
	
	public static void postInitCommon(){
		
	}
}
