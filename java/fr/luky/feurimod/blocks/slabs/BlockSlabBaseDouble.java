package fr.luky.feurimod.blocks.slabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSlabBaseDouble extends BlockSlabBase
{
	public BlockSlabBaseDouble(String name, Material materialIn, float resistance, float hardness, int level, String toolClass, net.minecraft.block.BlockSlab half, SoundType sound)
	{
		super(name, materialIn, resistance, hardness, level, toolClass, half, sound);
		setCreativeTab(feurimod.FEURIMODBLOCKS);
	}

	@Override
	public boolean isDouble() 
	{	
		return true;
	}
}
