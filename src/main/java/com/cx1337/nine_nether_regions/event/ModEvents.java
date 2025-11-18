package com.cx1337.nine_nether_regions.event;

import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.util.HashSet;
import java.util.Set;

public class ModEvents {
    // 方块物品防火防雷防仙人掌
    private static final Set<Item> FIREPROOF_ITEMS = new HashSet<>();


    private int tickCounter = 0;

    public static void register() {
        NeoForge.EVENT_BUS.register(new ModEvents());
    }
    public static void initFireProofItems() {
        FIREPROOF_ITEMS.clear();
        FIREPROOF_ITEMS.add(ModBlocks.HELLALLOY_BLOCK.get().asItem());
        FIREPROOF_ITEMS.add(ModBlocks.HELL_NUCLEUS.get().asItem());
        FIREPROOF_ITEMS.add(ModBlocks.STYX_BLOCK.get().asItem());
        FIREPROOF_ITEMS.add(ModItems.ALLOY_HILT.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_INGOT.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_ROD.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_LONGBOW.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_HELMET.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_CHESTPLATE.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_LEGGINGS.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_BOOTS.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_AXE.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_HOE.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_PICKAXE.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_SHOVEL.get());
        FIREPROOF_ITEMS.add(ModItems.HELLALLOY_SWORD.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_FABRIC.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_INGOT.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_HELMET.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_CHESTPLATE.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_LEGGINGS.get());
        FIREPROOF_ITEMS.add(ModItems.STYX_BOOTS.get());
    }

    @SubscribeEvent
    public void makeBlockItemFireproof(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof ItemEntity itemEntity &&
                FIREPROOF_ITEMS.contains(itemEntity.getItem().getItem())) {
            itemEntity.setUnlimitedLifetime();
            itemEntity.setInvulnerable(true);
        }
    }

    // 幽冥合金套全套效果
    @SubscribeEvent
    public void onPlayerTick(PlayerTickEvent.Post event) {
        if (event.getEntity().level().isClientSide()) {
            return;
        }

        Player player = event.getEntity();
        boolean fullSet =
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.HELLALLOY_HELMET.get()) &&
                        player.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.HELLALLOY_CHESTPLATE.get()) &&
                        player.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.HELLALLOY_LEGGINGS.get()) &&
                        player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.HELLALLOY_BOOTS.get());

        if (fullSet) {
            addIfMissing(player, MobEffects.DAMAGE_RESISTANCE, 310, 1, false);

            // 强制恢复生命值
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
            player.addEffect(new MobEffectInstance(effect, duration, amplifier, true, particles, true));
        }
    }

    //减伤
    @SubscribeEvent
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

    //冥河套全套效果。
    @SubscribeEvent
    public void onPlayerTickStyx(PlayerTickEvent.Post event) {
        if (event.getEntity().level().isClientSide()) {
            return;
        }

        Player player = event.getEntity();
        boolean fullSet =
                player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.STYX_HELMET.get()) &&
                        player.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.STYX_CHESTPLATE.get()) &&
                        player.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.STYX_LEGGINGS.get()) &&
                        player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.STYX_BOOTS.get());

        if (fullSet) {
            addIfMissingStyx(player, MobEffects.DAMAGE_RESISTANCE, 310, 2, false);
            addIfMissingStyx(player, MobEffects.ABSORPTION, 310, 1, false);

            //强制恢复生命值
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

    private void addIfMissingStyx(Player player, Holder<MobEffect> effect, int duration, int amplifier, boolean particles) {
        MobEffectInstance inst = player.getEffect(effect);
        if (inst == null || inst.getAmplifier() < amplifier || inst.getDuration() < 300) {
            player.addEffect(new MobEffectInstance(effect, duration, amplifier, true, particles, true));
        }
    }

    //减伤
    @SubscribeEvent
    public void onLivingHurtStyx(LivingDamageEvent.Pre event) {
        if (event.getEntity() instanceof Player player) {
            boolean fullSet =
                    player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.STYX_HELMET.get()) &&
                            player.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.STYX_CHESTPLATE.get()) &&
                            player.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.STYX_LEGGINGS.get()) &&
                            player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.STYX_BOOTS.get());
            if (fullSet) {
                DamageSource source = event.getSource();
                if (source.is(DamageTypes.MAGIC) || source.is(DamageTypes.DRAGON_BREATH)
                || source.is(DamageTypes.WITHER)) {
                    event.setNewDamage(0.0f);
                    return;
                }
                if (source.is(DamageTypes.EXPLOSION) || source.is(DamageTypes.PLAYER_EXPLOSION) ||
                 source.is(DamageTypes.BAD_RESPAWN_POINT) || source.is(DamageTypes.WITHER_SKULL)) {
                    event.setNewDamage(0.0f);
                    return;
                }
                if (source.is(DamageTypes.FREEZE)) {
                    event.setNewDamage(0.0f);
                    return;
                }
                if (source.is(DamageTypes.SONIC_BOOM)) {
                    event.setNewDamage(0.0f);
                    return;
                }
            }

            float originalDamage = event.getNewDamage();
                if (fullSet && originalDamage <= 3.0f) {
                    event.setNewDamage(0.0f);
                    return;
            }
                if (fullSet) {
                    float reducedDamage = originalDamage * 0.28f;
                    event.setNewDamage(reducedDamage);
                }

            boolean hasBoots = player.getItemBySlot(EquipmentSlot.FEET).is(ModItems.STYX_BOOTS.get());
                if (hasBoots && event.getSource().is(DamageTypes.FALL)) {
                    float reducedFallDamage = originalDamage * 0.15f;
                    event.setNewDamage(reducedFallDamage);
                }
        }
    }
}
