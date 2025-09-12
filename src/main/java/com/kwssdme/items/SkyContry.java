package com.kwssdme.items;

import java.util.List;

import com.kwssdme.regist.KwssdmeModInit;
import com.kwssdme.regist.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SkyContry extends Item{
    public SkyContry(Settings settings) {super(settings);}
    public static final SoundEvent SKY_CONTRY_SOUND = register("sky_contry_sound");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(KwssdmeModInit.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static final Item SKY_CONTRY = ModItems.registerItem("sky_contry", new SkyContry(new Item.Settings()));
    
        @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.sky_contry"));
    }
    
        @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SKY_CONTRY_SOUND, 1.0F, 1.0F);
            return TypedActionResult.success(user.getStackInHand(hand));
        }

    public static void initialize() {}
}
