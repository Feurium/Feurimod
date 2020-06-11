package fr.luky.feurimod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public class BlockDirtBase extends BlockBlockBase {
    public BlockDirtBase(String name, float hardness, float resistance, int level, String toolClass, SoundType sound) {
        super(name, Material.GROUND, hardness, resistance, level, toolClass, sound);
        setCreativeTab(feurimod.feurimodBlocks);
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
        return true;
    }
}
