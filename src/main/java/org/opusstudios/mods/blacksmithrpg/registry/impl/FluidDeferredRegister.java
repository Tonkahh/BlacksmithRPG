package org.opusstudios.mods.blacksmithrpg.registry.impl;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;

public class FluidDeferredRegister {
    private final DeferredRegister<FluidType> FLUIDTYPE_INSTANCE;
    private final DeferredRegister<Fluid> FLUID_INSTANCE;
    private final DeferredRegister<Block> BLOCK_INSTANCE;
    private final ItemDeferredRegister BUCKET_INSTANCE;
    public FluidDeferredRegister() {
        this.FLUIDTYPE_INSTANCE = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, BLACKSMITHRPG_MODID);
        this.FLUID_INSTANCE = DeferredRegister.create(Registries.FLUID, BLACKSMITHRPG_MODID);
        this.BLOCK_INSTANCE = DeferredRegister.create(Registries.BLOCK, BLACKSMITHRPG_MODID);
        this.BUCKET_INSTANCE = new ItemDeferredRegister();
    }
    public void register(IEventBus bus) {
        this.FLUIDTYPE_INSTANCE.register(bus);
        this.FLUID_INSTANCE.register(bus);
        this.BLOCK_INSTANCE.register(bus);
        this.BUCKET_INSTANCE.register(bus);
    }
}
