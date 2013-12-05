package bashful.bankcraft.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class Mint extends Block {
	 public Mint (int id, Material material)
     {
             super(id, material);
             setCreativeTab(CreativeTabs.tabMaterials);
             setUnlocalizedName("Mint");
             setHardness(1.0F);
             setStepSound(Block.soundStoneFootstep);

     }

}
