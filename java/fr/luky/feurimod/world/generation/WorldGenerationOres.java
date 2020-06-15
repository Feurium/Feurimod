package fr.luky.feurimod.world.generation;

import fr.luky.feurimod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenerationOres implements IWorldGenerator {

    private WorldGenerator feurium_ore, iridium_ore, tritium_ore, orium_ore;

    public WorldGenerationOres(){
        feurium_ore = new WorldGenMinable(ModBlocks.FEURIUM_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
        iridium_ore = new WorldGenMinable(ModBlocks.IRIDIUM_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        tritium_ore = new WorldGenMinable(ModBlocks.TRITIUM_ORE.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
		orium_ore = new WorldGenMinable(ModBlocks.ORIUM_ORE.getDfaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERACK));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()){
            case -1:
				
				runGenerator(orium_ore, world, random, chunkX, chunkZ, 1, 5, 10);
				
                break;

            case 0:

                runGenerator(feurium_ore, world, random, chunkX, chunkZ, 5, 5, 10);
                runGenerator(iridium_ore, world, random, chunkX, chunkZ, 7, 5, 13);
                runGenerator(tritium_ore, world, random, chunkX, chunkZ, 10, 5, 15);

                break;

            case 1:
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight){
        if (minHeight > maxHeight || minHeight< 0 || maxHeight > 256) throw  new IllegalArgumentException("Ore generated out of bounds");


        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chance; i ++){
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x,y,z));
        }
    }
}
