package com.github.wratixor.backstick.setup;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;

@Mod.EventBusSubscriber(modid = BSMODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetClient {
    public static void init(final FMLClientSetupEvent event) {
        LOGGER.info("ClientSetup init() start: " + event.description());
    }
}
