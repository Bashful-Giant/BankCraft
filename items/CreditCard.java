package bashful.bankcraft.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreditCard extends Item {

        public CreditCard(int id) {
                super(id);
                setMaxStackSize(1);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("CreditCard");               
        }

}