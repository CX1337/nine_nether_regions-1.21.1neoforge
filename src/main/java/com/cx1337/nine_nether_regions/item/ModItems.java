package com.cx1337.nine_nether_regions.item;

import com.cx1337.nine_nether_regions.NineNetherRegions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=
            DeferredRegister.createItems(NineNetherRegions.MODID);

    public static final DeferredItem<Item> HELLALLOY_INGOT =
            ITEMS.register("hellalloy_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STYX_INGOT =
            ITEMS.register("styx_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
