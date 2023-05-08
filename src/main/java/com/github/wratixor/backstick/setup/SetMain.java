package com.github.wratixor.backstick.setup;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;

@Mod.EventBusSubscriber(modid = BSMODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetMain {
    public static void setup() {

    }
    public static void init(final FMLCommonSetupEvent event) {
        LOGGER.info("MainSetup init() start: " + event.description());
    }
}
