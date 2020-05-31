package fr.luky.feurimod.init;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.entity.EntityFeuriumChicken;
import fr.luky.feurimod.utils.Reference;
import fr.luky.feurimod.utils.handlers.ConfigHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void registerEntities(){
        registerEntity("feurium_chicken", EntityFeuriumChicken.class, ConfigHandler.ENTITY_FEURIUM_CHICKEN, 75, 23455, 16711680);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, ModFeurimod.instance, range, 1, true, color1, color2);
    }
}
