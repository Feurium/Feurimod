package fr.lukt.feurimod.ct;

import fr.luky.feurimod.init.ModItems;

import minecraft.net.creativetab.CreativeTabs;
import minecraft.net.item.ItemStack;

public class FeurimodWeapons extends CreativeTabs{
	public FeurimodWeapons(String label){
		super(label);
	}
	
	@override
	public ItemStack getTabIconItem(){
		return new ItemStack(modItems.FEURIUM_SWORD);
	}
}
