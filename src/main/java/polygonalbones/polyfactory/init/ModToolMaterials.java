package polygonalbones.polyfactory.init;

import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial TIN_MATERIAL = new ToolMaterial(
            ModTags.INCORRECT_FOR_TIN_TOOL,
            190,
            5.0F,
            1.0F,
            13,
            ModTags.TIN_TOOL_MATERIALS
    );

    public static void init() {}
}