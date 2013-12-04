package bashful.bankcraft.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class TwentycCoin extends Item {

        public TwentycCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("TwentycCoin");
        }

}