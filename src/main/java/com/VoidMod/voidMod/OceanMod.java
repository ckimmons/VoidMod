package com.VoidMod.voidMod;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;



@Mod(modid = OceanMod.MODID, name = OceanMod.NAME, version = OceanMod.VERSION)
public class OceanMod {
	    public static final String MODID = "oceanmod";
	    public static final String NAME = "Ocean mod: underwater aesthetics";
	    public static final String VERSION = "0.0";

	    private static Logger logger;

	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        logger = event.getModLog();
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	        // some example code
	        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	    }
}
