package polygonalbones.polyfactory.event;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import polygonalbones.polyfactory.PolyFactory;
import polygonalbones.polyfactory.init.ModItems;

@EventBusSubscriber(modid = PolyFactory.MODID)
public class ModCreativeTabBuilder {
    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if(tab == CreativeModeTabs.INGREDIENTS) {
            event.insertBefore(
                    Items.RAW_COPPER.getDefaultInstance(),
                    ModItems.RAW_TIN.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertBefore(
                    Items.COPPER_INGOT.getDefaultInstance(),
                    ModItems.TIN_INGOT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
        else if(tab == CreativeModeTabs.COMBAT) {
            // Tin weapons
            event.insertBefore(
                    Items.COPPER_SWORD.getDefaultInstance(),
                    ModItems.TIN_SWORD.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertBefore(
                    Items.COPPER_SPEAR.getDefaultInstance(),
                    ModItems.TIN_SPEAR.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertBefore(
                    Items.COPPER_AXE.getDefaultInstance(),
                    ModItems.TIN_AXE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
        else if(tab == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            // Tin tools
            event.insertAfter(
                    Items.STONE_HOE.getDefaultInstance(),
                    ModItems.TIN_SHOVEL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.TIN_SHOVEL.get().getDefaultInstance(),
                    ModItems.TIN_PICKAXE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.TIN_PICKAXE.get().getDefaultInstance(),
                    ModItems.TIN_AXE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.TIN_AXE.get().getDefaultInstance(),
                    ModItems.TIN_HOE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
        else if(tab == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertBefore(
                    Items.COPPER_ORE.getDefaultInstance(),
                    ModItems.TIN_CLUSTER_BLOCK_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertBefore(
                    Items.RAW_COPPER_BLOCK.getDefaultInstance(),
                    ModItems.RAW_TIN_BLOCK_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }
}