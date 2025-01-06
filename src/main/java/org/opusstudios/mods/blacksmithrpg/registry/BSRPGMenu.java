package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.MenuDeferredRegister;

public class BSRPGMenu {
    public static final MenuDeferredRegister INSTANCE = new MenuDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
