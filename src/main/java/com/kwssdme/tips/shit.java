package com.kwssdme.tips;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
public final class shit {
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.shit"));
    }

    public static void initialize() {}
}


