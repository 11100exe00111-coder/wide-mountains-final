package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "wide_mountains";

    @Override
    public void onInitialize() {
        // HUGE TREES - 100 high x 100-200 wide - super rare
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.VEGETAL_DECORATION,
            RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("wide_mountains", "huge_oak_colossal_placed"))
        );
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.VEGETAL_DECORATION,
            RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("wide_mountains", "huge_acacia_colossal_placed"))
        );
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.VEGETAL_DECORATION,
            RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("wide_mountains", "huge_spruce_colossal_placed"))
        );

        System.out.println("Wide Mountains loaded! Huge trees + Wide Mountains to 400 blocks!");
    }
}
