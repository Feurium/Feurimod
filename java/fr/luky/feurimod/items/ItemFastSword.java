package fr.luky.feurimod.items;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.FeurimodUtils;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFastSword extends FastSword implements IHasModel {

    protected Item.ToolMaterial toolMaterial;

    public ItemFastSword(String name, ToolMaterial material) {
        super(material);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodTab);

        ModItems.items.add(this);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (repair.getItem() == ModItems.FEURIUM_INGOT && this.toolMaterial == FeurimodUtils.ToolUtils.feurium_tool_mat) {
            return true;
        }
        return false;
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(this, 0);
    }
}
