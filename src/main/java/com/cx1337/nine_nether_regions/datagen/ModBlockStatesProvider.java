package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NineNetherRegions.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLOODY_SAND);
        blockWithItem(ModBlocks.BLOODBLADE_ROCK);
        blockWithItem(ModBlocks.CRACKED_BLOODBLADE_ROCK);
        blockWithItem(ModBlocks.HARDENED_BLOODBLADE_ROCK);
        blockWithItem(ModBlocks.BLOODBLADE_ORE);
        blockWithItem(ModBlocks.COMPACT_OBSIDIAN);
        blockWithItem(ModBlocks.REINFORCED_OBSIDIAN);
        blockWithItem(ModBlocks.GLOWING_UNDERWORLD_BRICKS);
        blockWithItem(ModBlocks.HELLALLOY_BLOCK);
        blockWithItem(ModBlocks.HELLIGHT);
        blockWithItem(ModBlocks.NULL_BLOCK);
        blockWithItem(ModBlocks.NULL_GRASSBLOCK);
        blockWithItem(ModBlocks.STYX_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.RAINBOWGEM_BLOCK);
        blockWithItem(ModBlocks.UNDERWORLDRACK);
        blockWithItem(ModBlocks.UNDERWORLD_BRICKS);
        blockWithItem(ModBlocks.UNDERWORLD_SPIRIT_STONE);
        blockWithItem(ModBlocks.UNDERWORLD_CRYSTAL_ORE);

        buttonBlock(ModBlocks.UNDERWORLD_BRICK_BUTTON.get(), blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));
        //压力板同按钮。

        //门:doorBlockWithRenderType(ModBlocks.???_DOOR.get(), modLoc("block/???_door_bottom"), modLoc("block/???_door_top), "cutout");
        //活板门:trapdoorBlockWithRenderType(ModBlocks.???_TRAPDOOR.get(), modLoc("block/???_trapdoor"), true, "cutout")

        fenceBlock(ModBlocks.UNDERWORLD_BRICK_FENCE.get(), blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));
        fenceGateBlock(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get(), blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));
        wallBlock(ModBlocks.UNDERWORLD_BRICK_WALL.get(), blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));

        stairsBlock(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get(), blockTexture(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get()));
        stairsBlock(ModBlocks.UNDERWORLD_BRICK_STAIRS.get(), blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));
        slabBlock(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(),blockTexture(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get()),
                blockTexture(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get()));
        slabBlock(ModBlocks.UNDERWORLD_BRICK_SLAB.get(),blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()),
                blockTexture(ModBlocks.UNDERWORLD_BRICKS.get()));

        blockItem(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB);
        blockItem(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS);
        blockItem(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE);
        blockItem(ModBlocks.UNDERWORLD_BRICK_SLAB);
        blockItem(ModBlocks.UNDERWORLD_BRICK_STAIRS);
        //blockItem(ModBlocks.???_TRAPDOOR, "_bottom");

        flowerWithPot(ModBlocks.PINESAP);

        tallFlower(ModBlocks.MANJUSAKA);
    }

    private void flowerWithPot(DeferredBlock<?> flowerBlock) {
        String path = flowerBlock.getId().getPath();

        ModelFile flowerModel = models().cross(path, modLoc("block/" + path)).renderType("cutout");
        simpleBlock(flowerBlock.get(), flowerModel);
        itemModels().withExistingParent(path, modLoc("block/" + path));

        String pottedPath = "potted_" + path;
        ResourceLocation pottedBlockId = ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID, pottedPath);
        Block pottedBlock = BuiltInRegistries.BLOCK.get(pottedBlockId);

        if (pottedBlock != null && pottedBlock != Blocks.AIR) {
            simpleBlock(pottedBlock, models().withExistingParent(pottedPath, "block/flower_pot_cross")
                    .texture("plant", modLoc("block/" + path))
                    .renderType("cutout"));
        }
    }

    private void tallFlower(DeferredBlock<?> flowerBlock) {
        String path = flowerBlock.getId().getPath();

        ModelFile bottomModel = models().cross(path + "_bottom", modLoc("block/" + path + "_bottom")).renderType("cutout");
        ModelFile topModel = models().cross(path + "_top", modLoc("block/" + path + "_top")).renderType("cutout");

        getVariantBuilder(flowerBlock.get())
                .partialState().with(TallFlowerBlock.HALF, DoubleBlockHalf.LOWER)
                .modelForState().modelFile(bottomModel).addModel()
                .partialState().with(TallFlowerBlock.HALF, DoubleBlockHalf.UPPER)
                .modelForState().modelFile(topModel).addModel();

        itemModels().withExistingParent(path, modLoc("block/" + path + "_top"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("nine_nether_regions:block/" +
                deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("nine_nether_regions:block/" +
                deferredBlock.getId().getPath() + appendix));
    }
}
