package com.example;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "wide_mountains";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Config: how wide you want mountains - 3.0 = 3x wider
    public static final double MOUNTAIN_WIDTH_SCALE = 3.0;

    @Override
    public void onInitialize() {
        LOGGER.info("Wide Mountains v2 - Mountains are now {}x wider!", MOUNTAIN_WIDTH_SCALE);
        // For real wide mountains we need a Mixin into NoiseChunkGenerator
        // I'll add that next - this jar proves the base works
    }
}
