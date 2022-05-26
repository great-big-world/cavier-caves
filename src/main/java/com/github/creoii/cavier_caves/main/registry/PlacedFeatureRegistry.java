package com.github.creoii.cavier_caves.main.registry;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class PlacedFeatureRegistry {
    public static RegistryEntry<PlacedFeature> MALACHITE_GEODE;
    public static RegistryEntry<PlacedFeature> TOPAZ_GEODE;

    public static void register() {
        MALACHITE_GEODE = PlacedFeatures.register("malachite_geode", ConfiguredFeatureRegistry.MALACHITE_GEODE, RarityFilterPlacementModifier.of(24), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(30)), BiomePlacementModifier.of());
        TOPAZ_GEODE = PlacedFeatures.register("topaz_geode", ConfiguredFeatureRegistry.TOPAZ_GEODE, RarityFilterPlacementModifier.of(24), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(30)), BiomePlacementModifier.of());
    }
}
