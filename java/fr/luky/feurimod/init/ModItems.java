package fr.luky.feurimod.init;

import fr.luky.feurimod.items.*;
import fr.luky.feurimod.utils.FeurimodUtils;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> items = new ArrayList<Item>();

    //Feurium
    public static final Item FEURIUM_INGOT = new ItemItemBase("feurium_ingot");
    public static final Item FEURIUM_HELMET = new ItemArmorBase("feurium_helmet", FeurimodUtils.ArmorUtils.feurium_armor_mat, 8, EntityEquipmentSlot.HEAD);
    public static final Item FEURIUM_CHESTPLATE = new ItemArmorBase("feurium_chestplate", FeurimodUtils.ArmorUtils.feurium_armor_mat, 8, EntityEquipmentSlot.CHEST);
    public static final Item FEURIUM_LEGGINGS = new ItemArmorBase("feurium_leggings", FeurimodUtils.ArmorUtils.feurium_armor_mat, 8, EntityEquipmentSlot.LEGS);
    public static final Item FEURIUM_BOOTS = new ItemArmorBase("feurium_boots", FeurimodUtils.ArmorUtils.feurium_armor_mat, 8, EntityEquipmentSlot.FEET);
    public static final Item FEURIUM_HELM = new ItemArmorBase("feurium_helm", FeurimodUtils.ArmorUtils.feurium_armor_helm_mat, 8, EntityEquipmentSlot.HEAD);
    public static final Item FEURIUM_AXE = new ItemAxeBase("feurium_axe", FeurimodUtils.ToolUtils.feurium_tool_mat, 12.0F, -2.0F);
    public static final Item FEURIUM_HAMMER = new ItemHammerBase("feurium_hammer", FeurimodUtils.ToolUtils.feurium_tool_hammer_mat);
    public static final Item FEURIUM_PICKAXE = new ItemPickaxeBase("feurium_pickaxe", FeurimodUtils.ToolUtils.feurium_tool_mat);
    public static final Item FEURIUM_SHOVEL = new ItemShovelBase("feurium_shovel", FeurimodUtils.ToolUtils.feurium_tool_mat);
    public static final Item FEURIUM_SWORD = new ItemSwordBase("feurium_sword", FeurimodUtils.ToolUtils.feurium_tool_mat);
    public static final Item FEURIUM_FASTSWORD = new ItemFastSword("feurium_fastsword", FeurimodUtils.ToolUtils.feurium_tool_mat);
    public static final Item FEURIUM_CHICKEN = new ItemFeuriumChicken("feurium_chicken", 14, 16, false);

    //Protium
    public static final Item PROTIUM_INGOT = new ItemItemBase("protium_ingot");
    public static final Item PROTIUM_HELMET = new ItemArmorBase("protium_helmet", FeurimodUtils.ArmorUtils.protium_armor_mat, 9, EntityEquipmentSlot.HEAD);
    public static final Item PROTIUM_CHESTPLATE = new ItemArmorBase("protium_chestplate", FeurimodUtils.ArmorUtils.protium_armor_mat, 9, EntityEquipmentSlot.CHEST);
    public static final Item PROTIUM_LEGGINGS = new ItemArmorBase("protium_leggings", FeurimodUtils.ArmorUtils.protium_armor_mat, 9, EntityEquipmentSlot.LEGS);
    public static final Item PROTIUM_BOOTS = new ItemArmorBase("protium_boots", FeurimodUtils.ArmorUtils.protium_armor_mat, 9, EntityEquipmentSlot.FEET);
    public static final Item PROTIUM_HELM = new ItemArmorBase("protium_helm", FeurimodUtils.ArmorUtils.protium_armor_helm_mat, 9, EntityEquipmentSlot.HEAD);
    public static final Item PROTIUM_AXE = new ItemAxeBase("protium_axe", FeurimodUtils.ToolUtils.protium_tool_mat, 14.0F, -1.5F);
    public static final Item PROTIUM_HAMMER = new ItemHammerBase("protium_hammer", FeurimodUtils.ToolUtils.protium_tool_hammer_mat);
    public static final Item PROTIUM_PICKAXE = new ItemPickaxeBase("protium_pickaxe", FeurimodUtils.ToolUtils.protium_tool_mat);
    public static final Item PROTIUM_SHOVEL = new ItemShovelBase("protium_shovel", FeurimodUtils.ToolUtils.protium_tool_mat);
    public static final Item PROTIUM_SWORD = new ItemSwordBase("protium_sword", FeurimodUtils.ToolUtils.protium_tool_mat);

    //Iridium
    public static final Item IRIDIUM_INGOT = new ItemItemBase("iridium_ingot");
    public static final Item IRIDIUM_HELMET = new ItemArmorBase("iridium_helmet", FeurimodUtils.ArmorUtils.iridium_armor_mat, 7, EntityEquipmentSlot.HEAD);
    public static final Item IRIDIUM_CHESTPLATE = new ItemArmorBase("iridium_chestplate", FeurimodUtils.ArmorUtils.iridium_armor_mat, 7, EntityEquipmentSlot.CHEST);
    public static final Item IRIDIUM_LEGGINGS = new ItemArmorBase("iridium_leggings", FeurimodUtils.ArmorUtils.iridium_armor_mat, 7, EntityEquipmentSlot.LEGS);
    public static final Item IRIDIUM_BOOTS = new ItemArmorBase("iridium_boots", FeurimodUtils.ArmorUtils.iridium_armor_mat, 7, EntityEquipmentSlot.FEET);
    public static final Item IRIDIUM_HELM = new ItemArmorBase("iridium_helm", FeurimodUtils.ArmorUtils.iridium_armor_helm_mat, 7, EntityEquipmentSlot.HEAD);
    public static final Item IRIDIUM_AXE = new ItemAxeBase("iridium_axe", FeurimodUtils.ToolUtils.iridium_tool_mat, 10.0F, -2.25F);
    public static final Item IRIDIUM_PICKAXE = new ItemPickaxeBase("iridium_pickaxe", FeurimodUtils.ToolUtils.iridium_tool_mat);
    public static final Item IRIDIUM_SHOVEL = new ItemShovelBase("iridium_shovel", FeurimodUtils.ToolUtils.iridium_tool_mat);
    public static final Item IRIDIUM_SWORD = new ItemSwordBase("iridium_sword", FeurimodUtils.ToolUtils.iridium_tool_mat);
    public static final Item IRIDIUM_HAMMER = new ItemHammerBase("iridium_hammer", FeurimodUtils.ToolUtils.iridium_tool_hammer_mat);

    //Tritium
    public static final Item TRITIUM_INGOT = new ItemItemBase("tritium_ingot");
    public static final Item TRITIUM_HELMET = new ItemArmorBase("tritium_helmet", FeurimodUtils.ArmorUtils.tritium_armor_mat, 6, EntityEquipmentSlot.HEAD);
    public static final Item TRITIUM_CHESTPLATE = new ItemArmorBase("tritium_chestplate", FeurimodUtils.ArmorUtils.tritium_armor_mat, 6, EntityEquipmentSlot.CHEST);
    public static final Item TRITIUM_LEGGINGS = new ItemArmorBase("tritium_leggings", FeurimodUtils.ArmorUtils.tritium_armor_mat, 6, EntityEquipmentSlot.LEGS);
    public static final Item TRITIUM_BOOTS = new ItemArmorBase("tritium_boots", FeurimodUtils.ArmorUtils.tritium_armor_mat, 6, EntityEquipmentSlot.FEET);
    public static final Item TRITIUM_HELM = new ItemArmorBase("tritium_helm", FeurimodUtils.ArmorUtils.tritium_armor_helm_mat, 6, EntityEquipmentSlot.HEAD);
    public static final Item TRITIUM_AXE = new ItemAxeBase("tritium_axe", FeurimodUtils.ToolUtils.tritium_tool_mat, 8.0F, -2.50F);
    public static final Item TRITIUM_PICKAXE = new ItemPickaxeBase("tritium_pickaxe", FeurimodUtils.ToolUtils.tritium_tool_mat);
    public static final Item TRITIUM_SHOVEL = new ItemShovelBase("tritium_shovel", FeurimodUtils.ToolUtils.tritium_tool_mat);
    public static final Item TRITIUM_SWORD = new ItemSwordBase("tritium_sword", FeurimodUtils.ToolUtils.tritium_tool_mat);
    public static final Item TRITIUM_HAMMER = new ItemHammerBase("tritium_hammer", FeurimodUtils.ToolUtils.tritium_tool_hammer_mat);

    //Autres
    public static final Item IRON_STICK = new ItemItemBase("iron_stick");

}
