package fr.luky.feurimod.utils.handlers;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.utils.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    public static int ENTITY_FEURIUM_CHICKEN = 120;

    public static int GUI_FREEZER = 0;

    public static boolean spawnFeuriumBiomeInOverworld;

    public static void init(File file){
        config = new Configuration(file);

        String category;

        category = "ID's";
        config.addCustomCategoryComment(category, "Define the entities and GUI IDs");
        ENTITY_FEURIUM_CHICKEN = config.getInt("Feurium Chicken entity ID", category, 120, 120, 200, "ID for Feurium Chicken entity");
        GUI_FREEZER = config.getInt("Freezer GUI ID", category, 0, 0, 50, "ID for Freezer GUI");

        category = "Biomes";
        config.addCustomCategoryComment(category, "Define the Feurium Biome spawn in the overworld");
        spawnFeuriumBiomeInOverworld : config.getBoolean("Feurium Biome spawn in the overworld", category, true, "Define the Feurium Biome spawn in the overworld");

        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event){
        ModFeurimod.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
        ModFeurimod.config.mkdirs();
        init(new File(ModFeurimod.config.getPath(), Reference.MODID + ".cfg"));
    }

}
