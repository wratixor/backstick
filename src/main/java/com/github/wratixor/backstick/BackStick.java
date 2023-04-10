package com.github.wratixor.backstick;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.github.wratixor.backstick.setup.*;


@Mod(BackStick.BSMODID)
public class BackStick
{
    public static final String BSMODID = "backstick";
    public static final Logger LOGGER = LogUtils.getLogger();
    public BackStick()
    {
        LOGGER.info("Wratixor says thanks for installing the BackStick!");
        RegMod.init();
        RegConfig.register();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(SetMain::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modEventBus.addListener(SetClient::init));

    }
}
