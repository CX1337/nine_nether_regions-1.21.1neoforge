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
        add(ModItems.GHOSTLIUM.get(), "Ghostlium");
        add(ModItems.HELL_NUCLEUS.get(), "§4Hell Nucleus");
        add(ModItems.HELLALLOY_INGOT.get(), "§aHellalloy Ingot");
        add(ModItems.HELLALLOY_AXE.get(), "§aHellalloy Axe");
        add(ModItems.HELLALLOY_HOE.get(), "§aHellalloy Hoe");
        add(ModItems.HELLALLOY_PICKAXE.get(), "§aHellalloy Pickaxe");
        add(ModItems.HELLALLOY_SHOVEL.get(), "§aHellalloy Shovel");
        add(ModItems.HELLALLOY_HELMET.get(), "§aHellalloy Helmet");
        add(ModItems.HELLALLOY_CHESTPLATE.get(), "§aHellalloy Chestplate");
        add(ModItems.HELLALLOY_LEGGINGS.get(), "§aHellalloy Leggings");
        add(ModItems.HELLALLOY_BOOTS.get(), "§aHellalloy Boots");
        add(ModItems.HELLALLOY_SWORD.get(), "§aHellalloy Sword");
        add(ModItems.HELLALLOY_ROD.get(), "§aHellalloy Rod");
        add(ModItems.NETHERITE_ROD.get(), "Netherite Rod");
        add(ModItems.STYX_INGOT.get(), "§5§lStyx Ingot");
        add(ModItems.UNDERWORLD_BRICK.get(), "Underworld Brick");
        add(ModItems.UNDERWORLD_CRYSTAL.get(), "§bUnderworld Crystal");

        add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(), "§bGlowing Underworld Bricks");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(), "§bGlowing Underworld Brick Slab");
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(), "§bGlowing Underworld Brick Stairs");
        add(ModBlocks.HELLALLOY_BLOCK.get(), "§aHellalloy Block");
        add(ModBlocks.HELLIGHT.get(), "Hellight");
        add(ModBlocks.NULL_BLOCK.get(), "§c§k?????");
        add(ModBlocks.NULL_GRASSBLOCK.get(), "§c§k!!!!!");
        add(ModBlocks.STYX_BLOCK.get(), "§5§lStyx Block");
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

        add("tooltip.nine_nether_regions.hellalloy_block", "§8§oFilled with the Power From the Underworld.");
        add("tooltip.nine_nether_regions.hellalloy_ingot", "§8§oStrengthened by the Power of the Underworld,the Alloy Ingot is Incredibly Hard.");
        add("tooltip.nine_nether_regions.hellalloy_pickaxe", "§8§oOh,Obsidian,in my eyes,you're just a stone~");
        add("tooltip.nine_nether_regions.hellalloy_shovel", "§8§oDo you want this world to be BARREN?");
        add("tooltip.nine_nether_regions.hellalloy_axe", "§8§oMaybe Logger Vick needs it.");
        add("tooltip.nine_nether_regions.hellalloy_hoe", "§8§oPrincipal's hoe.");
        add("tooltip.nine_nether_regions.hellalloy_sword_alt", "§8§oThis Sword is no longer a sword in the sense of Minecraft.\nThanks to the superior materials, All damage caused by this sword is AOE.\nUnfortunately, this material is not that top-notch. So the AOE damage does not increase with the enhancement of attributes such as Enchantments.\nIn addition, thanks to the power of the embedded crystal nucleus, this sword can automatically repair after damage.");
        add("tooltip.nine_nether_regions.hellalloy_sword", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.styx_block", "§8§oAlmost Unbreakable.Only §kBedrock§r§8§o and §k???§r§8§o is Harder.Even §kWither??§r§8§o can't Destroy It.");
        add("tooltip.nine_nether_regions.styx_ingot", "§8§oJust Like Styx Ferryman's Will.Unbreakable.");
        add("tooltip.nine_nether_regions.alloy_hilt", "§8§oIt can be used as a Weapon.BUT that's by no means its true purpose.");
        add("tooltip.nine_nether_regions.hell_nucleus", "§8§oEndless Energy.");
        add("tooltip.nine_nether_regions.hellalloy_helmet_alt", "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(8 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6night_vision§r§8§o and §6water_breathing§r§8§o(effect level:1), while clearing §7blindness§r§8§o and §7darkness§r§8§o effects on the player's body.\nComplete set of effects: Continuously provide players with §6resistance§r§8§o(level 3) and §6regeneration§r§8§o(level 2) effects.");
        add("tooltip.nine_nether_regions.hellalloy_helmet", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate_alt", "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(8 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6strength§r§8§o , §6haste§r§8§o(effect level:2)and §6fire_resistance§r§8§o(effect level:1), while clearing §7wither§r§8§o, §7poison§r§8§o and §7mining_fatigue§r§8§o effects on the player's body.\nComplete set of effects: Continuously provide players with §6resistance§r§8§o(level 3) and §6regeneration§r§8§o(level 2) effects.");
        add("tooltip.nine_nether_regions.hellalloy_chestplate", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_leggings_alt", "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(8 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously provides players with §6speed§r§8§o(effect level:1), while clearing §7nausea§r§8§o effects on the player's body.\nComplete set of effects: Continuously provide players with §6resistance§r§8§o(level 3) and §6regeneration§r§8§o(level 2) effects.");
        add("tooltip.nine_nether_regions.hellalloy_leggings", "§8§oPress§r §3§oAlt§r§8§o to display more.");
        add("tooltip.nine_nether_regions.hellalloy_boots_alt", "§8§oSelf healing: If the durability is not sufficient, the equipment will automatically restore durability in the armor bar or player backpack §1(8 points restored every 2 seconds)§r§8§o.\nSingle effect: When equipped on the armor bar, it continuously clearing §7slowness§r§8§o effects on the player's body.\nComplete set of effects: Continuously provide players with §6resistance§r§8§o(level 3) and §6regeneration§r§8§o(level 2) effects.");
        add("tooltip.nine_nether_regions.hellalloy_boots", "§8§oPress§r §3§oAlt§r§8§o to display more.");
    }
}
