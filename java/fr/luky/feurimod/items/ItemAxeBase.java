package fr.luky.feurimod.items;

import fr.luky.feurimod.utils.FeurimodUtils;
import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeBase extends net.minecraft.item.ItemAxe implements IHasModel {


    public ItemAxeBase(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodTab).setMaxStackSize(1);
        setCreativeTab(feurimod.FEURIMODTOOLS);

        ModItems.items.add(this);
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        if (repair.getItem() == ModItems.FEURIUM_INGOT && this.toolMaterial == FeurimodUtils.ToolUtils.feurium_tool_mat || repair.getItem() == ModItems.IRIDIUM_INGOT && this.toolMaterial == FeurimodUtils.ToolUtils.iridium_tool_mat  || repair.getItem() == ModItems.TRITIUM_INGOT && this.toolMaterial == FeurimodUtils.ToolUtils.tritium_tool_mat || repair.getItem() == ModItems.PROTIUM_INGOT && this.toolMaterial == FeurimodUtils.ToolUtils.protium_tool_mat){
            return true;
        }
        return false;
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(this, 0);
    }
}
