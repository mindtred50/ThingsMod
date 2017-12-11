package thingsmod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import thingsmod.entity.EntityBear;
import thingsmod.entity.render.RenderBear;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new IRenderFactory<EntityBear>() 
		{
			@Override
			public Render<? super EntityBear> createRenderFor(RenderManager manager) {
				return new RenderBear(manager);
			}
		});
	}
}
