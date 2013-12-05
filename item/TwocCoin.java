package bashful.bankcraft.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class TwocCoin extends Item {

        public TwocCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("TwocCoin");
        }

}