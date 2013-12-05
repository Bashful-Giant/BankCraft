package bashful.bankcraft.item;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class RawPiggyBank extends Item {

        public RawPiggyBank(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("RawPiggyBank");
        }

}