package bashful.bankcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class OnedNote extends Item {

        public OnedNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("OnedNote");
        }

}