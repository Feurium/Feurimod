package fr.luky.feurimod.proxy;

import fr.luky.feurimod.init.ModRecipes;
import fr.luky.feurimod.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import java.io.File;

public class FeurimodCommonProxy {

    public void registerModel(Item item, int metadata) {}

    public void preInit(File configFile){
    }

    public void init(){

        ModRecipes.instance.initRecipes();

    }

    public void postInit(){

    }
}
