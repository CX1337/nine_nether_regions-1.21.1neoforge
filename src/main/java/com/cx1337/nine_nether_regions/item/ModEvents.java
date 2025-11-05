package com.cx1337.nine_nether_regions.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import javax.swing.*;

public class ModEvents {
    private int tickCounter = 0;

    public static void register(IEventBus modBus) {
        NeoForge.EVENT_BUS.register(new ModEvents());
    }

    @net.neoforged.bus.api.SubscribeEvent
    public void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        boolean fullSet =
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.HELLALLOY_HELMET.get()) &&
                player.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.HELLALLOY_CHESTPLATE.get()) &&
                player.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.HELLALLOY_LEGGINGS.get()) &&
                player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.HELLALLOY_BOOTS.get());

        if (fullSet) {
           addIfMissing(player, MobEffects.DAMAGE_RESISTANCE, 310, 1, false);

           //强制恢复生命值。
          tickCounter++;
          if (tickCounter >= 10) {
              tickCounter = 0;

              float currentHealth = player.getHealth();
              float maxHealth = player.getMaxHealth();

              if (currentHealth < maxHealth) {
                  float newHealth = Math.min(currentHealth + 1.0F, maxHealth);
                  player.setHealth(newHealth);
              }
          }
        } else {
            tickCounter = 0;
        }
    }
    private void addIfMissing(Player player, Holder<MobEffect> effect, int duration, int amplifier, boolean particles) {
        MobEffectInstance inst = player.getEffect(effect);
        if (inst == null || inst.getAmplifier() < amplifier || inst.getDuration() < 300) {
            player.addEffect(new MobEffectInstance(effect, duration, amplifier,true, particles, true));
        }
    }

    //减伤
    @net.neoforged.bus.api.SubscribeEvent
    public void onLivingHurt(LivingDamageEvent.Pre event) {
        if (event.getEntity() instanceof Player player) {

            boolean fullSet =
                    player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.HELLALLOY_HELMET.get()) &&
                            player.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.HELLALLOY_CHESTPLATE.get()) &&
                            player.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.HELLALLOY_LEGGINGS.get()) &&
                            player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.HELLALLOY_BOOTS.get());

            if (fullSet) {

                float originalDamage = event.getNewDamage();
                float reducedDamage = originalDamage * 0.66f;

                event.setNewDamage(reducedDamage);
            }
        }
    }
}
