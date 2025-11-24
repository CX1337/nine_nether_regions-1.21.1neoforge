package com.cx1337.nine_nether_regions.effect;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.effect.effects.BloodbladeCurseEffect;
import com.cx1337.nine_nether_regions.effect.effects.DeclineEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, NineNetherRegions.MODID);

    public static final DeferredHolder<MobEffect, DeclineEffect> DECLINE =
            MOB_EFFECTS.register("decline", () -> new DeclineEffect(MobEffectCategory.HARMFUL, 0x013220));
    public static final DeferredHolder<MobEffect, BloodbladeCurseEffect> BLOODBLADE_CURSE =
            MOB_EFFECTS.register("bloodblade_curse", BloodbladeCurseEffect::new);

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
