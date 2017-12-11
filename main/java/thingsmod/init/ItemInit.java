package thingsmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import thingsmod.objects.armors.ArmorBase;
import thingsmod.objects.items.ItemBase;
import thingsmod.objects.tools.ToolCP0;
import thingsmod.objects.tools.ToolCP1;
import thingsmod.objects.tools.ToolCP2;
import thingsmod.objects.tools.ToolCP3;
import thingsmod.objects.tools.ToolCP4;
import thingsmod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial TOOLCP = EnumHelper.addToolMaterial("toolcp", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial VOIDARMOR = EnumHelper.addArmorMaterial("voidarmor", Reference.MODID + ":void", 13, new int[]{5,10,8,5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	
	public static final Item CTIER1 = new ItemBase("ct1");
	public static final Item CTIER2 = new ItemBase("ct2");
	public static final Item CTIER3 = new ItemBase("ct3");
	public static final Item CTIER4 = new ItemBase("ct4");
	
	public static final Item CPAN0 = new ToolCP0("cp0", TOOLCP);
	public static final Item CPAN1 = new ToolCP1("cp1", TOOLCP); 
	public static final Item CPAN2 = new ToolCP2("cp2", TOOLCP);
	public static final Item CPAN3 = new ToolCP3("cp3", TOOLCP);
	public static final Item CPAN4 = new ToolCP4("cp4", TOOLCP);
	
	public static final Item BEARHIDE = new ItemBase("bearhide");
	
	public static final Item VOIDMETAL = new ItemBase("voidmetal");
	public static final Item VOIDCORE = new ItemBase("voidcore");
	
	public static final Item VOIDHELMET = new ArmorBase("voidhelmet", VOIDARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item VOIDCHESTPLATE = new ArmorBase("voidchestplate", VOIDARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item VOIDLEGGINGS = new ArmorBase("voidleggings", VOIDARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item VOIDBOOTS = new ArmorBase("voidboots", VOIDARMOR, 1, EntityEquipmentSlot.FEET);
}