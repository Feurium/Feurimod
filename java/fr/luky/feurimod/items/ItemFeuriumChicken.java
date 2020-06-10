package fr.luky.feurimod.items;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFeuriumChicken extends ItemFood implements IHasModel {

    public ItemFeuriumChicken(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setHasSubtypes(true);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodTab);
        setCreativeTab(feurimod.FEURIMODFOOD;

        ModItems.items.add(this);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote){
            if (stack.getMetadata() > 0){
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,500, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2));
            }else {
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,500, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000, 2));
            }
        }
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(this,0);
    }
}
