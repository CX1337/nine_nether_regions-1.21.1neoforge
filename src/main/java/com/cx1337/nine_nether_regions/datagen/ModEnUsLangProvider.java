package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, NineNetherRegions.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.ALLOY_HILT.get(), "Alloy Hilt");
        add(ModItems.AMETHYST_BEETROOT.get(), "Amethyst Beetroot");
        add(ModItems.AMETHYST_DAGGER.get(), "Amethyst Dagger");
        add(ModItems.MUSIC_DISC_STYX_FERRYMAN.get(), "Rafael Krux -- Dawn of the Apocalypse");
        add(ModItems.DIAMOND_BOWSTRING.get(), "Diamond Bowstring");
        add(ModItems.EMPTY_FABRIC.get(), "Empty Fabric");
        add(ModItems.MAGIC_FABRIC.get(), "Magic Fabric");
        add(ModItems.STYX_FABRIC.get(), "Styx Fabric");
        add(ModItems.GHOSTLIUM.get(), "Ghostlium");
        add(ModItems.HELLALLOY_INGOT.get(), "§aHellalloy Ingot");
        add(ModItems.HELLALLOY_AXE.get(), "§aHellalloy Axe");
        add(ModItems.HELLALLOY_HOE.get(), "§aHellalloy Hoe");
        add(ModItems.HELLALLOY_PICKAXE.get(), "§aHellalloy Pickaxe");
        add(ModItems.HELLALLOY_SHOVEL.get(), "§aHellalloy Shovel");
        add(ModItems.HELLALLOY_ROYALGUARD_SHIELD.get(), "§aHellalloy Royalguard Shield(WIP)");
        add(ModItems.HELLALLOY_HELMET.get(), "§aHellalloy Helmet");
        add(ModItems.HELLALLOY_CHESTPLATE.get(), "§aHellalloy Chestplate");
        add(ModItems.HELLALLOY_LEGGINGS.get(), "§aHellalloy Leggings");
        add(ModItems.HELLALLOY_BOOTS.get(), "§aHellalloy Boots");
        add(ModItems.HELLALLOY_SWORD.get(), "§aHellalloy Sword");
        add(ModItems.HELLALLOY_LONGBOW.get(), "§aHellalloy Longbow");
        add(ModItems.HELLALLOY_ROD.get(), "§aHellalloy Rod");
        add(ModItems.NETHERITE_ROD.get(), "Netherite Rod");
        add(ModItems.STYX_INGOT.get(), "§5§lStyx Ingot");
        add(ModItems.STYX_HELMET.get(), "§4Styx Helmet");
        add(ModItems.STYX_CHESTPLATE.get(), "§4Styx Chestplate");
        add(ModItems.STYX_LEGGINGS.get(), "§4Styx Leggings");
        add(ModItems.STYX_BOOTS.get(), "§4Styx Boots");
        add(ModItems.STEEL_BASE.get(), "Steel Base");
        add(ModItems.STEEL_INGOT.get(), "Steel Ingot");
        add(ModItems.STEEL_NUGGET.get(), "Steel Nugget");
        add(ModItems.STEEL_AXE.get(), "Steel Axe");
        add(ModItems.STEEL_HOE.get(), "Steel Hoe");
        add(ModItems.STEEL_PICKAXE.get(), "Steel Pickaxe");
        add(ModItems.STEEL_SHOVEL.get(), "Steel Shovel");
        add(ModItems.STEEL_SWORD.get(), "Steel Sword");
        add(ModItems.STEEL_HELMET.get(), "Steel Helmet");
        add(ModItems.STEEL_CHESTPLATE.get(), "Steel Chestplate");
        add(ModItems.STEEL_LEGGINGS.get(), "Steel Leggings");
        add(ModItems.STEEL_BOOTS.get(), "Steel Boots");
        add(ModItems.UNDERWORLD_BRICK.get(), "Underworld Brick");
        add(ModItems.UNDERWORLD_CRYSTAL.get(), "§bUnderworld Crystal");

        add(ModBlocks.BLOODY_SAND.get(), "Bloody Sand");
        add(ModBlocks.COMPACT_OBSIDIAN.get(), "Compact Obsidian");
        add(ModBlocks.REINFORCED_OBSIDIAN.get(), "Reinforced Obsidian");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(), "§bGlowing Underworld Bricks");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(), "§bGlowing Underworld Brick Slab");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(), "§bGlowing Underworld Brick Stairs");
        add(ModBlocks.HELLALLOY_BLOCK.get(), "§aHellalloy Block");
        add(ModBlocks.HELLIGHT.get(), "Hellight");
        add(ModBlocks.HELL_NUCLEUS.get(), "§c§lHell Nucleus");
        add(ModBlocks.MANJUSAKA.get(), "§cManjusaka");
        add(ModBlocks.NULL_BLOCK.get(), "§c§k?????");
        add(ModBlocks.NULL_GRASSBLOCK.get(), "§c§k!!!!!");
        add(ModBlocks.PINESAP.get(), "Pinesap");
        add(ModBlocks.STYX_BLOCK.get(), "§5§lStyx Block");
        add(ModBlocks.STEEL_BLOCK.get(), "Steel Block");
        add(ModBlocks.UNDERWORLDRACK.get(), "Underworldrack");
        add(ModBlocks.UNDERWORLD_BRICKS.get(), "Underworld Bricks");
        add(ModBlocks.UNDERWORLD_BRICK_BUTTON.get(), "Underworld Brick Button");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE.get(), "Underworld Brick Fence");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(), "Underworld Brick Fence Gate");
        add(ModBlocks.UNDERWORLD_BRICK_SLAB.get(), "Underworld Brick Slab");
        add(ModBlocks.UNDERWORLD_BRICK_STAIRS.get(), "Underworld Brick Stairs");
        add(ModBlocks.UNDERWORLD_BRICK_WALL.get(), "Underworld Brick Wall");
        add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(), "Underworld Crystal ore");

        add("itemGroup.nine_nether_regions_materials_tab", "§2§lNine Nether Regions:materials&others");
        add("itemGroup.nine_nether_regions_blocks_tab", "§2§lNine Nether Regions:blocks");

        add("tooltip.nine_nether_regions.amethyst_dagger", "§8§oAlthough this short sword is indeed small, the recipe is simple, and the attack power is not high, thanks to the vitality contained in amethyst, players have a 33% chance of recovering 1 point of health each time they use it to attack. Meanwhile, precisely because of its compact size, players can swing it faster.\nOf course, due to the fragility of amethyst itself, the durability of this short sword is not as high.");
        add("tooltip.nine_nether_regions.hellalloy_block", "§8§oFilled with the Power From the Underworld.");
        add("tooltip.nine_nether_regions.hellalloy_ingot", "§8§oStrengthened by the Power of the Underworld,the Alloy Ingot is Incredibly Hard.");
        add("tooltip.nine_nether_regions.hellalloy_pickaxe", "§8§oOh,Obsidian,in my eyes,you're just a stone~");
        add("tooltip.nine_nether_regions.hellalloy_shovel", "§8§oDo you want this world to be BARREN?");
        add("tooltip.nine_nether_regions.hellalloy_axe", "§8§oMaybe Logger Vick needs it.");
        add("tooltip.nine_nether_regions.hellalloy_hoe", "§8§oPrincipal's hoe.");
        add("tooltip.nine_nether_regions.hellalloy_sword_alt", "§8§oThis Sword is no longer a sword in the sense of Minecraft.\nThanks to the superior materials, All damage caused by this sword is AOE.\nUnfortunately, this material is not that top-notch. So the AOE damage does not increase with the enhancement of attributes such as Enchantments.\nIn addition, thanks to the power of the embedded crystal nucleus, this sword can automatically repair after damage.");
        add("tooltip.nine_nether_regions.hellalloy_sword", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hell_nucleus", "§8§oJust like the hot core of a star, it's scorching hot.");
        add("tooltip.nine_nether_regions.styx_fabric", "§8§oFilled with Styx Ferryman's soul.");
        add("tooltip.nine_nether_regions.styx_block", "§8§oAlmost Unbreakable.Only §kBedrock§r§8§o and §k???§r§8§o is Harder.Even §kWither??§r§8§o can't Destroy It.");
        add("tooltip.nine_nether_regions.styx_ingot", "§8§oJust Like Styx Ferryman's Will.Unbreakable.");
        add("tooltip.nine_nether_regions.steel_base", "§8§oAfter a thousand trials and tribulations, one can obtain a good piece of steel.");
        add("tooltip.nine_nether_regions.steel_ingot", "§8§oBetter than iron.");
        add("tooltip.nine_nether_regions.alloy_hilt", "§8§oIt can be used as a Weapon.BUT that's by no means its true purpose.");
        add("tooltip.nine_nether_regions.hellalloy_helmet_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6night_vision§r§8§o(effect level:1), while clearing §7blindness§r§8§o and §7darkness§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 1 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_helmet", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6fire_resistance§r§8§o, while clearing §7wither§r§8§o, §7poison§r§8§o and §7mining_fatigue§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 1 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_leggings_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6jump_boost§r§8§o(effect level:1), while clearing §7nausea§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 1 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_leggings", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_boots_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6speed§r§8§o(effect level:2), while clearing §7slowness§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 1 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_boots", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_helmet", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_chestplate", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_leggings", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_boots", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_helmet_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oNight Vision, Water Breathing, Saturation§r§8§o effects (all effects level 2), and grants immunity to §7§oBlindness, Darkness, Hunger§r§8§o effects.");
        add("tooltip.nine_nether_regions.styx_chestplate_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oFire Resistance, Haste§r§8§o effects (all effects level 2) and §r§6§oStrength§r§8§o effect (level 3), and grants immunity to §7§oWither, Poison, Mining Fatigue, Weakness§r§8§o effects.");
        add("tooltip.nine_nether_regions.styx_leggings_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oJump Boost§r§8§o effect (level 2) and §r§6§oLuck§r§8§o effect (level 3), and grants immunity to §7§oNausea§r§8§o effect.");
        add("tooltip.nine_nether_regions.styx_boots_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1 health point every 10 ticks and provides 72% all damage reduction.\n §r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oSpeed§r§8§o effect (level 3), and grants immunity to §7§oSlowness, Levitation, Infested§r§8§o effects, while also providing 85% resistance to fall damage.");
        add("tooltip.nine_nether_regions.hellalloy_longbow", "§8§oMore precise,more powerful.");
        add("tooltip.nine_nether_regions.reinforced_obsidian", "§8§oIt's REALLY hard...It must have some purpose.");
    }
}
