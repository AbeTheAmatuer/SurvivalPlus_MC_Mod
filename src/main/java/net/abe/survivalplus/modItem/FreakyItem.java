package net.abe.survivalplus.modItem;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.w3c.dom.Text;

import static org.w3c.dom.Text.*;

public class FreakyItem extends Item {
    public FreakyItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 2.0F, 1.0F);
        world.addParticle(ParticleTypes.GUST, true, user.getX() + 4, user.getY(), user.getZ(), 0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX() - 3, user.getY(), user.getZ(), 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX(), user.getY(), user.getZ() + 4, 0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.SQUID_INK, true, user.getX(), user.getY(), user.getZ() - 3, 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX() + 2, user.getY()+1, user.getZ(), 0.05, -0.05, -0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX() - 4, user.getY()+1, user.getZ(), 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX(), user.getY()+1, user.getZ() + 3, -0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX(), user.getY()+2, user.getZ() - 4, 0.05, -0.05, 0.05);
        world.addParticle(ParticleTypes.WARPED_SPORE, true, user.getX() + 1, user.getY(), user.getZ(), 0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX() - 2, user.getY(), user.getZ(), 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, true, user.getX(), user.getY(), user.getZ() + 2, 0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.ANGRY_VILLAGER, true, user.getX(), user.getY(), user.getZ() - 4, 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.GUST, true, user.getX() + 3, user.getY()+1, user.getZ(), 0.05, -0.05, -0.05);
        world.addParticle(ParticleTypes.WHITE_ASH, true, user.getX() - 1, user.getY()+1, user.getZ(), 0.05, 0.05, 0.05);
        world.addParticle(ParticleTypes.SONIC_BOOM, true, user.getX(), user.getY()+1, user.getZ() + 3, -0.05, 0.05, -0.05);
        world.addParticle(ParticleTypes.SQUID_INK, true, user.getX(), user.getY()+1, user.getZ() - 4, 0.05, -0.05, 0.05);
        //user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 400));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 400, 400));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 20));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 2));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400, 2));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 150, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 30, 400));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAVING, 400, 3));




        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
