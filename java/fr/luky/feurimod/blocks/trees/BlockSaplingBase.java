package fr.luky.feurimod.blocks.trees;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.init.ModItems;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import fr.luky.feurimod.world.generation.generators.WorldGenFeuriumTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockSaplingBase extends BlockBush implements IGrowable, IHasModel {

    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
    private static String type;

    public BlockSaplingBase(String name) {
        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(ModFeurimod.feurimodMisc);
        setSoundType(SoundType.PLANT);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));

        type = name.replaceAll("_sapling", "").trim();

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(STAGE, Integer.valueOf(meta & 8) >> 3);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{STAGE});
    }

    @Override
    public void registerModels() {
        ModFeurimod.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        if ((Integer)state.getValue(STAGE).intValue() == 0){
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else {
            this.generateTree(worldIn, rand, pos, state);
        }
    }

    public void generateTree(World world, Random rand, BlockPos pos, IBlockState state){
        if (!TerrainGen.saplingGrowTree(world, rand, pos)) return;
        WorldGenerator gen = (WorldGenerator)(rand.nextInt(10) == 0 ? new WorldGenBigTree(false) : new WorldGenTrees(false));
        boolean flag = false;
        int i = 0, j = 0;

        switch (type){
            case "feurium":
                gen = new WorldGenFeuriumTree();
                break;
        }

        IBlockState iBlockState = Blocks.AIR.getDefaultState();
        if (flag){
            world.setBlockState(pos.add(i, 0, j), iBlockState, 4);
            world.setBlockState(pos.add(i + 1, 0, j), iBlockState, 4);
            world.setBlockState(pos.add(i, 0, j + 1), iBlockState, 4);
            world.setBlockState(pos.add(i + 1, 0, j + 1), iBlockState, 4);
        }
        else {
            world.setBlockState(pos, iBlockState, 4);
        }

        if (!gen.generate(world, rand, pos.add(i, 0, j))){
            if (flag){
                world.setBlockState(pos.add(i, 0, j), iBlockState, 4);
                world.setBlockState(pos.add(i + 1, 0, j), iBlockState, 4);
                world.setBlockState(pos.add(i, 0, j + 1), iBlockState, 4);
                world.setBlockState(pos.add(i + 1, 0, j + 1), iBlockState, 4);
            }
            else {
                world.setBlockState(pos, iBlockState, 4);
            }
        }
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    protected boolean canSustainBush(IBlockState state) {
        return state.getMaterial() == Material.GROUND || state.getMaterial() == Material.GRASS || state.getMaterial() == Material.PLANTS;
    }
}
