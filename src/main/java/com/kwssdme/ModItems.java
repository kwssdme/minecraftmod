package com.kwssdme;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {
    private ModItems(){}

    public static final Item KWSSD_ITEM = register("kwss_item", new Item(new Item.Settings()));

    public static <T extends Item> T register(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwssdme", path), item);
    }
    public static void initialize(){}
}
