package com.kwssdme.tips;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class shit {
public static final Item shit = registerItem("shit", new Item(new Item.Settings()));
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.shit"));
    }

public static <T extends Item> T registerItem(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwssdme", path), item);
    }
}


