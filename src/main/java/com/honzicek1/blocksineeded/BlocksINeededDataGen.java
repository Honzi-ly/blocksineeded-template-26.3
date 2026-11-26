package com.honzicek1.blocksineeded;

import com.honzicek1.blocksineeded.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

@EventBusSubscriber(modid = BlocksINeeded.MODID)
public class BlocksINeededDataGen {

    @SubscribeEvent
    public static void GatherDataRegistryEntries(GatherDataRegistryEntriesEvent event) {

    }


    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

    generator.addProvider(true, new ModModelProvider(packOutput));
    }
}
