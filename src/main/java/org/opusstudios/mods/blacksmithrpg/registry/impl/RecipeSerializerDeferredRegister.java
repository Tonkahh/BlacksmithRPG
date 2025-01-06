package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class RecipeSerializerDeferredRegister {
    private final DeferredRegister<RecipeSerializer<?>> INSTANCE;
    public RecipeSerializerDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.RECIPE_SERIALIZER,BLACKSMITHRPG_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
