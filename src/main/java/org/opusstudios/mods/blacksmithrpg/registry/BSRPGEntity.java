package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.EntityDeferredRegister;

public class BSRPGEntity {
    public static final EntityDeferredRegister INSTANCE = new EntityDeferredRegister();
    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
