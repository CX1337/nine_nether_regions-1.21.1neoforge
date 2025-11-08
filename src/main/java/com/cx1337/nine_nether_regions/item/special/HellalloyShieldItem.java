package com.cx1337.nine_nether_regions.item.special;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;

import java.util.List;

public class HellalloyShieldItem extends ShieldItem {

    public static void registerEvents() {
    }

    public HellalloyShieldItem(Properties properties) {
        super(properties.durability(40004));
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 40004;
    }

    //范围setHealth
    public static void triggerAreaDamage(Player player, Level level) {
        if (level.isClientSide()) return;

        BlockPos playerPos = player.blockPosition();
        AABB area = new AABB(playerPos).inflate(3.0);
        List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, area);

        for (LivingEntity entity : entities) {
            if (entity instanceof Monster && entity != player) {
                float newHealth = entity.getHealth() - 15.0f;
                if (newHealth <= 0) {
                    entity.die(player.damageSources().playerAttack(player));
                } else {
                    entity.setHealth(newHealth);
                }
            }
        }
    }

    //自修复
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);

        if (!level.isClientSide() && level.getGameTime() % 60 == 0 && entity instanceof Player player) {
            if (stack.getDamageValue() > 0) {
                stack.setDamageValue(Math.max(stack.getDamageValue() - 8, 0));
            }
        }
    }
}
