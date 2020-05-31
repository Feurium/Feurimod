package fr.luky.feurimod.fluids;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidFluid extends Fluid {


    public FluidFluid(String name, ResourceLocation still, ResourceLocation flowing, int temperature, int luminosity, int viscosity) {
        super(name, still, flowing);
        this.setUnlocalizedName(name).setTemperature(temperature).setLuminosity(luminosity).setViscosity(viscosity);
    }
}
