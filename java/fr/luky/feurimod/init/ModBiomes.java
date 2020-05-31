package fr.luky.feurimod.init;

import fr.luky.feurimod.utils.handlers.ConfigHandler;
import fr.luky.feurimod.world.biomes.BiomeFeurium;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {

    public static final Biome FEURIUM = new BiomeFeurium();

    public static void registerBiomes(){
        initBiome(FEURIUM, "Feurium", BiomeType.COOL, Type.DENSE, Type.COLD, Type.HILLS, Type.DRY);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome Registerd");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));

        if (ConfigHandler.spawnFeuriumBiomeInOverworld) {
            BiomeManager.addSpawnBiome(biome);
        }

        System.out.println("Biome Added");
        return biome;
    }

}
