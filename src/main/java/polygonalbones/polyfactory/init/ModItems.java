package polygonalbones.polyfactory.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import polygonalbones.polyfactory.PolyFactory;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(PolyFactory.MODID);

    public static final DeferredItem<BlockItem> TIN_CLUSTER_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.TIN_CLUSTER);
    public static final DeferredItem<Item> RAW_TIN = ITEMS.registerSimpleItem("raw_tin");
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot");
    public static final DeferredItem<BlockItem> RAW_TIN_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.RAW_TIN_BLOCK);

    // Tin tools
    public static final DeferredItem<Item> TIN_AXE =
            ITEMS.registerItem("tin_axe",properties -> new Item(
                    properties.axe(ModToolMaterials.TIN_MATERIAL,7.0F, -3.2F)));
    public static final DeferredItem<Item> TIN_HOE =
            ITEMS.registerItem("tin_hoe",properties -> new Item(
                    properties.hoe(ModToolMaterials.TIN_MATERIAL,-1.0F, -2.0F)));
    public static final DeferredItem<Item> TIN_PICKAXE =
            ITEMS.registerItem("tin_pickaxe",properties -> new Item(
                    properties.pickaxe(ModToolMaterials.TIN_MATERIAL,1.0F, -2.8F)));
    public static final DeferredItem<Item> TIN_SHOVEL =
            ITEMS.registerItem("tin_shovel",properties -> new Item(
                    properties.shovel(ModToolMaterials.TIN_MATERIAL,1.5F, -3.0F)));
    public static final DeferredItem<Item> TIN_SPEAR =
            ITEMS.registerItem("tin_spear",properties -> new Item(
                    properties.spear(
                            ModToolMaterials.TIN_MATERIAL,
                            0.85F,
                            0.82F,
                            0.65F,
                            4.0F,
                            12.0F,
                            8.25F,
                            5.1F,
                            12.5F,
                            4.6F)));
    public static final DeferredItem<Item> TIN_SWORD =
            ITEMS.registerItem("tin_sword",properties -> new Item(
                    properties.sword(ModToolMaterials.TIN_MATERIAL, 3.0F, -2.4F)));
}