package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.enchantment.ModEnchantments;
import com.cx1337.nine_nether_regions.worldgen.ModBiomeModifiers;
import com.cx1337.nine_nether_regions.worldgen.ModConfiguredFeatures;
import com.cx1337.nine_nether_regions.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER =
            new RegistrySetBuilder()
                    .add(Registries.ENCHANTMENT, ModEnchantments::bootstrap)

                    .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
                    .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
                    .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(NineNetherRegions.MODID));
    }
}
