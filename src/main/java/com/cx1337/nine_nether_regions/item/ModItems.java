package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.item.custom.FuelItem;
import com.cx1337.nine_nether_regions.item.custom.ModToolTiers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(NineNetherRegions.MODID);

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
    //食物注册后需在ModFoodProperties中补全信息。
    //类似可用作燃料的方块/物品注册后需在ModDataMapProvider补全信息。

    public static final DeferredItem<PickaxeItem> HELLALLOY_PICKAXE =
                        ITEMS.register("hellalloy_pickaxe", () -> new PickaxeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(PickaxeItem.createAttributes(ModToolTiers.HELLALLOY, 1.0F, -2.8F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_pickaxe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<ShovelItem> HELLALLOY_SHOVEL =
                        ITEMS.register("hellalloy_shovel", () -> new ShovelItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(ShovelItem.createAttributes(ModToolTiers.HELLALLOY, 1.5F, -3.0F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_shovel"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<AxeItem> HELLALLOY_AXE =
                        ITEMS.register("hellalloy_axe", () -> new AxeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(AxeItem.createAttributes(ModToolTiers.HELLALLOY, 6.0F, -3.2F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_axe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });
    public static final DeferredItem<HoeItem> HELLALLOY_HOE =
                        ITEMS.register("hellalloy_hoe", () -> new HoeItem(ModToolTiers.HELLALLOY, new Item.Properties()
                                .attributes(HoeItem.createAttributes(ModToolTiers.HELLALLOY, 0.5F, -3.0F)).rarity(Rarity.RARE).fireResistant()){
                            @Override
                            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                                tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_hoe"));
                                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                            }
                        });

    public static final DeferredItem<SwordItem> ALLOY_HILT =
            ITEMS.register("alloy_hilt", () -> new SwordItem(ModToolTiers.HELLALLOY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HELLALLOY, -6.0F, -2.0F)).rarity(Rarity.EPIC).fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.alloy_hilt"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

//幽冥合金剑
    public static final DeferredItem<SwordItem> HELLALLOY_SWORD =
            ITEMS.register("hellalloy_sword", () -> new SwordItem(ModToolTiers.HELLALLOY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HELLALLOY, 4.0F, -2.4F)).rarity(Rarity.EPIC).fireResistant()) {
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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}