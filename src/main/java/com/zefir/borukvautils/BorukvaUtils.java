package com.zefir.borukvautils;

import com.zefir.borukvautils.data.Models;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BorukvaUtils implements ModInitializer {
	public static final String MOD_ID = "borukvautils";
    public static final Logger LOGGER = LoggerFactory.getLogger("borukvautils");

	@Override
	public void onInitialize() {
		Models.init();

		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("Successfully added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}

		PolymerResourcePackUtils.markAsRequired();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}