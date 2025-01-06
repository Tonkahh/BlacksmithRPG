package org.opusstudios.mods.blacksmithrpg;


import static blacksmithrpg.api.BlacksmithRPGAPI.BLACKSMITHRPG_MODID;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.opusstudios.mods.blacksmithrpg.registry.*;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BLACKSMITHRPG_MODID)
public class BlacksmithRPG
{
    public BlacksmithRPG(IEventBus modEventBus, ModContainer modContainer)
    {
        BSRPGBlock.register(modEventBus);
        BSRPGCreativeTab.register(modEventBus);
        BSRPGEntity.register(modEventBus);
        BSRPGFluid.register(modEventBus);
        BSRPGItem.register(modEventBus);
        BSRPGMenu.register(modEventBus);
        BSRPGRecipeSerializer.register(modEventBus);
        BSRPGRecipeType.register(modEventBus);
        BSRPGTileEntity.register(modEventBus);
    }
}
