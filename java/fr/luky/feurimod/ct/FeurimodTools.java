package fr.luky.feurimod.ct;

import fr.luky.feurimod.init.ModItems;

import minecraft.net.creativetab.CreativeTabs;
import minecraft.net.item.ItemStack;

public class FeurimodTools extends CreativeTabs{
	public FeurimodTools(String label){
		super(label);
	}
	
	@override
	public ItemStack getTabIconItem(){
		return new ItemStack(modItems.FEURIUM_Pickaxe);
	}
}
