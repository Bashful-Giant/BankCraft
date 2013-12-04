package bashful.bankcraft.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class TendNote extends Item {

        public TendNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("TendNote");
        }

}