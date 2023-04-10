package com.github.wratixor.backstick.setup;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import com.github.wratixor.backstick.BackStick;

@Mod.EventBusSubscriber(modid = BackStick.BSMODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetClient {
    public static void init(final FMLClientSetupEvent event) {
        BackStick.LOGGER.info("ClientSetup init() start: " + event.description());
    }
}
