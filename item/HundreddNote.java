package bashful.bankcraft.item;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class HundreddNote extends Item {

        public HundreddNote(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("HundreddNote");
        }

}