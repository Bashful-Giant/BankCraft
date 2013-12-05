package bashful.bankcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class TwentydNote extends Item {

        public TwentydNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("TwentydNote");
        }

}