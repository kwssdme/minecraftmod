package com.kwssdme.tips;

import java.util.List;
import com.kwssdme.regist.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public final class vocaloid extends Item{
    public vocaloid(Settings settings) {super(settings);}
    
    public static final Item vocaloid = ModItems.registerItem("vocaloid", new vocaloid(new Item.Settings()));
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.vocaloid"));
    }
    public static void initialize() {}
}