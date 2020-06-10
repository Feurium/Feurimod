package fr.luky.feurimod.ct;

import fr.luky.feurimod.init.ModItems;

import minecraft.net.creativetab.CreativeTabs;
import minecraft.net.item.ItemStack;

public class FeurimodMisc extends CreativeTabs{
	public FeurimodMisc(String label){
		super(label);
	}
	
	@override
	public ItemStack getTabIconItem(){
		return new ItemStack(modItems.MOLTEN_FEURIUM_BUCKET);
	}
}
