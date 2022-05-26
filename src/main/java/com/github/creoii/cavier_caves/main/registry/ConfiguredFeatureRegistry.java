package com.github.creoii.cavier_caves.main.registry;

import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ConfiguredFeatureRegistry {
    public static RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> MALACHITE_GEODE;
    public static RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> TOPAZ_GEODE;

    public static void register() {
        MALACHITE_GEODE = ConfiguredFeatures.register("malachite_geode", Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR), BlockStateProvider.of(BlockRegistry.MALACHITE_BLOCK), BlockStateProvider.of(BlockRegistry.MALACHITE_BLOCK), BlockStateProvider.of(Blocks.CALCITE), BlockStateProvider.of(Blocks.SMOOTH_BASALT), List.of(Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerThicknessConfig(1.2D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 3D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(3, 4), UniformIntProvider.create(2, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1));
        TOPAZ_GEODE = ConfiguredFeatures.register("topaz_geode", Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR), BlockStateProvider.of(BlockRegistry.TOPAZ_BLOCK), BlockStateProvider.of(BlockRegistry.TOPAZ_BLOCK), BlockStateProvider.of(Blocks.CALCITE), BlockStateProvider.of(Blocks.SMOOTH_BASALT), List.of(Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerThicknessConfig(1.2D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.5D, 2.5D, 1), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -12, 12, 0.1D, 1));
    }
}
