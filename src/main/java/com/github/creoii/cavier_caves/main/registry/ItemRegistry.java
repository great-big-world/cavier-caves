package com.github.creoii.cavier_caves.main.registry;

import com.github.creoii.cavier_caves.main.CavierCaves;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item MALACHITE = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item TOPAZ = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(CavierCaves.MOD_ID, "malachite"), MALACHITE);
        Registry.register(Registry.ITEM, new Identifier(CavierCaves.MOD_ID, "topaz"), TOPAZ);
    }
}
