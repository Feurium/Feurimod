package fr.luky.feurimod.utils;

import fr.luky.feurimod.ModFeurimod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class FeurimodUtils {

    public static class ArmorUtils{

        //Feurium
        public static ItemArmor.ArmorMaterial feurium_armor_mat = EnumHelper.addArmorMaterial("feurium_armor_mat", Reference.MODID + ":feuriumarmor", 45, new int[]{6, 9, 11, 6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
        public static ItemArmor.ArmorMaterial feurium_armor_helm_mat = EnumHelper.addArmorMaterial("feurium_armor_helm_mat", Reference.MODID + ":feuriumhelmarmor", 45, new int []{0, 0, 0, 7}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);

        //Protium
        public static ItemArmor.ArmorMaterial protium_armor_mat = EnumHelper.addArmorMaterial("protium_armor_mat", Reference.MODID + ":protiumarmor", 60, new int[]{10, 13, 15, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
        public static ItemArmor.ArmorMaterial protium_armor_helm_mat = EnumHelper.addArmorMaterial("protium_armor_helm_mat", Reference.MODID + ":protiumhelmarmor", 60, new int[]{0,0,0,11}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);

        //Iridium
        public static ItemArmor.ArmorMaterial iridium_armor_mat = EnumHelper.addArmorMaterial("iridium_armor_mat", Reference.MODID + ":iridiumarmor", 40, new int[]{5, 8, 10, 5}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
        public static ItemArmor.ArmorMaterial iridium_armor_helm_mat = EnumHelper.addArmorMaterial("iridium_armor_helm_mat", Reference.MODID + ":iridiumhelmarmor", 40, new int[]{0, 0, 0, 6}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);

        //Tritium
        public static ItemArmor.ArmorMaterial tritium_armor_mat = EnumHelper.addArmorMaterial("tritium_armor_mat", Reference.MODID + ":tritiumarmor", 35, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
        public static ItemArmor.ArmorMaterial tritium_armor_helm_mat = EnumHelper.addArmorMaterial("tritium_armor_helm_mat", Reference.MODID + ":tritiumhelmarmor", 35, new int[] {0, 0, 0, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

        //Autres
    }

    public static class ToolUtils{

        //Feurium
        public static Item.ToolMaterial feurium_tool_mat = EnumHelper.addToolMaterial("feurium_tool_mat", 6, 1799, 10.0F, 7.0F, 12);
        public static Item.ToolMaterial feurium_tool_hammer_mat = EnumHelper.addToolMaterial("feurium_tool_hammer_mat", 6, 1799, 4.0F, 7.0F, 12);

        //Protium
        public static Item.ToolMaterial protium_tool_mat = EnumHelper.addToolMaterial("protium_tool_mat", 10, 2999, 20.0F, 10.0F, 20);
        public static Item.ToolMaterial protium_tool_hammer_mat = EnumHelper.addToolMaterial("protium_tool_hammer_mat", 6, 2999, 12.0F, 10.0F, 20);

        //Iridium
        public static Item.ToolMaterial iridium_tool_mat = EnumHelper.addToolMaterial("iridium_tool_mat", 5, 1699, 8.0F, 6.0F, 11);
        public static Item.ToolMaterial iridium_tool_hammer_mat = EnumHelper.addToolMaterial("iridium_tool_hammer_mat", 5, 1699, 2.0F, 6.0F, 11);

        //Tritium
        public static Item.ToolMaterial tritium_tool_mat = EnumHelper.addToolMaterial("tritium_tool_mat", 4, 1599, 6.0F, 5.0F, 10);
        public static Item.ToolMaterial tritium_tool_hammer_mat = EnumHelper.addToolMaterial("tritium_tool_hammer_mat", 4, 1599, 1.0F, 5.0F, 10);

        //Autres
    }
}
