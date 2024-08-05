package com.zefir.borukvautils.data;

import com.chocohead.mm.api.ClassTinkerers;
import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import net.minecraft.block.BlockState;

import static com.zefir.borukvautils.BorukvaUtils.id;

public class Models {
//    private static PolymerBlockModel TRANSPARENT_BLOCK_MODEL;
    public static BlockState PLANT_BASED_STATE;
    public static BlockState KELP_BASED_STATE;
    public static BlockState TRIPWIRE_BASED_STATE;
    public static BlockState FLAT_TRIPWIRE_BASED_STATE;
    public static BlockState SLAB_BASED_STATE;

    public static void init(){
        PolymerBlockModel TRANSPARENT_BLOCK_MODEL = PolymerBlockModel.of(id("block/transparent_texture"));

        PLANT_BASED_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.PLANT_BLOCK, TRANSPARENT_BLOCK_MODEL);
        KELP_BASED_STATE = PolymerBlockResourceUtils.requestBlock(BlockModelType.KELP_BLOCK, TRANSPARENT_BLOCK_MODEL);
        TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "TRIPWIRE_BLOCK"), TRANSPARENT_BLOCK_MODEL);
        FLAT_TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "FLAT_TRIPWIRE_BLOCK"), TRANSPARENT_BLOCK_MODEL);
        SLAB_BASED_STATE = PolymerBlockResourceUtils.requestBlock(ClassTinkerers.getEnum(BlockModelType.class, "SLAB_BLOCK"), TRANSPARENT_BLOCK_MODEL);
    }
}
