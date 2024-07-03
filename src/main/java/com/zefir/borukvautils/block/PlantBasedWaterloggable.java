package com.zefir.borukvautils.block;

import com.zefir.borukvautils.BorukvaUtils;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import static com.zefir.borukvautils.data.Models.TRANSPARENT_BLOCK_MODEL;

public interface PlantBasedWaterloggable extends PolymerBlock, PolymerTexturedBlock {
    // Use if you want to create a block with a hitbox and the ability to waterlog.
    BlockState CLIENT_STATE_WATERLOGGED = PolymerBlockResourceUtils.requestBlock(BlockModelType.KELP_BLOCK, TRANSPARENT_BLOCK_MODEL);
    BlockState CLIENT_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.PLANT_BLOCK, TRANSPARENT_BLOCK_MODEL);

    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        if(state.get(Properties.WATERLOGGED)) {
            return CLIENT_STATE_WATERLOGGED;
        }
        return CLIENT_STATE;
    }
}
