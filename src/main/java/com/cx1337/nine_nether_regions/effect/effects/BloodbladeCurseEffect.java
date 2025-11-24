package com.cx1337.nine_nether_regions.effect.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.flag.FeatureFlagSet;

public class BloodbladeCurseEffect extends MobEffect {
    public BloodbladeCurseEffect() {
        super(MobEffectCategory.HARMFUL, 0x8B0000);
    }

    @Override
    public boolean isBeneficial() {
        return false;
    }
}
