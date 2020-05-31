package fr.luky.feurimod.utils.handlers;

import fr.luky.feurimod.entity.EntityFeuriumChicken;
import fr.luky.feurimod.entity.render.RenderFeuriumChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFeuriumChicken.class, new IRenderFactory<EntityFeuriumChicken>() {
            @Override
            public Render<? super EntityFeuriumChicken> createRenderFor(RenderManager manager) {
                return new RenderFeuriumChicken(manager);
            }
        });
    }

}
