package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NineNetherRegions.MODID);

    public static final Supplier<CreativeModeTab> NineNetherRegions_Tab =
            CREATIVE_MODE_TABS.register("nine_nether_regions_materials_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.STYX_INGOT.get()))
                    .title(Component.translatable("itemGroup.nine_nether_regions_materials_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.NETHERITE_ROD);
                        output.accept(ModItems.HELLALLOY_ROD);
                        output.accept(ModItems.UNDERWORLD_BRICK);
                        output.accept(ModItems.UNDERWORLD_CRYSTAL);
                        output.accept(ModItems.GHOSTLIUM);
                        output.accept(ModItems.HELL_NUCLEUS);
                        output.accept(ModItems.AMETHYST_BEETROOT);
                        output.accept(ModItems.ALLOY_HILT);

                        output.accept(ModItems.HELLALLOY_INGOT);
                        output.accept(ModItems.HELLALLOY_AXE);
                        output.accept(ModItems.HELLALLOY_HOE);
                        output.accept(ModItems.HELLALLOY_PICKAXE);
                        output.accept(ModItems.HELLALLOY_SHOVEL);
                        output.accept(ModItems.HELLALLOY_HELMET);
                        output.accept(ModItems.HELLALLOY_CHESTPLATE);
                        output.accept(ModItems.HELLALLOY_LEGGINGS);
                        output.accept(ModItems.HELLALLOY_BOOTS);
                        output.accept(ModItems.HELLALLOY_SWORD);

                        output.accept(ModItems.STYX_INGOT);
                    }).build());

    public static final Supplier<CreativeModeTab> NineNetherRegions_Blocks_Tab =
            CREATIVE_MODE_TABS.register("nine_nether_regions_blocks_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get()))
                    .title(Component.translatable("itemGroup.nine_nether_regions_blocks_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.GLOWING_UNDERWORLD_BRICKS);
                        output.accept(ModBlocks.GLOWING_UNDERWORLD_BRICK_SLAB);
                        output.accept(ModBlocks.GLOWING_UNDERWORLD_BRICK_STAIRS);
                        output.accept(ModBlocks.UNDERWORLD_CRYSTAL_ORE);
                        output.accept(ModBlocks.HELLIGHT);
                        output.accept(ModBlocks.HELLALLOY_BLOCK);
                        output.accept(ModBlocks.STYX_BLOCK);
                        output.accept(ModBlocks.UNDERWORLDRACK);
                        output.accept(ModBlocks.UNDERWORLD_BRICKS);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_BUTTON);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_FENCE);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_FENCE_GATE);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_SLAB);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_STAIRS);
                        output.accept(ModBlocks.UNDERWORLD_BRICK_WALL);
                        output.accept(ModBlocks.NULL_BLOCK);
                        output.accept(ModBlocks.NULL_GRASSBLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
