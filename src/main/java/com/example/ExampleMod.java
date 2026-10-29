import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

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
