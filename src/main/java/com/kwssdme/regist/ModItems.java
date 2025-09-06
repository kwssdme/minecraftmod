package com.kwssdme.regist;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    private ModItems(){}
    
    public static <T extends Item> T registerItem(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwssdme", path), item);
    }

    public static void initialize(){}
}