package com.honzicek1.blocksineeded.datagen;

import com.honzicek1.blocksineeded.BlocksINeeded;
import com.honzicek1.blocksineeded.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.Mob;
import net.neoforged.fml.common.Mod;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, BlocksINeeded.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {





        blockModels.family(ModBlocks.STONE_TILES.get())
                .stairs(ModBlocks.STONE_TILE_STAIRS.get())
                .slab(ModBlocks.STONE_TILE_SLAB.get())
                .wall(ModBlocks.STONE_TILE_WALL.get());

        blockModels.family(ModBlocks.CRACKED_STONE_TILES.get())
                .stairs(ModBlocks.CRACKED_STONE_TILE_STAIRS.get())
                .slab(ModBlocks.CRACKED_STONE_TILE_SLAB.get())
                .wall(ModBlocks.CRACKED_STONE_TILE_WALL.get());


        blockModels.createTrivialCube(ModBlocks.CHISELED_GRANITE.get());

        blockModels.family(ModBlocks.GRANITE_BRICKS.get())
                .stairs(ModBlocks.GRANITE_BRICK_STAIRS.get())
                .slab(ModBlocks.GRANITE_BRICK_SLAB.get())
                .wall(ModBlocks.GRANITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .stairs(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get())
                .slab(ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get())
                .wall(ModBlocks.CRACKED_GRANITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.GRANITE_TILES.get())
                .stairs(ModBlocks.GRANITE_TILE_STAIRS.get())
                .slab(ModBlocks.GRANITE_TILE_SLAB.get())
                .wall(ModBlocks.GRANITE_TILE_WALL.get());

        blockModels.family(ModBlocks.CRACKED_GRANITE_TILES.get())
                .stairs(ModBlocks.CRACKED_GRANITE_TILE_STAIRS.get())
                .slab(ModBlocks.CRACKED_GRANITE_TILE_SLAB.get())
                .wall(ModBlocks.CRACKED_GRANITE_TILE_WALL.get());


        blockModels.createTrivialCube(ModBlocks.CHISELED_DIORITE.get());

        blockModels.family(ModBlocks.DIORITE_BRICKS.get())
                .stairs(ModBlocks.DIORITE_BRICK_STAIRS.get())
                .slab(ModBlocks.DIORITE_BRICK_SLAB.get())
                .wall(ModBlocks.DIORITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.CRACKED_DIORITE_BRICKS.get())
                .stairs(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS.get())
                .slab(ModBlocks.CRACKED_DIORITE_BRICK_SLAB.get())
                .wall(ModBlocks.CRACKED_DIORITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.DIORITE_TILES.get())
                .stairs(ModBlocks.DIORITE_TILE_STAIRS.get())
                .slab(ModBlocks.DIORITE_TILE_SLAB.get())
                .wall(ModBlocks.DIORITE_TILE_WALL.get());

        blockModels.family(ModBlocks.CRACKED_DIORITE_TILES.get())
                .stairs(ModBlocks.CRACKED_DIORITE_TILE_STAIRS.get())
                .slab(ModBlocks.CRACKED_DIORITE_TILE_SLAB.get())
                .wall(ModBlocks.CRACKED_DIORITE_TILE_WALL.get());


        blockModels.createTrivialCube(ModBlocks.CHISELED_ANDESITE.get());

        blockModels.family(ModBlocks.ANDESITE_BRICKS.get())
                .stairs(ModBlocks.ANDESITE_BRICK_STAIRS.get())
                .slab(ModBlocks.ANDESITE_BRICK_SLAB.get())
                .wall(ModBlocks.ANDESITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.CRACKED_ANDESITE_BRICKS.get())
                .stairs(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get())
                .slab(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB.get())
                .wall(ModBlocks.CRACKED_ANDESITE_BRICK_WALL.get());

        blockModels.family(ModBlocks.ANDESITE_TILES.get())
                .stairs(ModBlocks.ANDESITE_TILE_STAIRS.get())
                .slab(ModBlocks.ANDESITE_TILE_SLAB.get())
                .wall(ModBlocks.ANDESITE_TILE_WALL.get());

        blockModels.family(ModBlocks.CRACKED_ANDESITE_TILES.get())
                .stairs(ModBlocks.CRACKED_ANDESITE_TILE_STAIRS.get())
                .slab(ModBlocks.CRACKED_ANDESITE_TILE_SLAB.get())
                .wall(ModBlocks.CRACKED_ANDESITE_TILE_WALL.get());


        blockModels.family(ModBlocks.CRACKED_TUFF_BRICKS.get())
                .stairs(ModBlocks.CRACKED_TUFF_BRICK_STAIRS.get())
                .slab(ModBlocks.CRACKED_TUFF_BRICK_SLAB.get())
                .wall(ModBlocks.CRACKED_TUFF_BRICK_WALL.get());

        blockModels.family(ModBlocks.TUFF_TILES.get())
                .stairs(ModBlocks.TUFF_TILE_STAIRS.get())
                .slab(ModBlocks.TUFF_TILE_SLAB.get())
                .wall(ModBlocks.TUFF_TILE_WALL.get());

        blockModels.family(ModBlocks.CRACKED_TUFF_TILES.get())
                .stairs(ModBlocks.CRACKED_TUFF_TILE_STAIRS.get())
                .slab(ModBlocks.CRACKED_TUFF_TILE_SLAB.get())
                .wall(ModBlocks.CRACKED_TUFF_TILE_WALL.get());


        blockModels.createTrivialCube(ModBlocks.CHISELED_END_STONE_BRICKS.get());


        blockModels.createTrivialCube(ModBlocks.CHISELED_PURPUR.get());

    }
}
