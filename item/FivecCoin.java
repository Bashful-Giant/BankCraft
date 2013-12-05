package bashful.bankcraft.item;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class FivecCoin extends Item {

        public FivecCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("FivecCoin");
        }

}