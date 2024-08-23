package com.zefir.borukvautils.data;

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
    public static BlockState TOP_SLAB_BASED_STATE;
    public static BlockState BOTTOM_SLAB_BASED_STATE;

    public static void init(){
//        PolymerBlockModel TRANSPARENT_BLOCK_MODEL = PolymerBlockModel.of(id("block/transparent_texture"));

        PLANT_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.PLANT_BLOCK);
        KELP_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.KELP_BLOCK);
        TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TRIPWIRE_BLOCK);
        FLAT_TRIPWIRE_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TRIPWIRE_BLOCK_FLAT);
        TOP_SLAB_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TOP_SLAB);
        BOTTOM_SLAB_BASED_STATE = PolymerBlockResourceUtils.requestEmpty(BlockModelType.TOP_SLAB);
    }
}
