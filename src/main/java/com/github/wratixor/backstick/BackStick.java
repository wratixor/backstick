package com.github.wratixor.backstick;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.github.wratixor.backstick.setup.*;


@Mod(BackStick.BSMODID)
public class BackStick
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String BSMODID = "backstick";
    public BackStick()
    {
        LOGGER.info("Wratixor says thanks for installing the BackStick!");
        SetMain.setup();
        RegMod.init();
        RegConfig.register();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(SetMain::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modEventBus.addListener(SetClient::init));

    }
}
