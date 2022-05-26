package com.github.creoii.cavier_caves.main.registry;

import com.github.creoii.cavier_caves.main.CavierCaves;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block TOPAZ_BLOCK = new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_YELLOW));
    public static final Block MALACHITE_BLOCK = new AmethystBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.BRIGHT_TEAL));

    public static void register() {
        registerBlock(new Identifier(CavierCaves.MOD_ID, "topaz_block"), TOPAZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
        registerBlock(new Identifier(CavierCaves.MOD_ID, "malachite_block"), MALACHITE_BLOCK, ItemGroup.BUILDING_BLOCKS);
    }

    public static <B extends Block> Block registerBlock(Identifier id, B block, ItemGroup group) {
        Registry.register(Registry.BLOCK, id, block);
        if (group != null) Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(group)));
        return block;
    }
}
