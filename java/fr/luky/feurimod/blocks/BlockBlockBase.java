package fr.luky.feurimod.blocks;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.FurnaceRecipes;

public class BlockBlockBase extends Block implements IHasModel {

    public BlockBlockBase(String name, Material materialIn, float hardness, float resistance, int level, String toolClass, SoundType sound){
        super(materialIn);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodBlocks);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(toolClass, level);
        setSoundType(sound);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
}
