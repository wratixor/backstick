package com.github.wratixor.backstick.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import com.github.wratixor.backstick.BackStick;

@Mod.EventBusSubscriber(modid = BackStick.BSMODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        BackStick.LOGGER.info("InitGenerators gatherData() start");
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new GenRecipe(generator));
        GenBlockTags blockTags = new GenBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new GenItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new GenItemModel(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new GenLanguage(generator, "en_us"));

    }
}
