package com.zefir.borukvautils.block;

import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;

import static com.zefir.borukvautils.data.Models.*;

// Use if you want to create a block with a hitbox and the ability to waterlog.
public interface PlantBasedWaterloggable extends PolymerTexturedBlock {
    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        if(state.get(Properties.WATERLOGGED)) {
            return KELP_BASED_STATE;
        }
        return PLANT_BASED_STATE;
    }
}
