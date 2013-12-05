package bashful.bankcraft.item;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class FivedNote extends Item {

        public FivedNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("FivedNote");
        }

}