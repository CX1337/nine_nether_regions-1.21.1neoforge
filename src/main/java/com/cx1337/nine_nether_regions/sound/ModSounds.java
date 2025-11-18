package com.cx1337.nine_nether_regions.sound;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.time.Duration;
import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, NineNetherRegions.MODID);

    public static final DeferredRegister<JukeboxSong> JUKEBOX_SONGS =
            DeferredRegister.create(Registries.JUKEBOX_SONG, NineNetherRegions.MODID);

    public static final Supplier<SoundEvent> DAWN_OF_THE_APOCALYPSE =
            registerSoundEvent("dawn_of_the_apocalypse");

    // 创建 ResourceKey
    public static final ResourceKey<JukeboxSong> DAWN_OF_THE_APOCALYPSE_KEY =
            ResourceKey.create(Registries.JUKEBOX_SONG,
                    ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID, "dawn_of_the_apocalypse"));

    // 注册 JukeboxSong
    public static final Supplier<JukeboxSong> DAWN_OF_THE_APOCALYPSE_SONG =
            JUKEBOX_SONGS.register("dawn_of_the_apocalypse",
                    () -> new JukeboxSong(
                            BuiltInRegistries.SOUND_EVENT.wrapAsHolder(DAWN_OF_THE_APOCALYPSE.get()),
                            Component.translatable("item.nine_nether_regions.music_disc_styx_ferryman.desc"),
                            2880, // 144秒 * 20 tick/秒
                            15
                    ));

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(NineNetherRegions.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
        JUKEBOX_SONGS.register(eventBus);
    }
}
