package oceanmod;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {

	public void preInit(){
		oceanmod.drainBlock.StartupCommon.preInitCommon();
		oceanmod.electricBlock.StartupCommon.preInitCommon();
	}
	
	public void Init(){
		oceanmod.drainBlock.StartupCommon.InitCommon();
		oceanmod.electricBlock.StartupCommon.InitCommon();
	}
	
	public void postInit(){
		oceanmod.drainBlock.StartupCommon.postInitCommon();
		oceanmod.electricBlock.StartupCommon.postInitCommon();
	}
	
	abstract public boolean isDedicatedServer();
}
