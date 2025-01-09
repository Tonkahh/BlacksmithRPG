package org.opusstudios.mods.blacksmithrpg.tile;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.opusstudios.mods.blacksmithrpg.registry.BSRPGTileEntity;

public class FurnaceEntity extends BlockEntity {
    public FurnaceEntity(BlockPos pos, BlockState state) {
        super(BSRPGTileEntity.FURNACE_ENTITY.get(), pos, state);
    }
}