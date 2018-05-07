package oceanmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ClientOnlyProxy extends CommonProxy {

	public void preInit(){
		super.preInit();
		oceanmod.drainBlock.StartupClientOnly.preInitClientOnly();
	}
	
	public void Init(){
		super.Init();
		oceanmod.drainBlock.StartupClientOnly.InitClientOnly();
	}
	
	public void postInit(){
		super.postInit();
		oceanmod.drainBlock.StartupClientOnly.postInitClientOnly();
	}
	
	@Override
	public boolean isDedicatedServer() {return false;}
}
