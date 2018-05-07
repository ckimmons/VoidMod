package oceanmod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

	public void preInit(){
		oceanmod.drainBlock.StartupCommon.preInitCommon();
	}
	
	public void Init(){
		oceanmod.drainBlock.StartupCommon.InitCommon();
	}
	
	public void postInit(){
		oceanmod.drainBlock.StartupCommon.postInitCommon();
	}
	
	abstract public boolean isDedicatedServer();
}
