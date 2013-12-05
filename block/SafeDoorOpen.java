package bashful.bankcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

  
public class SafeDoorOpen extends Block {
	 public SafeDoorOpen (int id, Material material)
     {
             super(id, material);
             setUnlocalizedName("SafeDorOpen");
             setCreativeTab(CreativeTabs.tabMaterials);
             setHardness(1.0F);
             setStepSound(Block.soundStoneFootstep);

     }

}

