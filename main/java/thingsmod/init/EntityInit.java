package thingsmod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;
import thingsmod.Main;
import thingsmod.entity.EntityBear;
import thingsmod.util.Reference;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("bear", EntityBear.class, Reference.ENTITY_BEAR, 50, 11437146, 9793865);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
