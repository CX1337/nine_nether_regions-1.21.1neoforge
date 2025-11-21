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
                .add(ModItems.STEEL_BOOTS.get());
    }
}
