package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.*;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IItemExtension;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(NineNetherRegions.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private abstract static class ArmorItemExt extends ArmorItem implements IItemExtension{
        ArmorItemExt(Holder<ArmorMaterial> mat, Type type, Properties props) {super(mat, type, props);}
        public abstract int getDamagePerUseRaw(float rawDamage, ItemStack stack, LivingEntity entity, EquipmentSlot slot);
    }

    //紫水晶短剑
    public static final Tier AMETHYST = new Tier() {
        @Override
        public int getUses() {
            return 114;
        }

        @Override
        public float getSpeed() {
            return 12;
        }

        @Override
        public float getAttackDamageBonus() {
            return 0;
        }
        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return null;
        }
        @Override
        public int getEnchantmentValue() {
            return 10;
        }
        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };
    public static final DeferredItem<SwordItem> AMETHYST_DAGGER =
           ITEMS.register("amethyst_dagger", () -> new SwordItem(AMETHYST, new Item.Properties()
                   .attributes(SwordItem.createAttributes(AMETHYST, 4, -1.6F)).rarity(Rarity.COMMON)){

               //每次攻击40%概率回2血量。
               @Override
               public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
                   if (player.level().random.nextFloat() < 0.40f && player.getHealth() < player.getMaxHealth()) {
                       player.heal(2.0f);
                   }
                   return false; // 不拦截左键
               }
           });

    //材料和杂项。
    public static final DeferredItem<Item> HELLALLOY_INGOT =
            ITEMS.register("hellalloy_ingot", () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_ingot"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STYX_INGOT =
            ITEMS.register("styx_ingot", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.styx_ingot"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> UNDERWORLD_BRICK =
            ITEMS.register("underworld_brick", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> UNDERWORLD_CRYSTAL =
            ITEMS.register("underworld_crystal", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> NETHERITE_ROD =
            ITEMS.register("netherite_rod", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));
    public static final DeferredItem<Item> HELLALLOY_ROD =
            ITEMS.register("hellalloy_rod", () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final DeferredItem<Item> HELL_NUCLEUS =
            ITEMS.register("hell_nucleus", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hell_nucleus"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GHOSTLIUM =
            ITEMS.register("ghostlium", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    public static final DeferredItem<Item> AMETHYST_BEETROOT =
            ITEMS.register("amethyst_beetroot", () -> new Item(new Item.Properties().food(ModFoodProperties.AMETHYST_BEETROOT)
                    .rarity(Rarity.COMMON)));

    public static final DeferredItem<Item> DIAMOND_BOWSTRING =
            ITEMS.register("diamond_bowstring", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    //食物注册后需在ModFoodProperties中补全信息。
    //类似可用作燃料的方块/物品注册后需在ModDataMapProvider补全信息。

    //弓。
    public static final DeferredItem<Item> HELLALLOY_LONGBOW =
            ITEMS.register("hellalloy_longbow", () -> new BowItem(new Item.Properties().fireResistant()
                    .rarity(Rarity.RARE).durability(6446)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_longbow"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

                @Override
                protected void shootProjectile(LivingEntity shooter, Projectile projectile, int index, float velocity, float inaccuracy, float angle,
                                               @Nullable LivingEntity target) {
                    //箭矢初速度3倍
                    float modifiedVelocity = velocity * 3.0F;

                    super.shootProjectile(shooter, projectile, index, modifiedVelocity, inaccuracy, angle, target);

                    if (projectile instanceof AbstractArrow arrow) {
                        arrow.setBaseDamage(4.0F);
                    }
                }

                @Override
                public int getDefaultProjectileRange() {
                    return 32;
                }
            });

    //盔甲。
    public static final DeferredItem<ArmorItem> HELLALLOY_HELMET =
            ITEMS.register("hellalloy_helmet", () ->new ArmorItemExt(ModArmorMaterials.HELLALLOY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties() .durability(ArmorItem.Type.HELMET.getDurability(99)).rarity(Rarity.EPIC).fireResistant()){

                @Override
                public int getDamagePerUseRaw(float rawDamage, ItemStack stack, LivingEntity entity, EquipmentSlot slot) {
                    return 24;
                }

                @Override
                public boolean isEnchantable(ItemStack stack) {
                    return true;
                }
                @Override
                public int getEnchantmentValue() {
                    return ModToolTiers.HELLALLOY.getEnchantmentValue();
                }

                @Override
                public void inventoryTick(ItemStack stack, Level level, Entity entity,
                                          int slot, boolean selected) {
                   //耐久修复
                    if (!level.isClientSide
                            && entity instanceof LivingEntity living
                            && living.tickCount % 40 == 0
                            && stack.getDamageValue() > 0) {
                        stack.setDamageValue(Math.max(0, stack.getDamageValue() - 8));
                    }

                    if (level.isClientSide) return;
                    if (!(entity instanceof Player player)) return;

                    if (player.getItemBySlot(EquipmentSlot.HEAD) != stack) return;

                    //效果
                    player.addEffect(new MobEffectInstance(
                            MobEffects.NIGHT_VISION,310,0,true,false,false
                    ));

                    if (player.hasEffect(MobEffects.BLINDNESS)) {
                        player.removeEffect(MobEffects.BLINDNESS);
                    }

                    if (player.hasEffect(MobEffects.DARKNESS)) {
                        player.removeEffect(MobEffects.DARKNESS);
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasAltDown()){
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_helmet_alt"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_helmet"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<ArmorItem> HELLALLOY_CHESTPLATE =
            ITEMS.register("hellalloy_chestplate", () ->new ArmorItemExt(ModArmorMaterials.HELLALLOY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties() .durability(ArmorItem.Type.CHESTPLATE.getDurability(99)).rarity(Rarity.EPIC).fireResistant()){

                @Override
                public int getDamagePerUseRaw(float rawDamage, ItemStack stack, LivingEntity entity, EquipmentSlot slot) {
                    return 24;
                }

                @Override
                public boolean isEnchantable(ItemStack stack) {
                    return true;
                }
                @Override
                public int getEnchantmentValue() {
                    return ModToolTiers.HELLALLOY.getEnchantmentValue();
                }

                @Override
                public void inventoryTick(ItemStack stack, Level level, Entity entity,
                                          int slot, boolean selected) {
                    if (!level.isClientSide
                            && entity instanceof LivingEntity living
                            && living.tickCount % 40 == 0
                            && stack.getDamageValue() > 0) {
                        stack.setDamageValue(Math.max(0, stack.getDamageValue() - 8));
                    }

                    if (level.isClientSide) return;
                    if (!(entity instanceof Player player)) return;

                    if (player.getItemBySlot(EquipmentSlot.CHEST) != stack) return;

                    player.addEffect(new MobEffectInstance(
                            MobEffects.FIRE_RESISTANCE,310,0,true,false,false
                    ));

                    if (player.isOnFire()){
                        player.clearFire();
                    }
                    if (player.getRemainingFireTicks() > 0){
                        player.setRemainingFireTicks(0);
                    }

                    if (player.hasEffect(MobEffects.WITHER)) {
                        player.removeEffect(MobEffects.WITHER);
                    }
                    if (player.hasEffect(MobEffects.POISON)) {
                        player.removeEffect(MobEffects.POISON);
                    }
                    if (player.hasEffect(MobEffects.DIG_SLOWDOWN)) {
                        player.removeEffect(MobEffects.DIG_SLOWDOWN);
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasAltDown()){
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_chestplate_alt"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_chestplate"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<ArmorItem> HELLALLOY_LEGGINGS =
            ITEMS.register("hellalloy_leggings", () ->new ArmorItemExt(ModArmorMaterials.HELLALLOY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties() .durability(ArmorItem.Type.LEGGINGS.getDurability(99)).rarity(Rarity.EPIC).fireResistant()){

                @Override
                public int getDamagePerUseRaw(float rawDamage, ItemStack stack, LivingEntity entity, EquipmentSlot slot) {
                    return 24;
                }

                @Override
                public boolean isEnchantable(ItemStack stack) {
                    return true;
                }
                @Override
                public int getEnchantmentValue() {
                    return ModToolTiers.HELLALLOY.getEnchantmentValue();
                }

                @Override
                public void inventoryTick(ItemStack stack, Level level, Entity entity,
                                          int slot, boolean selected) {
                    if (!level.isClientSide
                            && entity instanceof LivingEntity living
                            && living.tickCount % 40 == 0
                            && stack.getDamageValue() > 0) {
                        stack.setDamageValue(Math.max(0, stack.getDamageValue() - 8));
                    }

                    if (level.isClientSide) return;
                    if (!(entity instanceof Player player)) return;

                    if (player.getItemBySlot(EquipmentSlot.LEGS) != stack) return;

                    player.addEffect(new MobEffectInstance(
                            MobEffects.JUMP,310,0,true,false,false
                    ));

                    if (player.hasEffect(MobEffects.CONFUSION)) {
                        player.removeEffect(MobEffects.CONFUSION);
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasAltDown()){
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_leggings_alt"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_leggings"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<ArmorItem> HELLALLOY_BOOTS =
            ITEMS.register("hellalloy_boots", () ->new ArmorItemExt(ModArmorMaterials.HELLALLOY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties() .durability(ArmorItem.Type.BOOTS.getDurability(99)).rarity(Rarity.EPIC).fireResistant()){

                @Override
                public int getDamagePerUseRaw(float rawDamage, ItemStack stack, LivingEntity entity, EquipmentSlot slot) {
                    return 24;
                }

                @Override
                public boolean isEnchantable(ItemStack stack) {
                    return true;
                }
                @Override
                public int getEnchantmentValue() {
                    return ModToolTiers.HELLALLOY.getEnchantmentValue();
                }

                @Override
                public void inventoryTick(ItemStack stack, Level level, Entity entity,
                                          int slot, boolean selected) {
                    if (!level.isClientSide
                            && entity instanceof LivingEntity living
                            && living.tickCount % 40 == 0
                            && stack.getDamageValue() > 0) {
                        stack.setDamageValue(Math.max(0, stack.getDamageValue() - 8));
                    }

                    if (level.isClientSide) return;
                    if (!(entity instanceof Player player)) return;

                    if (player.getItemBySlot(EquipmentSlot.FEET) != stack) return;

                    player.addEffect(new MobEffectInstance(
                            MobEffects.MOVEMENT_SPEED,310,1,true,false,false
                    ));

                    if (player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                        player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasAltDown()){
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_boots_alt"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_boots"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    //工具。
    public static final DeferredItem<PickaxeItem> HELLALLOY_PICKAXE =
                        ITEMS.register("hellalloy_pickaxe", () -> new PickaxeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(PickaxeItem.createAttributes(ModToolTiers.HELLALLOY, 1.0F, -2.6F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public boolean isEnchantable(ItemStack stack) {
                                return true;
                            }
                            @Override
                            public int getEnchantmentValue() {
                                return ModToolTiers.HELLALLOY.getEnchantmentValue();
                            }

                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_pickaxe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<ShovelItem> HELLALLOY_SHOVEL =
                        ITEMS.register("hellalloy_shovel", () -> new ShovelItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(ShovelItem.createAttributes(ModToolTiers.HELLALLOY, 1.5F, -2.8F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public boolean isEnchantable(ItemStack stack) {
                                return true;
                            }
                            @Override
                            public int getEnchantmentValue() {
                                return ModToolTiers.HELLALLOY.getEnchantmentValue();
                            }

                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_shovel"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<AxeItem> HELLALLOY_AXE =
                        ITEMS.register("hellalloy_axe", () -> new AxeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(AxeItem.createAttributes(ModToolTiers.HELLALLOY, 6.0F, -2.8F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public boolean isEnchantable(ItemStack stack) {
                                return true;
                            }
                            @Override
                            public int getEnchantmentValue() {
                                return ModToolTiers.HELLALLOY.getEnchantmentValue();
                            }

                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_axe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<HoeItem> HELLALLOY_HOE =
                        ITEMS.register("hellalloy_hoe", () -> new HoeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(HoeItem.createAttributes(ModToolTiers.HELLALLOY, 0.5F, -1.0F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public boolean isEnchantable(ItemStack stack) {
                                return true;
                            }
                            @Override
                            public int getEnchantmentValue() {
                                return ModToolTiers.HELLALLOY.getEnchantmentValue();
                            }

                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_hoe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });

    public static final DeferredItem<SwordItem> ALLOY_HILT =
            ITEMS.register("alloy_hilt", () -> new SwordItem(ModToolTiers.HELLALLOY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HELLALLOY, -6.0F, -1.0F)).rarity(Rarity.EPIC).fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.alloy_hilt"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    //幽冥合金剑
    public static final DeferredItem<SwordItem> HELLALLOY_SWORD =
            ITEMS.register("hellalloy_sword", () -> new SwordItem(ModToolTiers.HELLALLOY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HELLALLOY, 4.0F, -2.0F)).rarity(Rarity.EPIC).fireResistant()) {
                @Override
                public boolean onLeftClickEntity(ItemStack stack, Player player, Entity target) {
                    if (player.level() instanceof ServerLevel sl) {
                        AABB box = target.getBoundingBox().inflate(1.0D);
                        for (LivingEntity le : sl.getEntitiesOfClass(LivingEntity.class, box,
                                e -> e != target && e != player && !player.isAlliedTo(e))) {
                            le.hurt(player.damageSources().playerAttack(player), 16.0F);
                            le.knockback(0.2F,
                                    player.getX() - le.getX(),
                                    player.getZ() - le.getZ());
                        }
                    }
                    return super.onLeftClickEntity(stack, player, target);
                }

                @Override
                public boolean isEnchantable(ItemStack stack) {
                    return true;
                }
                @Override
                public int getEnchantmentValue() {
                    return ModToolTiers.HELLALLOY.getEnchantmentValue();
                }

                @Override
                public void inventoryTick(ItemStack stack, Level level, Entity holder,
                                          int slot, boolean selected) {
                    if (level.isClientSide) return;
                    if (!(holder instanceof Player player)) return;

                    if (stack.getDamageValue() > 0 && holder.tickCount % 50 == 0) {
                        stack.setDamageValue(stack.getDamageValue() - 1);
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                   if (Screen.hasAltDown()){
                       tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_sword_alt"));
                   } else {
                       tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_sword"));
                   }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
}