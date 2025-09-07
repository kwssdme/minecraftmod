package com.kwssdme.items;

import java.util.List;
import net.minecraft.entity.effect.StatusEffects;
import com.kwssdme.regist.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public final class shit extends Item {
    public static final FoodComponent shitFood = (new FoodComponent.Builder().hunger(1).saturationModifier(0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,10), 1.0f)
        .build());

    public shit(Settings settings) {super(settings);}
    
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.shit"));
        
    }

    public static final Item shit  = ModItems.registerItem("shit", new shit(new Item.Settings().food(shitFood)));
    
    public static void initialize() {}
}

