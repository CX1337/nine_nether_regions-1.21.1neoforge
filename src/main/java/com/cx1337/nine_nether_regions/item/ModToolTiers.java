package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier HELLALLOY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_HELLALLOY_TOOL,
           4444, 24.0F, 11.0F, 44, () -> Ingredient.of(ModItems.HELLALLOY_INGOT) );
    public static final Tier STYX = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STYX_TOOL,
            44444, 32.0F, 17.0F, 88, () -> Ingredient.of(ModItems.HELLALLOY_INGOT) );
}
