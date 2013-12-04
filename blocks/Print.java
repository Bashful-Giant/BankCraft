package bashful.bankcraft.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class Print extends Block {
	 public Print (int id, Material material)
     {
             super(id, material);
             setCreativeTab(CreativeTabs.tabMaterials);
             setUnlocalizedName("Print");
             setHardness(1.0F); 
             setStepSound(Block.soundStoneFootstep);

     }

}
