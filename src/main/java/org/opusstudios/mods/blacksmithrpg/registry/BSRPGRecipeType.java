package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.RecipeTypeDeferredRegister;

public class BSRPGRecipeType {
    public static final RecipeTypeDeferredRegister INSTANCE = new RecipeTypeDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
