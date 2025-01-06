package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class ItemDeferredRegister {
    private final DeferredRegister<Item> INSTANCE;

    public ItemDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.ITEM, BLACKSMITHRPG_MODID);
    }

    public void register(IEventBus bus){
        this.INSTANCE.register(bus);
    }
}
