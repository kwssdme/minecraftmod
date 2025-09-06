package com.kwssdme.tips;

import java.util.List;
import com.kwssdme.regist.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public final class shit {

    public static final Item shit  = ModItems.registerItem("shit", new Item(new Item.Settings()));
    
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.shit"));
    }

    public static void initialize() {}
}


