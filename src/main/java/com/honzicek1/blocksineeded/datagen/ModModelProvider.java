package com.honzicek1.blocksineeded.datagen;

import com.honzicek1.blocksineeded.BlocksINeeded;
import com.honzicek1.blocksineeded.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, BlocksINeeded.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {




        blockModels.createTrivialCube(ModBlocks.CRACKED_TUFF_BRICKS.get());

    }
}
