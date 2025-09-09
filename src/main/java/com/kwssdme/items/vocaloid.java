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

public final class vocaloid extends Item{
    public static final SoundEvent VOCALOID_SOUND = register("vocaloid_sound");
    public vocaloid(Settings settings) {super(settings);}


    private static SoundEvent register(String name) {
        Identifier id = new Identifier(KwssdmeModInit.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    
    public static final Item vocaloid = ModItems.registerItem("vocaloid", new vocaloid(new Item.Settings()));
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tips.kwssdme.vocaloid"));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(VOCALOID_SOUND, 1.0F, 1.0F);
            return TypedActionResult.success(user.getStackInHand(hand));
        }

    public static void initialize() {}
}