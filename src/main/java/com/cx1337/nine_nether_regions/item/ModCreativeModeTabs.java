package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NineNetherRegions.MODID);

    public static final Supplier<CreativeModeTab> NineNetherRegions_Tab =
            CREATIVE_MODE_TABS.register("nine_nether_regions_materials_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.STYX_INGOT.get()))
                    .title(Component.translatable("itemGroup.nine_nether_regions_materials_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.HELLALLOY_INGOT);
                        output.accept(ModItems.STYX_INGOT);
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
