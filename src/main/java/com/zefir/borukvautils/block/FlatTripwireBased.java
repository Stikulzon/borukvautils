package com.zefir.borukvautils.block;

import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.BlockState;

import static com.zefir.borukvautils.data.Models.FLAT_TRIPWIRE_BASED_STATE;

// Use if you want to create a block with a hitbox.
public interface FlatTripwireBased extends PolymerTexturedBlock {
    @Override
    default BlockState getPolymerBlockState(BlockState state) {
        return FLAT_TRIPWIRE_BASED_STATE;
    }
}
