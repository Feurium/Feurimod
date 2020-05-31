package fr.luky.feurimod.ct;

import fr.luky.feurimod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FeurimodTab extends CreativeTabs {

    public FeurimodTab(String label) {
        super(label);

    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.FEURIUM_INGOT);
    }
}
