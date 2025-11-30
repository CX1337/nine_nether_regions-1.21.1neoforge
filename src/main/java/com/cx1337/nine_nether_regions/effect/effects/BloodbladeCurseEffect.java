package com.cx1337.nine_nether_regions.effect.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class BloodbladeCurseEffect extends MobEffect {
    public BloodbladeCurseEffect(MobEffectCategory category, int color)
    {
        super(category, color);
    }

    @Override
    public boolean isBeneficial() {
        return false;
    }
}
