package com.cx1337.nine_nether_regions.block;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import com.cx1337.nine_nether_regions.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NineNetherRegions.MODID);

    public static final DeferredBlock<Block> BLOODY_SAND =
            registerBlocks("bloody_sand", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.5F,10F)
                    .sound(SoundType.SAND)));

    public static final DeferredBlock<Block> BLOODBLADE_ROCK =
            registerBlocks("bloodblade_rock", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(32.0F,444F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> CRACKED_BLOODBLADE_ROCK =
            registerBlocks("cracked_bloodblade_rock", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(32.0F,444F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> HARDENED_BLOODBLADE_ROCK =
            registerBlocks("hardened_bloodblade_rock", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(32.0F,444F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> BLOODBLADE_ORE =
            registerBlocks("bloodblade_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(44.4F,4444F)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 6)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPACT_OBSIDIAN =
            registerBlocks("compact_obsidian", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.HARP)
                    .strength(52F,2400F)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> REINFORCED_OBSIDIAN =
            registerBlocks("reinforced_obsidian", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.HARP)
                    .strength(117F,24000F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 13)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.reinforced_obsidian"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredBlock<Block> UNDERWORLD_SPIRIT_STONE =
            registerBlocks("underworld_spirit_stone", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.HARP)
                    .strength(3.5F,245.2F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel(p_50872_ -> 8)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> UNDERWORLD_CRYSTAL_ORE =
            registerBlocks("underworld_crystal_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F,24.0F)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops()
                    .lightLevel(p_50872_ -> 12)));

    public static final DeferredBlock<Block> PINESAP =
            registerFlowerWithPot("pinesap", () -> new FlowerBlock(MobEffects.LUCK, 24, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GLASS)
                    .lightLevel(p_50872_ -> 12)
                    .pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> MANJUSAKA =
            registerBlocks("manjusaka", () -> new TallFlowerBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));


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

    public static final DeferredBlock<Block> STEEL_BLOCK =
            registerBlocks("steel_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(8.0F,12.0F)
                    .sound(SoundType.METAL)){
            });
    public static final DeferredBlock<Block> RUBY_BLOCK =
            registerBlocks("ruby_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BIT)
                    .requiresCorrectToolForDrops()
                    .strength(6.0F,10.0F)
                    .lightLevel(p_50872_ -> 8)
                    .sound(SoundType.STONE)){
            });
    public static final DeferredBlock<Block> RAINBOWGEM_BLOCK =
            registerBlocks("rainbowgem_block", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(22.0F,85.0F)
                    .lightLevel(p_50872_ -> 4)
                    .sound(SoundType.STONE)){
            });

    public static final DeferredBlock<Block> HELLIGHT =
            registerBlocks("hellight", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(1.5F,6.0F)
                    .sound(SoundType.SCULK_CATALYST)
                    .lightLevel(p_50872_ -> 15)));
    public static final DeferredBlock<Block> HELL_NUCLEUS =
            registerBlocks("hell_nucleus", () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(3.5F,200.0F)
                    .sound(SoundType.AMETHYST)
                    .lightLevel(p_50872_ -> 15)
            ){
                @Override
                public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
                    if (!entity.fireImmune()){
                        entity.setRemainingFireTicks(300);
                    }
                    super.stepOn(level, pos, state, entity);
                }

                @Override
                protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                    return Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
                }

                @Override
                protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                    return Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
                }

                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nine_nether_regions.hell_nucleus"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

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

    private static <T extends Block> DeferredBlock<T> registerBlockOnly(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static DeferredBlock<Block> registerFlowerWithPot(String name, Supplier<Block> flowerSupplier) {
        DeferredBlock<Block> flower = registerBlocks(name, flowerSupplier);
        registerBlockOnly("potted_" + name,
                () -> new FlowerPotBlock(null, () -> flower.get(),
                        BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)
                                .noOcclusion()
                                .lightLevel(state -> flower.get().defaultBlockState().getLightEmission())));
        return flower;
    }

    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
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
