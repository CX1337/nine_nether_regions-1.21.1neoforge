package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
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
        //信标基座方块
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.STEEL_BLOCK.get(), ModBlocks.HELLALLOY_BLOCK.get(), ModBlocks.STYX_BLOCK.get());

        //栅栏相关
        tag(BlockTags.FENCES).add(ModBlocks.UNDERWORLD_BRICK_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.UNDERWORLD_BRICK_WALL.get());

        //植物相关
        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.PINESAP.get());
        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.PINESAP.get());

        //工具不匹配标签
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.STYX_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.STYX_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.STYX_BLOCK.get());

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(ModBlocks.STYX_BLOCK.get());

        //自定义挖掘等级标签 - 覆盖原版所有相应等级的方块
        tag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .addTags(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(),
                        ModBlocks.COMPACT_OBSIDIAN.get(),
                        ModBlocks.REINFORCED_OBSIDIAN.get());

        tag(ModTags.Blocks.NEEDS_HELLALLOY_TOOL)
                .addTags(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(ModBlocks.STYX_BLOCK.get());

        //可挖掘标签
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.BLOODY_SAND.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COMPACT_OBSIDIAN.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(),
                        ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.HELLIGHT.get(),
                        ModBlocks.HELL_NUCLEUS.get(),
                        ModBlocks.REINFORCED_OBSIDIAN.get(),
                        ModBlocks.STYX_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.UNDERWORLDRACK.get(),
                        ModBlocks.UNDERWORLD_BRICKS.get(),
                        ModBlocks.UNDERWORLD_BRICK_BUTTON.get(),
                        ModBlocks.UNDERWORLD_BRICK_FENCE.get(),
                        ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(),
                        ModBlocks.UNDERWORLD_BRICK_SLAB.get(),
                        ModBlocks.UNDERWORLD_BRICK_STAIRS.get(),
                        ModBlocks.UNDERWORLD_BRICK_WALL.get(),
                        ModBlocks.UNDERWORLD_CRYSTAL_ORE.get());

        //原版挖掘等级标签
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.UNDERWORLDRACK.get(),
                        ModBlocks.UNDERWORLD_BRICKS.get(),
                        ModBlocks.UNDERWORLD_BRICK_BUTTON.get(),
                        ModBlocks.UNDERWORLD_BRICK_FENCE.get(),
                        ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(),
                        ModBlocks.UNDERWORLD_BRICK_SLAB.get(),
                        ModBlocks.UNDERWORLD_BRICK_STAIRS.get(),
                        ModBlocks.UNDERWORLD_BRICK_WALL.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(),
                        ModBlocks.COMPACT_OBSIDIAN.get(),
                       ModBlocks.REINFORCED_OBSIDIAN.get());

        //免疫凋灵。
        tag(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(),
                        ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(),
                        ModBlocks.REINFORCED_OBSIDIAN.get(),
                        ModBlocks.NULL_BLOCK.get(),
                        ModBlocks.NULL_GRASSBLOCK.get(),
                        ModBlocks.HELLALLOY_BLOCK.get(),
                        ModBlocks.HELLIGHT.get(),
                        ModBlocks.HELL_NUCLEUS.get(),
                        ModBlocks.STYX_BLOCK.get(),
                        ModBlocks.UNDERWORLD_CRYSTAL_ORE.get());
    }
}


