package com.cx1337.nine_nether_regions.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record StormAngerEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<StormAngerEnchantmentEffect> CODEC =
            MapCodec.unit(StormAngerEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel, int enchantmentLevel, EnchantedItemInUse item, Entity entity, Vec3 origin) {
        if (enchantmentLevel == 1) {
            EntityType.LIGHTNING_BOLT.spawn(serverLevel, entity.getOnPos(), MobSpawnType.TRIGGERED);
        }
        if (enchantmentLevel == 2) {
            EntityType.LIGHTNING_BOLT.spawn(serverLevel, entity.getOnPos(), MobSpawnType.TRIGGERED);
            EntityType.LIGHTNING_BOLT.spawn(serverLevel, entity.getOnPos(), MobSpawnType.TRIGGERED);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}
