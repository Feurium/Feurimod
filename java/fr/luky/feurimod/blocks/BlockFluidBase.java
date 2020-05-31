package fr.luky.feurimod.blocks;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.init.ModFluids;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.proxy.FeurimodClientProxy;
import fr.luky.feurimod.utils.Reference;
import fr.luky.feurimod.utils.interfaces.IHasFluidModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.discovery.asm.ModFieldVisitor;

public class BlockFluidBase extends BlockFluidClassic implements IHasFluidModel {

    public BlockFluidBase(String name, Fluid fluid, Material material) {
        super(fluid, material);

        this.setRegistryName(name).setUnlocalizedName(name);

        ModBlocks.blockFluids.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }


    @Override
    public void registerCustomMeshesAndStates() {
        FeurimodClientProxy.registerCustomMeshesAndStates(this);
    }
}
