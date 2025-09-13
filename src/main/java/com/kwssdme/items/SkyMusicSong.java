package com.kwssdme.items;

import com.kwssdme.regist.KwssdmeModInit;
import com.kwssdme.regist.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SkyMusicSong extends Item{
    public static final SoundEvent SkyMusicSound = register("SkyMusic_sound");

    public static final Item SkyMusicSong = ModItems.registerItem("sky_music_song", new MusicDiscItem(15, SkyMusicSound, new Item.Settings().maxCount(1),234));

    public SkyMusicSong(Settings settings) {super(settings);}

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(KwssdmeModInit.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }







        public static void initialize() {}
}
