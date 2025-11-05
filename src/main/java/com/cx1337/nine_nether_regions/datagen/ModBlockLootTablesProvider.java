package com.cx1337.nine_nether_regions.datagen;

import com.cx1337.nine_nether_regions.block.ModBlocks;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //add(ModBlocks.???_DOOR.get(),
        //                     block -> createDoorTable(ModBlocks.???_DOOR.get()));
        dropSelf(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get());
        add(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB.get()));
        dropSelf(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS.get());
        dropSelf(ModBlocks.HELLALLOY_BLOCK.get());
        dropSelf(ModBlocks.HELLIGHT.get());
        dropSelf(ModBlocks.NULL_BLOCK.get());
        dropSelf(ModBlocks.NULL_GRASSBLOCK.get());
        dropSelf(ModBlocks.PINESAP.get());
        add(ModBlocks.POTTED_PINESAP.get(),
                createPotFlowerItemTable(ModBlocks.PINESAP.get()));
        dropSelf(ModBlocks.STYX_BLOCK.get());
        dropSelf(ModBlocks.UNDERWORLDRACK.get());
        dropSelf(ModBlocks.UNDERWORLD_BRICKS.get());
        dropSelf(ModBlocks.UNDERWORLD_BRICK_BUTTON.get());
        dropSelf(ModBlocks.UNDERWORLD_BRICK_FENCE.get());
        dropSelf(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE.get());
        add(ModBlocks.UNDERWORLD_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.UNDERWORLD_BRICK_SLAB.get()));
        dropSelf(ModBlocks.UNDERWORLD_BRICK_STAIRS.get());
        dropSelf(ModBlocks.UNDERWORLD_BRICK_WALL.get());

        //非精准采集不掉落自身的矿石按下述方式写。
        add(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.UNDERWORLD_CRYSTAL_ORE.get(), ModItems.UNDERWORLD_CRYSTAL.get(), 1, 4));

    }
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
