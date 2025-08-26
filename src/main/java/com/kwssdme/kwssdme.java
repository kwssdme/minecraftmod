package com.kwssdme;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registry;

    public class kwssdme {
    public static Item register(Identifier kwssdme, Item item) {
        return Items.register(RegistryKey.of(Registries.ITEM.getKey(), kwssdme), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }
}