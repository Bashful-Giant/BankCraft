package bashful.bankcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

  
public class SafeDoorLocked extends Block {
	 public SafeDoorLocked (int id, Material material)
     {
             super(id, material.ground);
             setUnlocalizedName("SafeDoorLocked");
             setCreativeTab(CreativeTabs.tabMaterials);
             setHardness(-1.0F);
             setStepSound(Block.soundStoneFootstep);

     }
	 
}





