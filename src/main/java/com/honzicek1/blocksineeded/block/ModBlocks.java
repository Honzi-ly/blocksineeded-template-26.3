package com.honzicek1.blocksineeded.block;

import com.honzicek1.blocksineeded.BlocksINeeded;
import com.honzicek1.blocksineeded.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BlocksINeeded.MODID);


    public static final DeferredBlock<Block> CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
            properties -> new Block(properties
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

    public static final DeferredBlock<Block> CRACKED_TUFF_TILES = registerBlock("cracked_tuff_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.TUFF_BRICKS)
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
