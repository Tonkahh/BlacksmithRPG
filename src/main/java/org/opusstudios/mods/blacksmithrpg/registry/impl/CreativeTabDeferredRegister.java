package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class CreativeTabDeferredRegister {
    private final DeferredRegister<CreativeModeTab> INSTANCE;

    public CreativeTabDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BLACKSMITHRPG_MODID);
    }

    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
