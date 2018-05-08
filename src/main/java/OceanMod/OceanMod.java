package oceanmod;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;



@Mod(modid = OceanMod.MODID, name = OceanMod.NAME, version = OceanMod.VERSION)
public class OceanMod {
	    public static final String MODID = "oceanmod";
	    public static final String NAME = "Ocean mod: underwater aesthetics";
	    public static final String VERSION = "0.0";
	    

	    ResourceLocation optionalGroup = new ResourceLocation("");
	    @SidedProxy(clientSide="oceanmod.ClientOnlyProxy", serverSide="oceanmod.DedicatedServerProxy")
	    public static CommonProxy proxy;
	    
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	    	proxy.preInit();
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	proxy.Init();
	    }
	    
	    @EventHandler
	    public void postInit(FMLInitializationEvent event)
	    {
	    	proxy.postInit();
	    }
	    
	    
	    public static String prependModID(String name) {return MODID + ":" + name;}
}
