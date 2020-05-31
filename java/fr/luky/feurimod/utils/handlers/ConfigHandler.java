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
        config.addCustomCategoryComment(category, "Définisez les ID's pour les entitées et les GUI");
        ENTITY_FEURIUM_CHICKEN = config.getInt("ID de l'entité FeuriumChicken", category, 120, 120, 200, "ID pour l'entitée FeuriumChicken");
        GUI_FREEZER = config.getInt("ID du GUI du Freezer", category, 0, 0, 50, "ID pour le GUI du Freezer");

        category = "Biomes";
        config.addCustomCategoryComment(category, "Definisez si vous voulez le spawn du FeuriumBiome dans l'overworld");
        spawnFeuriumBiomeInOverworld : config.getBoolean("Spawn du FeuriumBiome dans l'overworld", category, true, "Definisez si vous voulez le spawn du FeuriumBiome dans l'overworld");

        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event){
        ModFeurimod.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
        ModFeurimod.config.mkdirs();
        init(new File(ModFeurimod.config.getPath(), Reference.MODID + ".cfg"));
    }

}
