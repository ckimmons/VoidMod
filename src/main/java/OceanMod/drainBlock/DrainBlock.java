package oceanmod.drainBlock;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DrainBlock extends BlockDirectional {

	//number of dfs iterations that it'll drain water (essentially radius of drained sphere)
	//keep this low because this class isn't optimized
	public static int drainPower = 5;
	
	public DrainBlock(){
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
    	//Noah note:
    	//this code (which I borrowed from another block dec) implies that setBlockState does not resolve immediately
    	//always be sure to use withProperty for references to block states immediately after changing a property
        worldIn.setBlockState(pos, state.withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer)), 2);
        state = state.withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
        
        if (!worldIn.isRemote)
        {
            if (worldIn.getBlockState(pos.offset(state.getValue(FACING))).getMaterial() == Material.WATER){
            	drainWater(0,drainPower,state.getValue(FACING).getOpposite(),pos.offset(state.getValue(FACING)),worldIn);
            }
        }
    }
    
    protected void drainWater(int dist, int maxDist, EnumFacing fromDir, BlockPos pos, World worldIn){
    	int d = dist++;
    	worldIn.setBlockToAir(pos);
    	if (d < maxDist){
    		for (EnumFacing dir : EnumFacing.VALUES){
    			if (dir != fromDir){
    				if (worldIn.getBlockState(pos.offset(dir)).getMaterial() == Material.WATER){
    					drainWater(d,maxDist,fromDir,pos.offset(dir),worldIn);
    				}
    			}
    		}
    	}
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

}
