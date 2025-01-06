package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.FluidDeferredRegister;

public class BSRPGFluid {
    public static final FluidDeferredRegister INSTANCE = new FluidDeferredRegister();


    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
