package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class EntityDeferredRegister {
    private final DeferredRegister<EntityType<?>> INSTANCE;
    public EntityDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.ENTITY_TYPE, BLACKSMITHRPG_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
