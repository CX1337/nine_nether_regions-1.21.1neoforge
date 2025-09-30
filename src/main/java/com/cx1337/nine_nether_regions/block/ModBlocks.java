package com.cx1337.nine_nether_regions.block;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NineNetherRegions.MODID);

    public static final DeferredBlock<Block> UNDERWORLD_CRYSTAL_ORE =
            registerBlocks("underworld_crystal_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F,24.0F)
                    .sound(SoundType.AMETHYST_CLUSTER)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 12)));

    public static final DeferredBlock<Block> GLOWING_UNDERWORLD_BRICKS =
            registerBlocks("glowing_underworld_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F,444.0F)
                    .sound(SoundType.NETHER_BRICKS)
                    .lightLevel(p_50872_ -> 6)));
    public static final DeferredBlock<Block> HELLALLOY_BLOCK =
            registerBlocks("hellalloy_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(66.0F,6066.0F)
                    .sound(SoundType.NETHERITE_BLOCK)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hellalloy_block"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> HELLIGHT =
            registerBlocks("hellight", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(1.5F,6.0F)
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel(p_50872_ -> 15)));
    public static final DeferredBlock<Block> STYX_BLOCK =
            registerBlocks("styx_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(99.0F,44444.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
                    .lightLevel(p_50872_ -> 4)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.styx_block"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> UNDERWORLDRACK =
            registerBlocks("underworldrack", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F,16.0F)
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> UNDERWORLD_BRICKS =
            registerBlocks("underworld_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F,444.0F)
                    .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<Block> NULL_BLOCK =
            registerBlocks("null_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.HARP)
                    .requiresCorrectToolForDrops()
                    .strength(444.0F,44444.0F)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> NULL_GRASSBLOCK =
            registerBlocks("null_grassblock", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.HARP)
                    .requiresCorrectToolForDrops()
                    .strength(444.0F,44444.0F)
                    .sound(SoundType.GRAVEL)));

    public static final DeferredBlock<ButtonBlock> UNDERWORLD_BRICK_BUTTON =
            registerBlocks("underworld_brick_button", () -> new ButtonBlock(BlockSetType.STONE,30,
                    BlockBehaviour.Properties.of()
                            .strength(3.0F,444.0F)
                            .requiresCorrectToolForDrops()
                            .noCollission()
                            .sound(SoundType.NETHER_BRICKS)));

    public static final DeferredBlock<SlabBlock> GLOWING_UNDERWORLD_BRICK_SLAB =
            registerBlocks("glowing_underworld_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5F, 444.0F)
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 6)
                    .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> GLOWING_UNDERWORLD_BRICK_STAIRS =
            registerBlocks("glowing_underworld_brick_stairs", () -> new StairBlock(ModBlocks.GLOWING_UNDERWORLD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                    .strength(3.5F, 444.0F)
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 6)
                            .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> UNDERWORLD_BRICK_SLAB =
            registerBlocks("underworld_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.0F, 444.0F)
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> UNDERWORLD_BRICK_STAIRS =
            registerBlocks("underworld_brick_stairs", () -> new StairBlock(ModBlocks.UNDERWORLD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(3.0F, 444.0F)
                            .mapColor(MapColor.COLOR_GREEN)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.NETHER_BRICKS)));

    public static final DeferredBlock<FenceBlock> UNDERWORLD_BRICK_FENCE =
            registerBlocks("underworld_brick_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4.0F, 444.0F)
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<FenceGateBlock> UNDERWORLD_BRICK_FENCE_GATE =
            registerBlocks("underworld_brick_fence_gate", () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                    .strength(4.0F, 444.0F)
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<WallBlock> UNDERWORLD_BRICK_WALL =
            registerBlocks("underworld_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(4.0F, 444.0F)
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS)));


    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
