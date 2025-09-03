package com.kwssdme;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {
    private ModItems(){}

    public static final Item shit = registerItem("shit", new Item(new Item.Settings()));
    public static final Item vocild = registerItem("vocild",new Item(new Item.Settings()));






    public static <T extends Item> T registerItem(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwssdme", path), item);
    }
    
    public static void initialize(){}
}
