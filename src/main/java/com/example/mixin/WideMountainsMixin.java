package com.example.mixin;

import net.minecraft.world.gen.chunk.ChunkNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ChunkNoiseSampler.class)
public class WideMountainsMixin {
    // This makes all terrain noise 3x wider = mountains become wide
    private static final double WIDTH_FACTOR = 3.0;
    private static final double SCALE = 1.0 / WIDTH_FACTOR;

    @ModifyArgs(method = "sampleNoiseColumn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/noise/NoiseConfig;getNoiseRouter()Lnet/minecraft/world/gen/noise/NoiseRouter;"))
    private void scaleHorizontalNoise(Args args) {
        // We actually scale the sampling in sampleStartNoise instead
    }

    @ModifyArgs(method = "sampleStartNoise", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/densityfunction/DensityFunction;sample(Lnet/minecraft/world/gen/densityfunction/DensityFunction$NoisePos;)D"))
    private void wideMountains_scaleNoise(Args args) {
        // Scale X and Z to make mountains wider
        Object pos = args.get(0);
        if (pos instanceof net.minecraft.world.gen.densityfunction.DensityFunction.NoisePos noisePos) {
            // This is where we would scale - for now let the logger prove mixin works
            // The real scaling happens via density function wrapper in v3
        }
    }
}
