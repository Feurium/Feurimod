package fr.luky.feurimod.init;

import fr.luky.feurimod.blocks.*;
import fr.luky.feurimod.blocks.slabs.BlockSlabBaseDouble;
import fr.luky.feurimod.blocks.slabs.BlockSlabBaseHalf;
import fr.luky.feurimod.blocks.trees.BlockLeaveBase;
import fr.luky.feurimod.blocks.trees.BlockLogBase;
import fr.luky.feurimod.blocks.trees.BlockSaplingBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class  ModBlocks {

    public static final List<Block> blocks = new ArrayList<Block>();
    public static final List<Block> blockFluids = new ArrayList<Block>();

    //Feurium
    public static final Block FEURIUM_BLOCK = new BlockBlockBase("feurium_block", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", SoundType.METAL);
    public static final Block FEURIUM_STAIRS = new BlockStairsBase("feuriumstairs", ModBlocks.FEURIUM_BLOCK.getDefaultState());
    public static final Block FEURIUM_ORE = new BlockOreBase("feurium_ore", Material.ROCK, 3.0F, 15.0F, 3, "pickaxe", SoundType.STONE);
    public static final BlockSlab FEURIUM_SLAB_DOUBLE = new BlockSlabBaseDouble("feurium_slab_double", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.FEURIUM_SLAB_HALF, SoundType.METAL);
    public static final BlockSlab FEURIUM_SLAB_HALF = new BlockSlabBaseHalf("feurium_slab_half", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.FEURIUM_SLAB_HALF, ModBlocks.FEURIUM_SLAB_DOUBLE, SoundType.METAL);
    public static final Block MOLTEN_FEURIUM_BLOCK = new BlockFluidBase("molten_feurium", ModFluids.MOLTEN_FEURIUM_FLUID, Material.LAVA);

    //Protium
    public static final Block PROTIUM_BLOCK = new BlockBlockBase("protium_block", Material.IRON, 5.0F, 30.0F, 1, "pickaxe",SoundType.METAL);
    public static final Block PROTIUM_STAIRS = new BlockStairsBase("protium_stairs", ModBlocks.PROTIUM_BLOCK.getDefaultState());
    public static final BlockSlab PROTIUM_SLAB_DOUBLE = new BlockSlabBaseDouble("protium_slab_double", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.PROTIUM_SLAB_HALF, SoundType.METAL);
    public static final BlockSlab PROTIUM_SLAB_HALF = new BlockSlabBaseHalf("protium_slab_half", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.PROTIUM_SLAB_HALF, ModBlocks.PROTIUM_SLAB_DOUBLE, SoundType.METAL);
    public static final Block MOLTEN_PROTIUM_BLOCK = new BlockFluidBase("molten_protium", ModFluids.MOLTEN_PROTIUM_FLUID, Material.LAVA);

    //Iridium
    public static final Block IRIDIUM_BLOCK = new BlockBlockBase("iridium_block", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", SoundType.METAL);
    public static final Block IRIDIUM_STAIRS = new BlockStairsBase("iridium_stairs", ModBlocks.IRIDIUM_BLOCK.getDefaultState());
    public static final Block IRIDIUM_ORE = new BlockOreBase("iridium_ore", Material.ROCK, 3.0F, 15.0F, 3, "pickaxe", SoundType.STONE);
    public static final BlockSlab IRIDIUM_SLAB_DOUBLE = new BlockSlabBaseDouble("iridium_slab_double", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.IRIDIUM_SLAB_HALF, SoundType.METAL);
    public static final BlockSlab IRIDIUM_SLAB_HALF = new BlockSlabBaseHalf("iridium_slab_half", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.IRIDIUM_SLAB_HALF, ModBlocks.IRIDIUM_SLAB_DOUBLE, SoundType.METAL);
    public static final Block MOLTEN_IRIDIUM_BLOCK = new BlockFluidBase("molten_iridium", ModFluids.MOLTEN_IRIDIUM_FLUID, Material.LAVA);

    //Tritium
    public static final Block TRITIUM_BLOCK = new BlockBlockBase("tritium_block", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", SoundType.METAL);
    public static final Block TRITIUM_STAIRS = new BlockStairsBase("tritium_stairs", ModBlocks.TRITIUM_BLOCK.getDefaultState());
    public static final Block TRITIUM_ORE = new BlockOreBase("tritium_ore", Material.ROCK, 3.0F, 15.0F, 2, "pickaxe", SoundType.STONE);
    public static final BlockSlab TRITIUM_SLAB_DOUBLE = new BlockSlabBaseDouble("tritium_slab_double", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.TRITIUM_SLAB_HALF, SoundType.METAL);
    public static final BlockSlab TRITIUM_SLAB_HALF = new BlockSlabBaseHalf("tritium_slab_half", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.TRITIUM_SLAB_HALF, ModBlocks.TRITIUM_SLAB_DOUBLE, SoundType.METAL);
    public static final Block MOLTEN_TRITIUM_BLOCK = new BlockFluidBase("molten_tritium", ModFluids.MOLTEN_TRITIUM_FLUID, Material.LAVA);

    //Orium
    public static final Block ORIUM_BLOCK = new BlockBlockBase("orium_block", material.IRON, 5.0F, 30.0F, 1, "pickaxe", SoundType.METAL);
    public static final Block ORIUM_STAIRS = new BlockStairsBase("orium_stairs", ModBlocks.TRITIUM_BLOCK.getDefaultState());
    public static final Block ORIUM_ORE = new BlockOreBase("orium_ore", Material.ROCK, 3.0F, 15.0F, 2, "pickaxe", SoundType.STONE);
    public static final BlockSlab ORIUM_SLAB_DOUBLE = new BlockSlabBaseDouble("orium_double", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.TRITIUM_SLAB_HALF, SoundType.METAL);
    public static final BlockSlab ORIUM_SLAB_HALF = new BlockSlabBaseHalf("orium_slab_half", Material.IRON, 5.0F, 30.0F, 1, "pickaxe", ModBlocks.TRITIUM_SLAB_HALF, ModBlocks.TRITIUM_SLAB_DOUBLE, SoundType.METAL);
    public static final Block MOLTEN_ORIUM_BLOCK = new BlockFluidBase("molten_orium", ModFluids.MOLTEN_ORIUM_FLUID, Material.LAVA);
    
    //Arbres
    public static final Block FEURIUM_PLANK = new BlockBlockBase("feurium_planks", Material.WOOD, 2.0F, 15.0F, 0, "axe", SoundType.WOOD);
    public static final Block FEURIUM_LOG = new BlockLogBase("feurium_log");
    public static final Block FEURIUM_LEAVES = new BlockLeaveBase("feurium_leaves");
    public static final Block FEURIUM_SAPLING = new BlockSaplingBase("feurium_sapling");
    public static final Block FEURIUM_GRASS = new BlockDirtBase("feurium_grass", 0.6F, 3.0F, 0, "spade", SoundType.GROUND);


}
