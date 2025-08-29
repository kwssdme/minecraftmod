package com.kwssdme;

import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
public final class KwssdmeItemGroup {
    public static final ItemGroup KWSSDME = FabricItemGroup.builder()
           .icon(() -> new ItemStack(kwssdmeitems.KWSSDME_ITEM))
           .displayName(Text.translatable("itemGroup.kwssdme"))
           .entries((context, entries)->{
            entries.add(kwssdmeitems.KWSSDME_ITEM);})
           .build();
}
