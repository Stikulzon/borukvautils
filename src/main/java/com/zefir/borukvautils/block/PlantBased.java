package com.zefir.borukvautils.block;

import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.BlockState;

import static com.zefir.borukvautils.data.Models.TRANSPARENT_BLOCK_MODEL;

public interface PlantBased extends PolymerBlock, PolymerTexturedBlock {
    // Use if you want to create a block with a hitbox.
    BlockState CLIENT_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.PLANT_BLOCK, TRANSPARENT_BLOCK_MODEL);

    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        return CLIENT_STATE;
    }
}
