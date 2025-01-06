package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.ItemDeferredRegister;

public class BSRPGItem {
    public static final ItemDeferredRegister INSTANCE = new ItemDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
