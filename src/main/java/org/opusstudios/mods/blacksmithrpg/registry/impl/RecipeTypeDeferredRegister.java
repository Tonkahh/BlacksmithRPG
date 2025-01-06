package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class RecipeTypeDeferredRegister {
    private final DeferredRegister<RecipeType<?>> INSTANCE;
    public RecipeTypeDeferredRegister() {
        this.INSTANCE = DeferredRegister.create(Registries.RECIPE_TYPE,BLACKSMITHRPG_MODID);
    }
    public void register(IEventBus bus) {
        this.INSTANCE.register(bus);
    }
}
