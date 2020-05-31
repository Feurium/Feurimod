package fr.luky.feurimod.world.biomes;

import fr.luky.feurimod.entity.EntityFeuriumChicken;
import fr.luky.feurimod.init.ModBlocks;
import fr.luky.feurimod.world.generation.generators.WorldGenFeuriumTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class BiomeFeurium extends Biome {

    protected static final WorldGenAbstractTree TREE = new WorldGenFeuriumTree();

    public BiomeFeurium() {
        super(new BiomeProperties("Feurium").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(10.5F));

        topBlock = ModBlocks.FEURIUM_GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();

        this.decorator.treesPerChunk = 3;

        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();

        this.spawnableMonsterList.add(new SpawnListEntry(EntityFeuriumChicken.class, 10, 1, 7));
    }

    @Override
    public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
        return TREE;
    }
}
