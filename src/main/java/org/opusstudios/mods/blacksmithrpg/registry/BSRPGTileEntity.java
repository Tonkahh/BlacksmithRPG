package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.TileEntityDeferredRegister;

public class BSRPGTileEntity {
    public static final TileEntityDeferredRegister INSTANCE = new TileEntityDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
