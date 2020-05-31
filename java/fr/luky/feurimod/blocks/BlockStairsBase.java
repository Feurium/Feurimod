package fr.luky.feurimod.blocks;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairsBase extends BlockStairs implements IHasModel {

    public BlockStairsBase(String name, IBlockState modelState) {
        super(modelState);

        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodTab);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(Item.getItemFromBlock(this),0);
    }
}
