package oceanmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class DedicatedServerProxy extends CommonProxy {
	
	public void preInit(){
		super.preInit();
	}
	
	public void Init(){
		super.Init();
	}
	
	public void postInit(){
		super.postInit();
	}
	

	@Override
	public boolean isDedicatedServer() {return true;}
	
}
