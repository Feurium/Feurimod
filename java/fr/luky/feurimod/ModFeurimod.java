package fr.luky.feurimod;

import fr.luky.feurimod.ct.FeurimodTab;
import fr.luky.feurimod.ct.FeurimodWeapons;
import fr.luky.feurimod.utils.Reference;
import fr.luky.feurimod.utils.handlers.ConfigHandler;
import fr.luky.feurimod.utils.handlers.RegistryHandler;
import fr.luky.feurimod.proxy.FeurimodCommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ModFeurimod {

    public static File config;

    @Mod.Instance(Reference.MODID)
    public static ModFeurimod instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVEUR)
    public static FeurimodCommonProxy proxy;

    public static final CreativeTabs feurimodBlocks = new FeurimodBlocks("feurimod blocks");
    public static final CreativeTabs feurimodWeapons = new FeurimodWeapons("feurimod weapons");
    public static final CreativeTabs feurimodTools = new FeurimodTools("feurimod tools");
    public static final CreativeTabs feuriumFood = new FeurimodFood("feurimod foodstuffs");
    public static final CreativeTabs feurimodMisc = new FeurimodMisc("feurimod miscellaneous");

    public ModFeurimod(){
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());
    }

    public static Logger logger;

    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        RegistryHandler.preInitRegistries(event);
        logger = event.getModLog();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
        RegistryHandler.initRegistries(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }

}
