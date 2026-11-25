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

                        output.accept(ModBlocks.CRACKED_TUFF_BRICKS);


                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
