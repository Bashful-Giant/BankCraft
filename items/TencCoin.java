package bashful.bankcraft.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class TencCoin extends Item {

        public TencCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("TencCoin");
        }

}