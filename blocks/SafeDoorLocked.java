package bashful.bankcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class SafeDoorLocked extends Block {
	 public SafeDoorLocked (int id, Material material)
     {
             super(id, material);
             setUnlocalizedName("SafeDoorLocked");
             setCreativeTab(CreativeTabs.tabMaterials);
             setHardness(-1.0F);
             setStepSound(Block.soundStoneFootstep);

     }

}

