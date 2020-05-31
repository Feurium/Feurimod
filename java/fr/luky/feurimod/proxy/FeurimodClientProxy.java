package fr.luky.feurimod.proxy;

import fr.luky.feurimod.entity.EntityFeuriumChicken;
import fr.luky.feurimod.entity.render.RenderFeuriumChicken;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import java.io.File;

public class FeurimodClientProxy extends FeurimodCommonProxy {

    @Override
    public void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void registerCustomMeshesAndStates(Block blockFluid){
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(blockFluid), new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return new ModelResourceLocation(new ResourceLocation(Reference.MODID, blockFluid.getUnlocalizedName().substring(5)), "fluid");
            }
        });
        ModelLoader.setCustomStateMapper(blockFluid, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return new ModelResourceLocation(new ResourceLocation(Reference.MODID, blockFluid.getUnlocalizedName().substring(5)), "fluid");
            }
        });
    }

    @Override
    public void preInit(File configFile){
        super.preInit(configFile);
    }

    @Override
    public void init(){
        super.init();
    }

    @Override
    public void postInit(){
        super.postInit();
    }
}
