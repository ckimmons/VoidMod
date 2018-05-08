package oceanmod.electricBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
	
    
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        //worldIn.setBlockState(pos, state.withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer)), 2);
    	int x = pos.getX();
        int y = pos.getX();
        int z = pos.getZ();
        
        int i = 5;
 
     
            for (BlockPos blockpos : BlockPos.getAllInBox(pos.add(-i, -i, -i), pos.add(i, i, i)))
            {
            		IBlockState iblockstate = worldIn.getBlockState(blockpos);
            		EntityLightningBolt bolt = new EntityLightningBolt(worldIn, blockpos.getX(), blockpos.getY(), blockpos.getZ(), true);
            		bolt.setPosition(blockpos.getX(), blockpos.getY(), blockpos.getZ());
            		worldIn.spawnEntity(bolt);
                
            }
        
    }
}
