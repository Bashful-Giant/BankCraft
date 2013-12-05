package bashful.bankcraft.item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FiftycCoin extends Item {

        public FiftycCoin(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("FiftycCoin");

        }

}