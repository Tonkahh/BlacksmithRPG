package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.CreativeTabDeferredRegister;

public class BSRPGCreativeTab {
    public static final CreativeTabDeferredRegister INSTANCE = new CreativeTabDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
