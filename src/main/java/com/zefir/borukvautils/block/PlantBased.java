package com.zefir.borukvautils.block;

import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.BlockState;

import static com.zefir.borukvautils.data.Models.PLANT_BASED_STATE;

// Use if you want to create a block with a hitbox.
public interface PlantBased extends PolymerTexturedBlock {
    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        return PLANT_BASED_STATE;
    }
}
