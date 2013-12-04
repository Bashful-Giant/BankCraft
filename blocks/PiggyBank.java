package bashful.bankcraft.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class PiggyBank extends Block {
	
	 public PiggyBank (int id, Material material)
     {
             super(id, material);
             setCreativeTab(CreativeTabs.tabMaterials);
             setUnlocalizedName("PiggyBank");
             setHardness(1.0F); 
             setStepSound(Block.soundStoneFootstep);

     }

}
