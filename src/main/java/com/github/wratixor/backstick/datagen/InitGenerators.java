package com.github.wratixor.backstick.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;

@Mod.EventBusSubscriber(modid = BSMODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        LOGGER.info("InitGenerators gatherData() start");
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new GenRecipe(generator));
        GenBlockTags blockTags = new GenBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new GenItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new GenItemModel(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new GenLanguage(generator, "en_us"));

    }
}
