package com.cx1337.nine_nether_regions.effect.effects;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class DeclineEffect extends MobEffect {
    public static final ResourceKey<DamageType> DECLINE_DAMAGE =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID, "decline"));

    public DeclineEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        int damageInterval = Math.max(1, 60 >> amplifier);

        if (entity.tickCount % damageInterval == 0){
            DamageSource declineDamage = new DamageSource(
                    entity.level().registryAccess()
                            .registryOrThrow(Registries.DAMAGE_TYPE)
                            .getHolderOrThrow(DECLINE_DAMAGE)
            );
            entity.hurt(declineDamage, 1.0F);
            return true;
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
