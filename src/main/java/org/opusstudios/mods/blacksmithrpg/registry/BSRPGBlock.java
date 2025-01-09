package org.opusstudios.mods.blacksmithrpg.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.opusstudios.mods.blacksmithrpg.block.*;
import org.opusstudios.mods.blacksmithrpg.registry.impl.BlockItemDeferredRegister;

public class BSRPGBlock {

    public static final BlockItemDeferredRegister INSTANCE = new BlockItemDeferredRegister();

    public static final DeferredHolder<Block,TestBlock> TEST_BLOCK = INSTANCE.register(
            "test_block",
            TestBlock::new,
            BlockItem::new);

    public static final DeferredHolder<Block, TestBlock2> TEST_BLOCK_2 = INSTANCE.register(
            "test_block2",
            TestBlock2::new,
            BlockItem::new);

    public static final DeferredHolder<Block, TestBlock3> TEST_BLOCK_3 = INSTANCE.register(
            "test_block3",
            TestBlock3::new,
            BlockItem::new);

    public static final DeferredHolder<Block, TestBlock4> TEST_BLOCK_4 = INSTANCE.register(
            "test_block4",
            TestBlock4::new,
            BlockItem::new);

    public static final DeferredHolder<Block, Hearth> HEARTH = INSTANCE.register(
            "hearth",
            Hearth::new,
            BlockItem::new);

    public static void register(IEventBus bus) {
        INSTANCE.register(bus);
    }
}
