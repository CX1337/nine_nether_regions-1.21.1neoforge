package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.effect.ModEffects;
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
        add(ModItems.GHOSTLIUM_APPLE.get(), "Ghostlium Apple");
        add(ModItems.ENCHANTED_GHOSTLIUM_APPLE.get(), "Enchanted Ghostlium Apple");
        add(ModItems.AMETHYST_DAGGER.get(), "Amethyst Dagger");
        add(ModItems.BLOODBLADE_ESSENCE.get(), "Bloodblade Essence");
        add(ModItems.CHERRY_STICK.get(), "§d Cherry Stick");
        add(ModItems.CHERRY_HELMET.get(), "§d Cherry Helmet");
        add(ModItems.CHERRY_CHESTPLATE.get(), "§d Cherry Chestplate");
        add(ModItems.CHERRY_LEGGINGS.get(), "§d Cherry Leggings");
        add(ModItems.CHERRY_BOOTS.get(), "§d Cherry Boots");
        add(ModItems.STYX_FERRYMAN_MUSIC_DISC.get(), "Music Disc--Styx Ferryman");
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
        add(ModItems.STYX_TEAR.get(), "§4§lStyx Tear");
        add(ModItems.STYX_SWORD.get(), "§4§lStyx Battle-sword");
        add(ModItems.STYX_PICKAXE.get(), "§4Styx Pickaxe");
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
        add(ModItems.STEEL_HORSE_ARMOR.get(), "Steel Horse Armor");
        add(ModItems.WOOD_HELMET.get(), "Wood Helmet");
        add(ModItems.WOOD_CHESTPLATE.get(), "Wood Chestplate");
        add(ModItems.WOOD_LEGGINGS.get(), "Wood Leggings");
        add(ModItems.WOOD_BOOTS.get(), "Wood Boots");
        add(ModItems.RUBY.get(), "Ruby");
        add(ModItems.RAINBOWGEM.get(), "Rainbow Jade");
        add(ModItems.RAINBOWGEM_AXE.get(), "Rainbow Jade Axe");
        add(ModItems.RAINBOWGEM_HOE.get(), "Rainbow Jade Hoe");
        add(ModItems.RAINBOWGEM_PICKAXE.get(), "Rainbow Jade Pickaxe");
        add(ModItems.RAINBOWGEM_SHOVEL.get(), "Rainbow Jade Shovel");
        add(ModItems.RAINBOWGEM_SWORD.get(), "Rainbow Jade Sword");
        add(ModItems.RUBY_SWORD.get(), "Ruby Sword");
        add(ModItems.RAINBOWGEM_HELMET.get(), "Rainbow Jade Helmet");
        add(ModItems.RAINBOWGEM_CHESTPLATE.get(), "Rainbow Jade Chestplate");
        add(ModItems.RAINBOWGEM_LEGGINGS.get(), "Rainbow Jade Leggings");
        add(ModItems.RAINBOWGEM_BOOTS.get(), "Rainbow Jade Boots");
        add(ModItems.UNDERWORLD_BRICK.get(), "Underworld Brick");
        add(ModItems.UNDERWORLD_CRYSTAL.get(), "§bUnderworld Crystal");

        add(ModBlocks.BLOODY_SAND.get(), "Bloody Sand");
        add(ModBlocks.BLOODBLADE_ORE.get(), "§4Bloodblade_ore");
        add(ModBlocks.BLOODBLADE_ROCK.get(), "Bloodblade Rock");
        add(ModBlocks.CRACKED_BLOODBLADE_ROCK.get(), "Cracked Bloodblade Rock");
        add(ModBlocks.HARDENED_BLOODBLADE_ROCK.get(), "Hardened Bloodblade Rock");
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
        add(ModBlocks.RAINBOWGEM_BLOCK.get(), "Rainbowgem Block");
        add(ModBlocks.UNDERWORLDRACK.get(), "Underworldrack");
        add(ModBlocks.UNDERWORLD_BRICKS.get(), "Underworld Bricks");
        add(ModBlocks.UNDERWORLD_BRICK_BUTTON.get(), "Underworld Brick Button");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE.get(), "Underworld Brick Fence");
        add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(), "Underworld Brick Fence Gate");
        add(ModBlocks.UNDERWORLD_BRICK_SLAB.get(), "Underworld Brick Slab");
        add(ModBlocks.UNDERWORLD_BRICK_STAIRS.get(), "Underworld Brick Stairs");
        add(ModBlocks.UNDERWORLD_BRICK_WALL.get(), "Underworld Brick Wall");
        add(ModBlocks.UNDERWORLD_SPIRIT_STONE.get(), "Underworld Spirit Stone");
        add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(), "Underworld Crystal ore");

        add("effect.nine_nether_regions.decline", "Decline");
        add("item.minecraft.potion.effect.decline_potion", "Decline Potion");
        add("item.minecraft.splash_potion.effect.decline_potion", "Decline Splash Potion");
        add("item.minecraft.lingering_potion.effect.decline_potion", "Decline Lingering Potion");
        add("death.attack.decline", "%1$s was dissipated into the wind");
        add("death.attack.decline.player", "%1$s faded away while fighting with %2$s");
        add("effect.nine_nether_regions.bloodblade_curse", "Bloodblade Curse");
        add("item.minecraft.potion.effect.bb_curse_potion", "Bloodblade Curse Potion");
        add("item.minecraft.splash_potion.effect.bb_curse_potion", "Bloodblade Curse Splash Potion");
        add("item.minecraft.lingering_potion.effect.bb_curse_potion", "Bloodblade Curse Lingering Potion");

        add("painting.nine_nether_regions.wayfarer.title", "Wayfarer");
        add("painting.nine_nether_regions.wayfarer.author", "CX1337");
        add("painting.nine_nether_regions.the_sword.title", "The Sword");
        add("painting.nine_nether_regions.the_sword.author", "05Z08");

        add("itemGroup.nine_nether_regions_materials_tab", "§2§lNine Nether Regions:items");
        add("itemGroup.nine_nether_regions_blocks_tab", "§2§lNine Nether Regions:blocks");

        add("item.nine_nether_regions.styx_ferryman_music_disc.desc", "Rafael Krux--Dawn of the Apocalypse");

        add("tooltip.nine_nether_regions.amethyst_dagger", "§8§oAlthough this short sword is indeed small, the recipe is simple, and the attack power is not high, thanks to the vitality contained in amethyst, players have a 33% chance of recovering 1 point of health each time they use it to attack. Meanwhile, precisely because of its compact size, players can swing it faster.\nOf course, due to the fragility of amethyst itself, the durability of this short sword is not as high.");
        add("tooltip.nine_nether_regions.ghostlium_apple", "§8§o Tainted with a bit of the Underworld's power... but it tastes delicious!");
        add("tooltip.nine_nether_regions.enchanted_ghostlium_apple", "§8§oAn Enchanted Golden Apple, enhanced in every way by the Underworld's power. Delicious, filling, and incredibly potent.");
        add("tooltip.nine_nether_regions.bloodblade_essence", "§8§oAn indescribable mass of matter…… but the energy contained within should not be underestimated.");
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
        add("tooltip.nine_nether_regions.styx_tear", "§5§o The blood tears of Styx Ferryman, containing her endless sorrow... as well as a part of her power.");
        add("tooltip.nine_nether_regions.styx_block", "§8§oAlmost Unbreakable.Only §kBedrock§r§8§o and §k???§r§8§o is Harder.Even §kWither??§r§8§o can't Destroy It.");
        add("tooltip.nine_nether_regions.styx_ingot", "§8§oJust Like Styx Ferryman's Will.Unbreakable.");
        add("tooltip.nine_nether_regions.styx_sword", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_sword_alt",
                "§6§oIndestructible: §r§8§oUnder normal circumstances, this weapon's durability is not consumed. If the weapon's durability is damaged by some means, it will recover very quickly (42 points per 4 ticks).\n§r§6§oBattle-sword's Edge: §r§8§oWhen attacking a creature, the Styx Battle-sword simultaneously deals area damage to all non-friendly creatures within a 3-block radius centered on the player, dealing §r§e§o(Battle-sword's attack power + target's max health × 5%) §r§8§o damage.\n§r§6§oSoul Siphon: §r§8§oEach time the battle-sword attacks, it forcibly restores §r§d§o(player's max health × 8%) §r§8§o health to the player.");
        add("tooltip.nine_nether_regions.styx_pickaxe", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_pickaxe_alt", "§8§oThis pickaxe is the best among all pickaxes.\nUnder normal circumstances, its durability cannot be consumed. If under special circumstances its durability is reduced, it will rapidly restore to full durability (restores 24 points per 4 ticks).\nBlessed by the power of Styx, this pickaxe breaks any block 2.5 times faster than normal, and when breaking any block, there is a 24% chance to drop a diamond and a 12% chance to drop a netherite scrap.");
        add("tooltip.nine_nether_regions.steel_base", "§8§oAfter a thousand trials and tribulations, one can obtain a good piece of steel.");
        add("tooltip.nine_nether_regions.steel_ingot", "§8§oBetter than iron.");
        add("tooltip.nine_nether_regions.rainbowgem_armors", "§8§o§8§oAll set Bonus: 10% damage reduction against nearly all damage types.");
        add("tooltip.nine_nether_regions.alloy_hilt", "§8§oIt can be used as a Weapon.BUT that's by no means its true purpose.");
        add("tooltip.nine_nether_regions.hellalloy_helmet_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6night_vision§r§8§o(effect level:1), while clearing §7blindness§r§8§o and §7darkness§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 0.7 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_helmet", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6fire_resistance§r§8§o, while clearing §7wither§r§8§o, §7poison§r§8§o and §7mining_fatigue§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 0.7 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_leggings_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6jump_boost§r§8§o(effect level:1), while clearing §7nausea§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 0.7 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_leggings", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_boots_alt",
                "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(4 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6speed§r§8§o(effect level:2), while clearing §7slowness§r§8§o effects on the player's body.\nComplete set of effects: Provide a 34% reduction for most damages,force to restore 0.7 point of health for every 10 ticks and provide §6resistance§r§8§o(level 2) effect.");
        add("tooltip.nine_nether_regions.hellalloy_boots", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_helmet", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_chestplate", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_leggings", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_boots", "§6§lMay the Power of Styx be with you.\n§r§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_helmet_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1.5 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oNight Vision, Water Breathing, Saturation§r§8§o effects (all effects level 2), and grants immunity to §7§oBlindness, Darkness, Hunger§r§8§o effects.");
        add("tooltip.nine_nether_regions.styx_chestplate_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1.5 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oFire Resistance, Haste§r§8§o effects (all effects level 2) and §r§6§oStrength§r§8§o effect (level 3), and grants immunity to §7§oWither, Poison, Mining Fatigue, Weakness§r§8§o effects.");
        add("tooltip.nine_nether_regions.styx_leggings_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1.5 health point every 10 ticks and provides 72% all damage reduction.\n§r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oJump Boost§r§8§o effect (level 2) and §r§6§oLuck§r§8§o effect (level 3), and grants immunity to §7§oNausea§r§8§o effect.");
        add("tooltip.nine_nether_regions.styx_boots_alt",
                "§6§oIndestructible:§r§8§oUnder normal circumstances, the durability of this equipment will not be depleted. If the durability of the equipment is damaged by some means, its durability will quickly recover (42 points restored every 4 ticks)\n§r§6§oFull Set Effect - Immovable as Mountains:§r§8§oWhen original damage ≤3 points or of type §r§5§oMagic, §r§e§oExplosion, §r§3§oFreeze, §r§1§oWarden's Sonic Boom§r§8§o, forcibly reduces damage to 0; continuously provides §r§6§oResistance Boost and Damage Absorption§r§8§o effects (all effects level 3); forcibly restores 1.5 health point every 10 ticks and provides 72% all damage reduction.\n §r§6§oSingle Piece Effect:§r§8§oContinuously provides §r§6§oSpeed§r§8§o effect (level 3), and grants immunity to §7§oSlowness, Levitation, Infested§r§8§o effects, while also providing 85% resistance to fall damage.");
        add("tooltip.nine_nether_regions.hellalloy_longbow", "§8§oMore precise,more powerful.");
        add("tooltip.nine_nether_regions.reinforced_obsidian", "§8§oIt's REALLY hard...It must have some purpose.");
        add("tooltip.nine_nether_regions.rainbowgem", "§8§oA strange gem formed by the fusion of various gems, extremely hard and nearly rivaling Netherite.");
        add("tooltip.nine_nether_regions.ruby_sword", "§8§oA bloodthirsty sword that deals decent damage, at the cost of being extremely fragile.");
    }
}
