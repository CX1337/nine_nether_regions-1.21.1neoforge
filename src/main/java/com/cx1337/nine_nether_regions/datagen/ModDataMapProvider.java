package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.UNDERWORLD_CRYSTAL.getId(), new FurnaceFuel(3200), false)
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.getId(), new FurnaceFuel(32000), false)
                .add(ModItems.HELL_NUCLEUS.getId(), new FurnaceFuel(44440000), false);
}
}
