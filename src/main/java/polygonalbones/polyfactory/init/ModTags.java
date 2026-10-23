package polygonalbones.polyfactory.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import polygonalbones.polyfactory.PolyFactory;

public class ModTags {
    public static final TagKey<Block> INCORRECT_FOR_TIN_TOOL =
            TagKey.create(BuiltInRegistries.BLOCK.key(),
                    Identifier.fromNamespaceAndPath(PolyFactory.MODID, "incorrect_for_tin_tool"));

    public static final TagKey<Item> TIN_TOOL_MATERIALS =
            ItemTags.create(Identifier.fromNamespaceAndPath(PolyFactory.MODID, "tin"));

    public static void init() {}
}