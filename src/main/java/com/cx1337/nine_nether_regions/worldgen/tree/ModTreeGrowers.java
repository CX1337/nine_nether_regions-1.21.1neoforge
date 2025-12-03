package com.cx1337.nine_nether_regions.worldgen.tree;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower HELLWOOD = new TreeGrower(NineNetherRegions.MODID + ":hellwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.HELLWOOD_KEY), Optional.empty());
}
