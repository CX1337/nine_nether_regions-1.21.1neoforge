package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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
        blockWithItem(ModBlocks.GLOWING_UNDERWORLD_BRICKS);
        blockWithItem(ModBlocks.HELLALLOY_BLOCK);
        blockWithItem(ModBlocks.HELLIGHT);
        blockWithItem(ModBlocks.NULL_BLOCK);
        blockWithItem(ModBlocks.NULL_GRASSBLOCK);
        blockWithItem(ModBlocks.STYX_BLOCK);
        blockWithItem(ModBlocks.UNDERWORLDRACK);
        blockWithItem(ModBlocks.UNDERWORLD_BRICKS);
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
