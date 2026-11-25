package com.honzicek1.blocksineeded.item;

import com.honzicek1.blocksineeded.BlocksINeeded;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BlocksINeeded.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
