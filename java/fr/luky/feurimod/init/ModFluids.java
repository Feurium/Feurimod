package fr.luky.feurimod.init;

import fr.luky.feurimod.fluids.FluidFluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

    public static final Fluid MOLTEN_FEURIUM_FLUID = new FluidFluid("molten_feurium", new ResourceLocation("feurimod:blocks/molten_feurium_still"), new ResourceLocation("feurimod:blocks/molten_feurium_flow"), 2000, 20, 6000);
    public static final Fluid MOLTEN_IRIDIUM_FLUID = new FluidFluid("molten_iridium", new ResourceLocation("feurimod:blocks/molten_iridium_still"), new ResourceLocation("feurimod:blocks/molten_iridium_flow"), 1700, 20, 6000);
    public static final Fluid MOLTEN_TRITIUM_FLUID = new FluidFluid("molten_tritium", new ResourceLocation("feurimod:blocks/molten_tritium_still"), new ResourceLocation("feurimod:blocks/molten_tritium_flow"), 1500, 20, 6000);
    public static final Fluid MOLTEN_PROTIUM_FLUID = new FluidFluid("molten_protium", new ResourceLocation("feurimod:blocks/molten_protium_still"), new ResourceLocation("feurimod:blocks/molten_protium_flow"), 3000, 20, 6000);
    public static final Fluid MOLTEN_ORIUM_FLUID = new FluidFluid("molten_orium", new ResourceLocation("feurimod:blocks/molten_orium_still"), new ResourceLocation("feurimod:blocks/molten_orium_flow"), 3000, 20, 2500);
    
    public static void registerFluids(){
        registerFluid(MOLTEN_FEURIUM_FLUID);
        registerFluid(MOLTEN_IRIDIUM_FLUID);
        registerFluid(MOLTEN_TRITIUM_FLUID);
        registerFluid(MOLTEN_PROTIUM_FLUID);
        registerFluid(MOLTEN_ORIUM_FLUID);
    }
    public static void registerFluid(Fluid fluid){
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }

}
