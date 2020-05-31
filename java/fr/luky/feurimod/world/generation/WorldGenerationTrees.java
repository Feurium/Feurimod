package fr.luky.feurimod.world.generation;

import fr.luky.feurimod.world.biomes.BiomeFeurium;
import fr.luky.feurimod.world.generation.generators.WorldGenFeuriumTree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WorldGenerationTrees implements IWorldGenerator {

    private final WorldGenerator FEURIUM = new WorldGenFeuriumTree();

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case 1:

                break;

            case 0:

                runGenerator(FEURIUM, world, random, chunkX, chunkZ, 35, 0, 200, BiomeFeurium.class);

                break;

            case -1:

        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chance, int minHeight, int maxHeight, Class<?>... classes) {

        if (chance < 1){
            if (random.nextDouble() < chance) chance = 1;
            else chance = 1;
        }

        ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chance; i++){
            BlockPos pos = new BlockPos(chunkX * 16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff), chunkZ * 16 + 10 + random.nextInt(15));
            if (minHeight < 0) pos = world.getHeight(pos);
            Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
            if (classesList.contains(biome)) generator.generate(world, random, pos);
        }
    }
}
