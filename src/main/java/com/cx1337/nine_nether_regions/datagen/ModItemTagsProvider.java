package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, NineNetherRegions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.GOAT_FOOD)
                .add(ModItems.AMETHYST_BEETROOT.get());

        tag(ItemTags.HORSE_FOOD)
                .add(ModItems.GHOSTLIUM_APPLE.get())
                .add(ModItems.ENCHANTED_GHOSTLIUM_APPLE.get());

        tag(ItemTags.HOGLIN_FOOD)
                .add(ModItems.GHOSTLIUM.get());

        tag(Tags.Items.ARMORS)
                .add(ModItems.WOOD_HELMET.get())
                .add(ModItems.WOOD_CHESTPLATE.get())
                .add(ModItems.WOOD_LEGGINGS.get())
                .add(ModItems.WOOD_BOOTS.get())
                .add(ModItems.CHERRY_HELMET.get())
                .add(ModItems.CHERRY_CHESTPLATE.get())
                .add(ModItems.CHERRY_LEGGINGS.get())
                .add(ModItems.CHERRY_BOOTS.get())
                .add(ModItems.HELLALLOY_HELMET.get())
                .add(ModItems.HELLALLOY_CHESTPLATE.get())
                .add(ModItems.HELLALLOY_LEGGINGS.get())
                .add(ModItems.HELLALLOY_BOOTS.get())
                .add(ModItems.STYX_HELMET.get())
                .add(ModItems.STYX_CHESTPLATE.get())
                .add(ModItems.STYX_LEGGINGS.get())
                .add(ModItems.STYX_BOOTS.get())
                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get())
                .add(ModItems.RAINBOWGEM_HELMET.get())
                .add(ModItems.RAINBOWGEM_CHESTPLATE.get())
                .add(ModItems.RAINBOWGEM_LEGGINGS.get())
                .add(ModItems.RAINBOWGEM_BOOTS.get());

        tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.WOOD_HELMET.get())
                .add(ModItems.WOOD_CHESTPLATE.get())
                .add(ModItems.WOOD_LEGGINGS.get())
                .add(ModItems.WOOD_BOOTS.get())
                .add(ModItems.CHERRY_HELMET.get())
                .add(ModItems.CHERRY_CHESTPLATE.get())
                .add(ModItems.CHERRY_LEGGINGS.get())
                .add(ModItems.CHERRY_BOOTS.get())
                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLATE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get())
                .add(ModItems.RAINBOWGEM_HELMET.get())
                .add(ModItems.RAINBOWGEM_CHESTPLATE.get())
                .add(ModItems.RAINBOWGEM_LEGGINGS.get())
                .add(ModItems.RAINBOWGEM_BOOTS.get())
                .add(ModItems.HELLALLOY_HELMET.get())
                .add(ModItems.HELLALLOY_CHESTPLATE.get())
                .add(ModItems.HELLALLOY_LEGGINGS.get())
                .add(ModItems.HELLALLOY_BOOTS.get())
                .add(ModItems.STYX_HELMET.get())
                .add(ModItems.STYX_CHESTPLATE.get())
                .add(ModItems.STYX_LEGGINGS.get())
                .add(ModItems.STYX_BOOTS.get());


        tag(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.HELLALLOY_LONGBOW.get());

        tag(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.AMETHYST_DAGGER.get())
                .add(ModItems.STEEL_SWORD.get())
                .add(ModItems.RAINBOWGEM_SWORD.get())
                .add(ModItems.RUBY_SWORD.get())
                .add(ModItems.HELLALLOY_SWORD.get())
                .add(ModItems.STYX_SWORD.get());

        tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.STEEL_PICKAXE.get())
                .add(ModItems.STEEL_SHOVEL.get())
                .add(ModItems.STEEL_AXE.get())
                .add(ModItems.STEEL_HOE.get())
                .add(ModItems.RAINBOWGEM_PICKAXE.get())
                .add(ModItems.RAINBOWGEM_SHOVEL.get())
                .add(ModItems.RAINBOWGEM_AXE.get())
                .add(ModItems.RAINBOWGEM_HOE.get())
                .add(ModItems.HELLALLOY_PICKAXE.get())
                .add(ModItems.HELLALLOY_SHOVEL.get())
                .add(ModItems.HELLALLOY_AXE.get())
                .add(ModItems.STYX_PICKAXE.get());
    }
}
