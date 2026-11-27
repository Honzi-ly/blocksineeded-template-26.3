package com.honzicek1.blocksineeded.creativemodetab;

import com.honzicek1.blocksineeded.BlocksINeeded;
import com.honzicek1.blocksineeded.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlocksINeeded.MODID);

    public static final Supplier<CreativeModeTab> BLOCKSINEEDED_TAB = CREATIVE_MODE_TABS.register("blocksineeded_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CRACKED_TUFF_BRICKS.get()))
                    .title(Component.translatable("creativemodetab.blocksineeded.blocksineeded"))
                    .displayItems(((itemDisplayParameters, output) -> {


                        output.accept(ModBlocks.SANDSTONE_BRICKS);
                        output.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.SANDSTONE_BRICK_WALL);

                        output.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_BRICK_WALL);

                        output.accept(ModBlocks.SANDSTONE_TILES);
                        output.accept(ModBlocks.SANDSTONE_TILE_STAIRS);
                        output.accept(ModBlocks.SANDSTONE_TILE_SLAB);
                        output.accept(ModBlocks.SANDSTONE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_SANDSTONE_TILES);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_SANDSTONE_TILE_WALL);


                        output.accept(ModBlocks.RED_SANDSTONE_BRICKS);
                        output.accept(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.RED_SANDSTONE_BRICK_WALL);

                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);

                        output.accept(ModBlocks.RED_SANDSTONE_TILES);
                        output.accept(ModBlocks.RED_SANDSTONE_TILE_STAIRS);
                        output.accept(ModBlocks.RED_SANDSTONE_TILE_SLAB);
                        output.accept(ModBlocks.RED_SANDSTONE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_TILES);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_RED_SANDSTONE_TILE_WALL);


                        output.accept(ModBlocks.STONE_TILES);
                        output.accept(ModBlocks.STONE_TILE_STAIRS);
                        output.accept(ModBlocks.STONE_TILE_SLAB);
                        output.accept(ModBlocks.STONE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_STONE_TILES);
                        output.accept(ModBlocks.CRACKED_STONE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_STONE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_STONE_TILE_WALL);


                        output.accept(ModBlocks.CHISELED_GRANITE);

                        output.accept(ModBlocks.GRANITE_BRICKS);
                        output.accept(ModBlocks.GRANITE_BRICK_STAIRS);
                        output.accept(ModBlocks.GRANITE_BRICK_SLAB);
                        output.accept(ModBlocks.GRANITE_BRICK_WALL);

                        output.accept(ModBlocks.CRACKED_GRANITE_BRICKS);
                        output.accept(ModBlocks.CRACKED_GRANITE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_GRANITE_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_GRANITE_BRICK_WALL);

                        output.accept(ModBlocks.GRANITE_TILES);
                        output.accept(ModBlocks.GRANITE_TILE_STAIRS);
                        output.accept(ModBlocks.GRANITE_TILE_SLAB);
                        output.accept(ModBlocks.GRANITE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_GRANITE_TILES);
                        output.accept(ModBlocks.CRACKED_GRANITE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_GRANITE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_GRANITE_TILE_WALL);


                        output.accept(ModBlocks.CHISELED_DIORITE);

                        output.accept(ModBlocks.DIORITE_BRICKS);
                        output.accept(ModBlocks.DIORITE_BRICK_STAIRS);
                        output.accept(ModBlocks.DIORITE_BRICK_SLAB);
                        output.accept(ModBlocks.DIORITE_BRICK_WALL);

                        output.accept(ModBlocks.CRACKED_DIORITE_BRICKS);
                        output.accept(ModBlocks.CRACKED_DIORITE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_DIORITE_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_DIORITE_BRICK_WALL);

                        output.accept(ModBlocks.DIORITE_TILES);
                        output.accept(ModBlocks.DIORITE_TILE_STAIRS);
                        output.accept(ModBlocks.DIORITE_TILE_SLAB);
                        output.accept(ModBlocks.DIORITE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_DIORITE_TILES);
                        output.accept(ModBlocks.CRACKED_DIORITE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_DIORITE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_DIORITE_TILE_WALL);


                        output.accept(ModBlocks.CHISELED_ANDESITE);

                        output.accept(ModBlocks.ANDESITE_BRICKS);
                        output.accept(ModBlocks.ANDESITE_BRICK_STAIRS);
                        output.accept(ModBlocks.ANDESITE_BRICK_SLAB);
                        output.accept(ModBlocks.ANDESITE_BRICK_WALL);

                        output.accept(ModBlocks.CRACKED_ANDESITE_BRICKS);
                        output.accept(ModBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_ANDESITE_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_ANDESITE_BRICK_WALL);

                        output.accept(ModBlocks.ANDESITE_TILES);
                        output.accept(ModBlocks.ANDESITE_TILE_STAIRS);
                        output.accept(ModBlocks.ANDESITE_TILE_SLAB);
                        output.accept(ModBlocks.ANDESITE_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_ANDESITE_TILES);
                        output.accept(ModBlocks.CRACKED_ANDESITE_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_ANDESITE_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_ANDESITE_TILE_WALL);


                        output.accept(ModBlocks.CRACKED_TUFF_BRICKS);
                        output.accept(ModBlocks.CRACKED_TUFF_BRICK_STAIRS);
                        output.accept(ModBlocks.CRACKED_TUFF_BRICK_SLAB);
                        output.accept(ModBlocks.CRACKED_TUFF_BRICK_WALL);

                        output.accept(ModBlocks.TUFF_TILES);
                        output.accept(ModBlocks.TUFF_TILE_STAIRS);
                        output.accept(ModBlocks.TUFF_TILE_SLAB);
                        output.accept(ModBlocks.TUFF_TILE_WALL);

                        output.accept(ModBlocks.CRACKED_TUFF_TILES);
                        output.accept(ModBlocks.CRACKED_TUFF_TILE_STAIRS);
                        output.accept(ModBlocks.CRACKED_TUFF_TILE_SLAB);
                        output.accept(ModBlocks.CRACKED_TUFF_TILE_WALL);


                        output.accept(ModBlocks.CHISELED_END_STONE_BRICKS);


                        output.accept(ModBlocks.CHISELED_PURPUR);

                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
