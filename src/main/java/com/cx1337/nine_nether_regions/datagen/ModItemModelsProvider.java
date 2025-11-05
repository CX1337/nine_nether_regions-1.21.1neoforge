package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;
import java.util.List;

public class ModItemModelsProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NineNetherRegions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AMETHYST_BEETROOT.get());
        basicItem(ModItems.DIAMOND_BOWSTRING.get());
        basicItem(ModItems.GHOSTLIUM.get());
        basicItem(ModItems.HELL_NUCLEUS.get());
        basicItem(ModItems.HELLALLOY_INGOT.get());
        basicItem(ModItems.STYX_INGOT.get());
        basicItem(ModItems.UNDERWORLD_BRICK.get());
        basicItem(ModItems.UNDERWORLD_CRYSTAL.get());
        basicItem(ModItems.HELLALLOY_ROD.get());
        basicItem(ModItems.NETHERITE_ROD.get());

        //盔甲。
        for (var sup : List.of(ModItems.HELLALLOY_HELMET, ModItems.HELLALLOY_CHESTPLATE,ModItems.HELLALLOY_LEGGINGS, ModItems.HELLALLOY_BOOTS)){
            basicItem(sup.get());
        }

        //工具武器类的物品均放在handheldItem中。
        handheldItem(ModItems.ALLOY_HILT.get());
        handheldItem(ModItems.AMETHYST_DAGGER.get());
        handheldItem(ModItems.HELLALLOY_AXE.get());
        handheldItem(ModItems.HELLALLOY_HOE.get());
        handheldItem(ModItems.HELLALLOY_PICKAXE.get());
        handheldItem(ModItems.HELLALLOY_SHOVEL.get());
        handheldItem(ModItems.HELLALLOY_SWORD.get());

        //basicItem(ModBlocks.???_DOOR.asItem),门和活板门有专用贴图需要绘制。

        buttonItem(ModBlocks.UNDERWORLD_BRICK_BUTTON,ModBlocks.UNDERWORLD_BRICKS);
        fenceItem(ModBlocks.UNDERWORLD_BRICK_FENCE, ModBlocks.UNDERWORLD_BRICKS);
        wallItem(ModBlocks.UNDERWORLD_BRICK_WALL, ModBlocks.UNDERWORLD_BRICKS);

        //花
        withExistingParent("pinesap", mcLoc("item/generated"))
                .texture("layer0", modLoc("block/pinesap"));
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

