package com.kwssdme;
import java.rmi.registry.Registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
public final class ModItems<T> {
    private ModItems(){}

    public static final Item KWSSD_ITEM = new Item(new FabricItemSettings());

    public static <T extends Item> T register(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwss", path), item);
    }
    public static void initialize(){}
}
