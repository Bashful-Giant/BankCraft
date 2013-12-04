package bashful.bankcraft.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class ATM extends Block {
	 public ATM (int id, Material material)
     {
             super(id, material);
             setCreativeTab(CreativeTabs.tabMaterials);
             setUnlocalizedName("ATM");
             setHardness(1.0F);
             setStepSound(Block.soundStoneFootstep);

     }

}

