package thingsmod.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityBear extends EntityHorse
{

	public EntityBear(World worldIn) 
	{
		super(worldIn);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) 
	{
		return new EntityBear(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		 return this.isChild() ? SoundEvents.ENTITY_POLAR_BEAR_BABY_AMBIENT : SoundEvents.ENTITY_POLAR_BEAR_AMBIENT;
	}
	
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_POLAR_BEAR_HURT;
    }
	
	protected SoundEvent getDeathSound()
	{
	    return SoundEvents.ENTITY_POLAR_BEAR_DEATH;
	}
	
	protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_POLAR_BEAR_STEP, 0.15F, 1.0F);
    }
	
}
