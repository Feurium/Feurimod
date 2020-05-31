package fr.luky.feurimod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static ModRecipes instance = new ModRecipes();

    public void initRecipes(){

        GameRegistry.addSmelting(ModBlocks.FEURIUM_ORE, new ItemStack(ModItems.FEURIUM_INGOT), 2.0F);
        GameRegistry.addSmelting(ModBlocks.IRIDIUM_ORE, new ItemStack(ModItems.IRIDIUM_INGOT), 1.75F);
        GameRegistry.addSmelting(ModBlocks.TRITIUM_ORE, new ItemStack(ModItems.TRITIUM_INGOT), 1.5F);

    }
}
