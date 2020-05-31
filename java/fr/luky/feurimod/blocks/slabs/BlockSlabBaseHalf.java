package fr.luky.feurimod.blocks.slabs;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class BlockSlabBaseHalf extends BlockSlabBase implements IHasModel
{
	public BlockSlabBaseHalf(String name, Material materialIn, float resistance, float hardness, int level, String toolClass, net.minecraft.block.BlockSlab half, BlockSlab doubleSlab, SoundType sound)
	{
		super(name, materialIn, resistance, hardness, level, toolClass, half, sound);

		ModItems.items.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		ModFeurimod.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}
