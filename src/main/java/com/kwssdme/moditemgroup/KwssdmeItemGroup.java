package com.kwssdme.moditemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.kwssdme.tips.shit;
import com.kwssdme.tips.vocaloid;

public final class KwssdmeItemGroup {
    public static final ItemGroup KWSSDME_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(shit.shit))
            .displayName(Text.translatable("itemGroup.kwssdme"))
            .entries((context, entries)->{
                entries.add(shit.shit);
                entries.add(vocaloid.vocaloid);})
                
            .build();

    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP, new Identifier("kwssdme", "kwssdme_item_group"), KWSSDME_ITEM_GROUP);
    }
}
