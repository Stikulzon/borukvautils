package com.zefir.borukvautils.data;

import com.chocohead.mm.api.ClassTinkerers;
import com.zefir.borukvautils.BorukvaUtils;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;

public class Models {
    public static final PolymerBlockModel TRANSPARENT_BLOCK_MODEL = PolymerBlockModel.of(Identifier.of(BorukvaUtils.MOD_ID, "block/transparent_texture"));
    public static final BlockState PLANT_BASED_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.PLANT_BLOCK, TRANSPARENT_BLOCK_MODEL);
    public static final BlockState KELP_BASED_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.KELP_BLOCK, TRANSPARENT_BLOCK_MODEL);
    public static final BlockState TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "TRIPWIRE_BLOCK"), TRANSPARENT_BLOCK_MODEL);
    public static final BlockState FLAT_TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "FLAT_TRIPWIRE_BLOCK"), TRANSPARENT_BLOCK_MODEL);
    public static final BlockState SLAB_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "SLAB_BLOCK"), TRANSPARENT_BLOCK_MODEL);
}
