package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, NineNetherRegions.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.ALLOY_HILT.get(), "合金剑柄");
        add(ModItems.AMETHYST_BEETROOT.get(), "紫晶甜菜根");
        add(ModItems.AMETHYST_DAGGER.get(), "紫晶短剑");
        add(ModItems.DIAMOND_BOWSTRING.get(), "钻石弓弦");
        add(ModItems.GHOSTLIUM.get(), "幽冥质");
        add(ModItems.HELL_NUCLEUS.get(), "§4炼狱晶核");
        add(ModItems.HELLALLOY_INGOT.get(), "§a幽冥合金锭");
        add(ModItems.HELLALLOY_AXE.get(), "§a幽冥合金斧");
        add(ModItems.HELLALLOY_HOE.get(), "§a幽冥合金锄");
        add(ModItems.HELLALLOY_PICKAXE.get(), "§a幽冥合金镐");
        add(ModItems.HELLALLOY_SHOVEL.get(), "§a幽冥合金铲");
        add(ModItems.HELLALLOY_HELMET.get(), "§a幽冥合金头盔");
        add(ModItems.HELLALLOY_CHESTPLATE.get(), "§a幽冥合金胸甲");
        add(ModItems.HELLALLOY_LEGGINGS.get(), "§a幽冥合金护腿");
        add(ModItems.HELLALLOY_BOOTS.get(), "§a幽冥合金靴子");
        add(ModItems.HELLALLOY_SWORD.get(), "§a§l幽冥合金剑");
        add(ModItems.HELLALLOY_LONGBOW.get(), "§a§l幽冥合金长弓");
        add(ModItems.HELLALLOY_ROD.get(), "§a幽冥合金棒");
        add(ModItems.NETHERITE_ROD.get(), "下界合金棒");
        add(ModItems.STYX_INGOT.get(), "§5§l冥河锭");
        add(ModItems.UNDERWORLD_BRICK.get(), "冥界砖");
        add(ModItems.UNDERWORLD_CRYSTAL.get(), "§b幽冥晶");

        add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(), "§b幽光冥界砖块");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(), "§b幽光冥界半砖");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(), "§b幽光冥界砖楼梯");
        add(ModBlocks.HELLALLOY_BLOCK.get(), "§a幽冥合金块");
        add(ModBlocks.HELLIGHT.get(), "冥光体");
        add(ModBlocks.NULL_BLOCK.get(), "§c§k？？？？？");
        add(ModBlocks.NULL_GRASSBLOCK.get(), "§c§k！！！！！");
        add(ModBlocks.PINESAP.get(), "水晶兰");
        add(ModBlocks.STYX_BLOCK.get(), "§5§l冥河块");
        add(ModBlocks.UNDERWORLDRACK.get(), "冥界岩");
        add(ModBlocks.UNDERWORLD_BRICKS.get(), "冥界砖块");
        add(ModBlocks.UNDERWORLD_BRICK_BUTTON.get(), "冥界砖按钮");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE.get(), "冥界砖栅栏");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(), "冥界砖栅栏门");
        add(ModBlocks.UNDERWORLD_BRICK_SLAB.get(), "冥界半砖");
        add(ModBlocks.UNDERWORLD_BRICK_STAIRS.get(), "冥界砖楼梯");
        add(ModBlocks.UNDERWORLD_BRICK_WALL.get(), "冥界砖墙");
        add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(), "§b幽冥晶矿石");

        add("itemGroup.nine_nether_regions_materials_tab", "§2§l九幽引：材料与杂项");
        add("itemGroup.nine_nether_regions_blocks_tab", "§2§l九幽引：方块");

        add("tooltip.nine_nether_regions.hellalloy_block", "§8§o浸润着来自冥界的力量……");
        add("tooltip.nine_nether_regions.hellalloy_ingot", "§8§o被冥界力量强化过的合金锭，坚硬无比。");
        add("tooltip.nine_nether_regions.hellalloy_pickaxe", "§8§o原来黑曜石也没有那么坚硬。");
        add("tooltip.nine_nether_regions.hellalloy_shovel", "§8§o你想让这个世界寸草不生？");
        add("tooltip.nine_nether_regions.hellalloy_axe", "§8§o光头强应该很需要它。");
        add("tooltip.nine_nether_regions.hellalloy_hoe", "§8§o校长的锄头。");
        add("tooltip.nine_nether_regions.hellalloy_sword_alt", "§8§o这把剑已经不再是Minecraft传统意义上的剑了。\n得益于优良的材料，这把剑造成的一切伤害均为不会衰减的AOE伤害。\n但不幸的是，幽冥合金并非顶级材料。由于幽冥合金的缺陷，这把剑的专属AOE伤害不会随着附魔等属性的提升而增加。\n另外，得益于嵌入这把剑的晶核，当它耐久未满时，在你的背包中它会自动恢复耐久（每2.5s恢复1点）。");
        add("tooltip.nine_nether_regions.hellalloy_sword", "§8§o按下§r§3§oAlt§r§8§o以显示更多。");
        add("tooltip.nine_nether_regions.styx_block", "§8§o这几乎是最硬的方块，除了§k基岩§r§8§o和§k???§r§8§o之外。甚至§k凋灵？？§r§8§o也不能破坏它。");
        add("tooltip.nine_nether_regions.styx_ingot", "§8§o正如冥河渡客的意志，坚不可摧。");
        add("tooltip.nine_nether_regions.alloy_hilt", "§8§o它可以被当作武器来使用，但这永远不会是它的真正作用。");
        add("tooltip.nine_nether_regions.hell_nucleus", "§8§o无尽能源。");
        add("tooltip.nine_nether_regions.hellalloy_helmet_alt", "§8§o自修复：如果该装备耐久未满，在护甲栏或玩家背包中时该装备会自动恢复耐久值§1（每2秒回复8点）§r§8§o。\n单件效果：装备在护甲栏时，持续为玩家提供§6夜视§r§8§o效果（1级），同时清除玩家身上的§7失明§r§8§o、§7黑暗§r§8§o效果。\n全套效果：对绝大多数伤害持有34%减伤，同时每10tick强制恢复玩家1点生命值，持续为玩家提供§6抗性提升§r§8§o（2级）效果。");
        add("tooltip.nine_nether_regions.hellalloy_helmet", "§8§o按下§r§3§oAlt§r§8§o以显示更多。");
        add("tooltip.nine_nether_regions.hellalloy_chestplate_alt", "§8§o自修复：如果该装备耐久未满，在护甲栏或玩家背包中时该装备会自动恢复耐久值§1（每2秒回复8点）§r§8§o。\n单件效果：装备在护甲栏时，持续为玩家提供§6抗火§r§8§o效果（1级）同时使玩家不会着火，清除玩家身上的§7凋零§r§8§o、§7中毒§r§8§o和§7挖掘疲劳§r§8§o效果。\n全套效果：对绝大多数伤害持有34%减伤，同时每10tick强制恢复玩家1点生命值，持续为玩家提供§6抗性提升§r§8§o（2级）效果。");
        add("tooltip.nine_nether_regions.hellalloy_chestplate", "§8§o按下§r§3§oAlt§r§8§o以显示更多。");
        add("tooltip.nine_nether_regions.hellalloy_leggings_alt", "§8§o自修复：如果该装备耐久未满，在护甲栏或玩家背包中时该装备会自动恢复耐久值§1（每2秒回复8点）§r§8§o。\n单件效果：装备在护甲栏时，持续为玩家提供§6跳跃提升§r§8§o效果（1级）同时清除玩家身上的§7反胃§r§8§o效果。\n全套效果：对绝大多数伤害持有34%减伤，同时每10tick强制恢复玩家1点生命值，持续为玩家提供§6抗性提升§r§8§o（2级）效果。");
        add("tooltip.nine_nether_regions.hellalloy_leggings", "§8§o按下§r§3§oAlt§r§8§o以显示更多。");
        add("tooltip.nine_nether_regions.hellalloy_boots_alt", "§8§o自修复：如果该装备耐久未满，在护甲栏或玩家背包中时该装备会自动恢复耐久值§1（每2秒回复8点）§r§8§o。\n单件效果：装备在护甲栏时，持续为玩家提供§6迅捷§r§8§o效果（2级）同时清除玩家身上的§7缓慢§r§8§o效果。\n全套效果：对绝大多数伤害持有34%减伤，同时每10tick强制恢复玩家1点生命值，持续为玩家提供§6抗性提升§r§8§o（2级）效果。");
        add("tooltip.nine_nether_regions.hellalloy_boots", "§8§o按下§r§3§oAlt§r§8§o以显示更多。");
        add("tooltip.nine_nether_regions.hellalloy_longbow", "§8§o更精准，更强大。");
    }
}
