package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.nbt.Tag;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NineNetherRegions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.FENCES)
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get());

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.PINESAP.get());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.PINESAP.get());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.STYX_BLOCK.get())
                .add(ModBlocks.STEEL_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.STYX_BLOCK.get())
                .add(ModBlocks.STEEL_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(ModBlocks.STYX_BLOCK.get());

        tag(ModTags.Blocks.NEEDS_HELLALLOY_TOOL)
                .add(ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get())
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.HELLIGHT.get())
                .add(ModBlocks.STYX_BLOCK.get())
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.UNDERWORLDRACK.get())
                .add(ModBlocks.UNDERWORLD_BRICKS.get())
                .add(ModBlocks.UNDERWORLD_BRICK_BUTTON.get())
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE.get())
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get())
                .add(ModBlocks.UNDERWORLD_BRICK_SLAB.get())
                .add(ModBlocks.UNDERWORLD_BRICK_STAIRS.get())
                .add(ModBlocks.UNDERWORLD_BRICK_WALL.get())
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get())
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.UNDERWORLDRACK.get())
                .add(ModBlocks.UNDERWORLD_BRICKS.get())
                .add(ModBlocks.UNDERWORLD_BRICK_BUTTON.get())
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE.get())
                .add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get())
                .add(ModBlocks.UNDERWORLD_BRICK_SLAB.get())
                .add(ModBlocks.UNDERWORLD_BRICK_STAIRS.get())
                .add(ModBlocks.UNDERWORLD_BRICK_WALL.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get());

        tag(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get())
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get())
                .add(ModBlocks.NULL_BLOCK.get())
                .add(ModBlocks.NULL_GRASSBLOCK.get())
                .add(ModBlocks.HELLALLOY_BLOCK.get())
                .add(ModBlocks.HELLIGHT.get())
                .add(ModBlocks.HELL_NUCLEUS.get())
                .add(ModBlocks.STYX_BLOCK.get())
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.UNDERWORLD_BRICK_WALL.get());

        //tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL),为后续冥河块准备。
    }
}
