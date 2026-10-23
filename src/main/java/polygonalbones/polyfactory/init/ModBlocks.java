package polygonalbones.polyfactory.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import polygonalbones.polyfactory.PolyFactory;
import polygonalbones.polyfactory.block.ClusterBlock;

@SuppressWarnings("unused")
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PolyFactory.MODID);

    public static final DeferredBlock<Block> TIN_CLUSTER = BLOCKS.register(
            "tin_cluster",
            registryName -> new ClusterBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
            ));
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = BLOCKS.register(
            "raw_tin_block",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
            ));
}