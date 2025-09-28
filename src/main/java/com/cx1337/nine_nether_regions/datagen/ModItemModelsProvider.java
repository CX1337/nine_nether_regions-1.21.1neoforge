package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NineNetherRegions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AMETHYST_BEETROOT.get());
        basicItem(ModItems.GHOSTLIUM.get());
        basicItem(ModItems.HELL_NUCLEUS.get());
        basicItem(ModItems.HELLALLOY_INGOT.get());
        basicItem(ModItems.STYX_INGOT.get());
        basicItem(ModItems.UNDERWORLD_BRICK.get());
        basicItem(ModItems.UNDERWORLD_CRYSTAL.get());
        basicItem(ModItems.HELLALLOY_ROD.get());
        basicItem(ModItems.NETHERITE_ROD.get());

        //工具武器类的物品均放在handheldItem中。
        handheldItem(ModItems.ALLOY_HILT.get());
        handheldItem(ModItems.HELLALLOY_AXE.get());
        handheldItem(ModItems.HELLALLOY_HOE.get());
        handheldItem(ModItems.HELLALLOY_PICKAXE.get());
        handheldItem(ModItems.HELLALLOY_SHOVEL.get());
        handheldItem(ModItems.HELLALLOY_SWORD.get());

        //basicItem(ModBlocks.???_DOOR.asItem),门和活板门有专用贴图需要绘制。

        buttonItem(ModBlocks.UNDERWORLD_BRICK_BUTTON,ModBlocks.UNDERWORLD_BRICKS);
        fenceItem(ModBlocks.UNDERWORLD_BRICK_FENCE, ModBlocks.UNDERWORLD_BRICKS);
        wallItem(ModBlocks.UNDERWORLD_BRICK_WALL, ModBlocks.UNDERWORLD_BRICKS);
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}

