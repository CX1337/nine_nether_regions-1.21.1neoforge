package com.cx1337.nine_nether_regions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties AMETHYST_BEETROOT =
            new FoodProperties.Builder().nutrition(2).saturationModifier(0.5F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 0),1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0),0.32F)
                    .alwaysEdible().fast().build();
}
