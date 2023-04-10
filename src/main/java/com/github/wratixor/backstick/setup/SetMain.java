package com.github.wratixor.backstick.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;

import com.github.wratixor.backstick.BackStick;

@Mod.EventBusSubscriber(modid = BackStick.BSMODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetMain {
    public static final String TAB_NAME = "backstick_tab";
    public static final CreativeModeTab MODE_TAB = new CreativeModeTab(TAB_NAME) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(RegMod.WOODEN_BACKSTICK.get());
        }
    };
    public static void setup() {

    }
    public static void init(final FMLCommonSetupEvent event) {
        BackStick.LOGGER.info("MainSetup init() start: " + event.description());
    }
}
