package OceanMod.drainBlock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {

	public static void preInitClientOnly(){
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("OceanMod:drainBlock", "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(StartupCommon.itemDrain, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
	
	public static void InitClientOnly(){
		
	}
	
	public static void postInitClientOnly(){
		
	}
	
}
