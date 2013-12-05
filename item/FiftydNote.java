package bashful.bankcraft.item;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class FiftydNote extends Item {

        public FiftydNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("FiftydNote");
        }

}