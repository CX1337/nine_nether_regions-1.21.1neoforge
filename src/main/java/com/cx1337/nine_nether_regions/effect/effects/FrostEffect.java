package com.cx1337.nine_nether_regions.effect.effects;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class FrostEffect extends MobEffect {
    public FrostEffect(MobEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED,
                ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID, "frost_slowdown"), -0.2,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.level().isClientSide) {
            int hurtInterval = Math.max(1, 50 >> amplifier);
            if (entity.tickCount % hurtInterval == 0) {
                entity.hurt(entity.damageSources().freeze(), 1.0F);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean isBeneficial() {
        return false;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
