package org.opusstudios.mods.blacksmithrpg.registry;

import net.neoforged.bus.api.IEventBus;
import org.opusstudios.mods.blacksmithrpg.registry.impl.RecipeSerializerDeferredRegister;

public class BSRPGRecipeSerializer {
    public static final RecipeSerializerDeferredRegister INSTANCE = new RecipeSerializerDeferredRegister();

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
