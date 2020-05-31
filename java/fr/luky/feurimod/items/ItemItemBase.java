package fr.luky.feurimod.items;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.ct.FeurimodTab;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemItemBase extends Item implements IHasModel {

    public ItemItemBase(String name){
        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodTab);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(this, 0);
    }
}
