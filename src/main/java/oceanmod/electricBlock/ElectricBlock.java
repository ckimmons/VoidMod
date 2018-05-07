package oceanmod.electricBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ElectricBlock extends Block {
	public ElectricBlock(){
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
	{
    	return BlockRenderLayer.SOLID;
	}
	
}
