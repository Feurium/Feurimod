package fr.luky.feurimod.utils.handlers;

import fr.luky.feurimod.ModFeurimod;
import fr.luky.feurimod.init.*;
import fr.luky.feurimod.utils.interfaces.IHasFluidModel;
import fr.luky.feurimod.utils.interfaces.IHasModel;
import fr.luky.feurimod.world.generation.WorldGenerationOres;
import fr.luky.feurimod.world.generation.WorldGenerationTrees;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ModItems.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ModBlocks.blocks.toArray(new Block[0]));
        event.getRegistry().registerAll(ModBlocks.blockFluids.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for (Item item : ModItems.items){
            if (item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

        for (Block block : ModBlocks.blocks){
            if (block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }

        for (Block blockFluid : ModBlocks.blockFluids){
            if (blockFluid instanceof IHasFluidModel){
                ((IHasFluidModel)blockFluid).registerCustomMeshesAndStates();
            }
        }
    }

    public static void preInitRegistries(FMLPreInitializationEvent event){
        ModFluids.registerFluids();

        GameRegistry.registerWorldGenerator(new WorldGenerationOres(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenerationTrees(), 0);

        ModBiomes.registerBiomes();
        ModEntities.registerEntities();
        RenderHandler.registerEntityRenders();

        ConfigHandler.registerConfig(event);
    }

    public static void initRegistries(FMLInitializationEvent event){

    }
}
