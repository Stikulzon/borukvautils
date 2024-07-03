package com.zefir.borukvautils.data;

import com.zefir.borukvautils.BorukvaUtils;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import net.minecraft.util.Identifier;

public class Models {
    public static final PolymerBlockModel TRANSPARENT_BLOCK_MODEL = PolymerBlockModel.of(Identifier.of(BorukvaUtils.MOD_ID, "block/transparent_texture"));
}
