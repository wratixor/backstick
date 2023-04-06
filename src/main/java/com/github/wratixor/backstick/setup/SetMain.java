package com.github.wratixor.backstick.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;
@Mod(BSMODID)
public class SetMain {
    public static final String TAB_NAME = "backstick_tab";
    public static final CreativeModeTab MODE_TAB = new CreativeModeTab(TAB_NAME) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(RegMod.WOODEN_BACKSTICK.get());
        }
    };
    public static void init(final FMLCommonSetupEvent event) {
        LOGGER.info("MainSetup init() start: " + event.description());
    }
}
