package bashful.bankcraft.block;
import bashful.bankcraft.tileentitiy.TileEntityCashRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

  
public class CashRegister extends BlockContainer {
	public CashRegister (int id, Material material)
     {
             super(id, material);
             setCreativeTab(CreativeTabs.tabMaterials);
             setUnlocalizedName("CashRegister");
             setHardness(1.0F);
             setStepSound(Block.soundStoneFootstep);

     }

	@Override
	public TileEntity createNewTileEntity(World world) {

		return new TileEntityCashRegister();
	}

}
