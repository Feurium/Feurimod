package fr.luky.feurimod.items;

import fr.luky.feurimod.utils.FeurimodUtils;
import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorBase extends net.minecraft.item.ItemArmor implements IHasModel {

    public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.FeurimodWeapons).setMaxStackSize(1);

        ModItems.items.add(this);
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        if (repair.getItem() == ModItems.FEURIUM_INGOT && (this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_mat || this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_helm_mat) || repair.getItem() == ModItems.IRIDIUM_INGOT && (this.getArmorMaterial() == FeurimodUtils.ArmorUtils.iridium_armor_mat || this.getArmorMaterial() == FeurimodUtils.ArmorUtils.iridium_armor_helm_mat) || repair.getItem() == ModItems.TRITIUM_INGOT && (this.getArmorMaterial() == FeurimodUtils.ArmorUtils.tritium_armor_mat || this.getArmorMaterial() == FeurimodUtils.ArmorUtils.tritium_armor_helm_mat) || repair.getItem() == ModItems.PROTIUM_INGOT && (this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat || this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat)){
            return true;
        }
        return false;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if (this.armorType == EntityEquipmentSlot.HEAD && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.CHEST && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.LEGS && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.FEET && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 220, 1));
        }

        if (this.armorType == EntityEquipmentSlot.HEAD && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.feurium_armor_helm_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 220, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.LEGS && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.iridium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.HEAD && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.iridium_armor_helm_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 220, 0));
        }

        if (this.armorType == EntityEquipmentSlot.HEAD && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_helm_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 250, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 250, 0));
        }

        if (this.armorType == EntityEquipmentSlot.HEAD && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 250, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0));
        }

        if (this.armorType == EntityEquipmentSlot.CHEST && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 250, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250, 3));
        }

        if (this.armorType == EntityEquipmentSlot.LEGS && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 250, 3));
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 250, 1));
        }

        if (this.armorType == EntityEquipmentSlot.FEET && this.getArmorMaterial() == FeurimodUtils.ArmorUtils.protium_armor_mat){
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 250, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 250, 1));
        }
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(this, 0);
    }
}
