package polygonalbones.polyfactory.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import polygonalbones.polyfactory.PolyFactory;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PolyFactory.MODID);

    public static final DeferredItem<BlockItem> TIN_CLUSTER_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.TIN_CLUSTER);
    public static final DeferredItem<Item> RAW_TIN = ITEMS.registerSimpleItem("raw_tin");
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot");
}