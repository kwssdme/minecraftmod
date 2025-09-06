package com.kwssdme.moditemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.kwssdme.tips.Shit;
import com.kwssdme.tips.Vocaloid;

public final class KwssdmeItemGroup {
    public static final ItemGroup KWSSDME_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Shit.shit))
            .displayName(Text.translatable("itemGroup.kwssdme"))
            .entries((context, entries)->{
                entries.add(Shit.shit);
                entries.add(Vocaloid.vocaloid);})
                
            .build();

    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP, new Identifier("kwssdme", "kwssdme_item_group"), KWSSDME_ITEM_GROUP);
    }
}
