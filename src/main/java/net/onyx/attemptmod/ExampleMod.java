package net.onyx.attemptmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "ExampleMod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	//Cool Comment Here
	public void onInitialize() {
		System.out.println("Onyx's First Mod loaded");
	}
}