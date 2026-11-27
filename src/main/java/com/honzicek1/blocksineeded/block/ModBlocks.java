package com.honzicek1.blocksineeded.block;

import com.honzicek1.blocksineeded.BlocksINeeded;
import com.honzicek1.blocksineeded.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BlocksINeeded.MODID);


    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            properties -> new StairBlock(STONE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
            properties -> new StairBlock(CRACKED_STONE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));


    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            properties -> new StairBlock(GRANITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_GRANITE_BRICK_STAIRS = registerBlock("cracked_granite_brick_stairs",
            properties -> new StairBlock(CRACKED_GRANITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_SLAB = registerBlock("cracked_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICK_WALL = registerBlock("cracked_granite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> GRANITE_TILES = registerBlock("granite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> GRANITE_TILE_STAIRS = registerBlock("granite_tile_stairs",
            properties -> new StairBlock(GRANITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> GRANITE_TILE_SLAB = registerBlock("granite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> GRANITE_TILE_WALL = registerBlock("granite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_GRANITE_TILES = registerBlock("cracked_granite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_GRANITE_TILE_STAIRS = registerBlock("cracked_granite_tile_stairs",
            properties -> new StairBlock(CRACKED_GRANITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_GRANITE_TILE_SLAB = registerBlock("cracked_granite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_GRANITE_TILE_WALL = registerBlock("cracked_granite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CHISELED_GRANITE = registerBlock("chiseled_granite",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));


    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            properties -> new StairBlock(DIORITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_DIORITE_BRICK_STAIRS = registerBlock("cracked_diorite_brick_stairs",
            properties -> new StairBlock(CRACKED_DIORITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_SLAB = registerBlock("cracked_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICK_WALL = registerBlock("cracked_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> DIORITE_TILES = registerBlock("diorite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> DIORITE_TILE_STAIRS = registerBlock("diorite_tile_stairs",
            properties -> new StairBlock(DIORITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> DIORITE_TILE_SLAB = registerBlock("diorite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> DIORITE_TILE_WALL = registerBlock("diorite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_DIORITE_TILES = registerBlock("cracked_diorite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_DIORITE_TILE_STAIRS = registerBlock("cracked_diorite_tile_stairs",
            properties -> new StairBlock(CRACKED_DIORITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_DIORITE_TILE_SLAB = registerBlock("cracked_diorite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_DIORITE_TILE_WALL = registerBlock("cracked_diorite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CHISELED_DIORITE = registerBlock("chiseled_diorite",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));


    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            properties -> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_ANDESITE_BRICK_STAIRS = registerBlock("cracked_andesite_brick_stairs",
            properties -> new StairBlock(CRACKED_ANDESITE_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_SLAB = registerBlock("cracked_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICK_WALL = registerBlock("cracked_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> ANDESITE_TILES = registerBlock("andesite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> ANDESITE_TILE_STAIRS = registerBlock("andesite_tile_stairs",
            properties -> new StairBlock(ANDESITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> ANDESITE_TILE_SLAB = registerBlock("andesite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> ANDESITE_TILE_WALL = registerBlock("andesite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_ANDESITE_TILES = registerBlock("cracked_andesite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_ANDESITE_TILE_STAIRS = registerBlock("cracked_andesite_tile_stairs",
            properties -> new StairBlock(CRACKED_ANDESITE_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_TILE_SLAB = registerBlock("cracked_andesite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_TILE_WALL = registerBlock("cracked_andesite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));


    public static final DeferredBlock<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
            properties -> new StairBlock(CRACKED_TUFF_BRICKS.get().defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> TUFF_TILES = registerBlock("tuff_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs",
            properties -> new StairBlock(TUFF_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> TUFF_TILE_SLAB = registerBlock("tuff_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> TUFF_TILE_WALL = registerBlock("tuff_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));

    public static final DeferredBlock<Block> CRACKED_TUFF_TILES = registerBlock("cracked_tuff_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_TUFF_TILE_STAIRS = registerBlock("cracked_tuff_tile_stairs",
            properties -> new StairBlock(CRACKED_TUFF_TILES.get().defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_TUFF_TILE_SLAB = registerBlock("cracked_tuff_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));
    public static final DeferredBlock<Block> CRACKED_TUFF_TILE_WALL = registerBlock("cracked_tuff_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));


    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 9.0F)
            ));


    public static final DeferredBlock<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
            ));







    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
