package com.kwssdme.regist;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import java.util.List;

public final class ModItems {
    private ModItems(){}

    public static final Item shit = registerItem("shit", new Item(new Item.Settings()));
        public void appendTooltip(ItemStack itemStack,World world, List<Text> tooltip, TooltipContext tooltipContext){
            tooltip.add(Text.translatable("tips.kwssdme.shit"));
        }

    public static final Item vocild = registerItem("vocild",new Item(new Item.Settings()));





    public static <T extends Item> T registerItem(String path, T item){
        return Registry.register(Registries.ITEM, new Identifier("kwssdme", path), item);
    }
    
    public static void initialize(){}
}
