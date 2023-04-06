package com.github.wratixor.backstick.datagen;


import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.item.DurabilityCraftingItem.TOOLTIP;
import static com.github.wratixor.backstick.setup.SetMain.TAB_NAME;


public class GenLanguage extends LanguageProvider {
    public GenLanguage(DataGenerator generator, String locale) {
        super(generator, BSMODID, locale);
    }
    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "BackStick");
        add(TOOLTIP, "Debug: { %s | %s | %s }");

        add(RegMod.WOODEN_BACKSTICK.get(), "Wooden backstick");
        add(RegMod.STONE_BACKSTICK.get(), "Stone backstick");
        add(RegMod.COPPER_BACKSTICK.get(), "Copper backstick");
        add(RegMod.IRON_BACKSTICK.get(), "Iron backstick");
        add(RegMod.GOLDEN_BACKSTICK.get(), "Golden backstick");
        add(RegMod.DIAMOND_BACKSTICK.get(), "Diamond backstick");
        add(RegMod.NETHERITE_BACKSTICK.get(), "Netherite backstick");

        add(RegMod.WOODEN_BACKBREACKER.get(), "Wooden backbreacker");
        add(RegMod.STONE_BACKBREACKER.get(), "Stone backbreacker");
        add(RegMod.COPPER_BACKBREACKER.get(), "Copper backbreacker");
        add(RegMod.IRON_BACKBREACKER.get(), "Iron backbreacker");
        add(RegMod.GOLDEN_BACKBREACKER.get(), "Golden backbreacker");
        add(RegMod.DIAMOND_BACKBREACKER.get(), "Diamond backbreacker");
        add(RegMod.NETHERITE_BACKBREACKER.get(), "Netherite backbreacker");

        add(RegMod.WOODEN_BACKENGRAVER.get(), "Wooden backengraver");
        add(RegMod.STONE_BACKENGRAVER.get(), "Stone backengraver");
        add(RegMod.COPPER_BACKENGRAVER.get(), "Copper backengraver");
        add(RegMod.IRON_BACKENGRAVER.get(), "Iron backengraver");
        add(RegMod.GOLDEN_BACKENGRAVER.get(), "Golden backengraver");
        add(RegMod.DIAMOND_BACKENGRAVER.get(), "Diamond backengraver");
        add(RegMod.NETHERITE_BACKENGRAVER.get(), "Netherite backengraver");

        add(RegMod.WOODEN_BACKMUTATOR.get(), "Wooden backmutator");
        add(RegMod.STONE_BACKMUTATOR.get(), "Stone backmutator");
        add(RegMod.COPPER_BACKMUTATOR.get(), "Copper backmutator");
        add(RegMod.IRON_BACKMUTATOR.get(), "Iron backmutator");
        add(RegMod.GOLDEN_BACKMUTATOR.get(), "Golden backmutator");
        add(RegMod.DIAMOND_BACKMUTATOR.get(), "Diamond backmutator");
        add(RegMod.NETHERITE_BACKMUTATOR.get(), "Netherite backmutator");

    }
}
