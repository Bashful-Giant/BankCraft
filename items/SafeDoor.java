package bashful.bankcraft.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class SafeDoor extends Item {

        public SafeDoor(int id) {
                super(id);
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMaterials);
                setUnlocalizedName("SafeDoor");
        }

}