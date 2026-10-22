package polygonalbones.polyfactory;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(PolyFactory.MODID)
public class PolyFactory {
    public static final String MODID = "polyfactory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PolyFactory(IEventBus modEventBus, ModContainer modContainer) {
    }
}
