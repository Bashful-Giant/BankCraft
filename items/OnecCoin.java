package bashful.bankcraft.items;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class OnecCoin extends Item {

        public OnecCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("OnecCoin");
        }

}