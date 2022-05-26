package com.github.creoii.cavier_caves.main;

import com.github.creoii.cavier_caves.main.registry.BlockRegistry;
import com.github.creoii.cavier_caves.main.registry.ConfiguredFeatureRegistry;
import com.github.creoii.cavier_caves.main.registry.ItemRegistry;
import com.github.creoii.cavier_caves.main.registry.PlacedFeatureRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class CavierCaves implements ModInitializer {
    public static final String MOD_ID = "cavier_caves";

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        BlockRegistry.register();
        ConfiguredFeatureRegistry.register();
        PlacedFeatureRegistry.register();

        modifyBiomes();
    }

    private static void modifyBiomes() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.LOCAL_MODIFICATIONS, PlacedFeatureRegistry.MALACHITE_GEODE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.LOCAL_MODIFICATIONS, PlacedFeatureRegistry.TOPAZ_GEODE.getKey().get());
    }
}
