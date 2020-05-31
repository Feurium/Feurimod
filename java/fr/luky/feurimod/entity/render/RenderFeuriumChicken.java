package fr.luky.feurimod.entity.render;

import fr.luky.feurimod.entity.EntityFeuriumChicken;
import fr.luky.feurimod.entity.model.ModelFeuriumChicken;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import javax.annotation.Nullable;

public class RenderFeuriumChicken extends RenderLiving<EntityFeuriumChicken> {

    public static final ResourceLocation FEURIUM_CHICKEN_TEXTURES = new ResourceLocation("feurimod:textures/entity/feurium_chicken.png");

    public RenderFeuriumChicken(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelFeuriumChicken(), 0.3F);
    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityFeuriumChicken entity) {
        return FEURIUM_CHICKEN_TEXTURES;
    }

    @Override
    protected float handleRotationFloat(EntityFeuriumChicken livingBase, float partialTicks) {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}
