package com.github.wratixor.backstick.datagen;


import com.github.wratixor.backstick.item.DurabilityCraftingItem;
import com.github.wratixor.backstick.item.RandomEnchantedBook;
import com.github.wratixor.backstick.setup.RegMod;
import com.github.wratixor.backstick.setup.SetMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import com.github.wratixor.backstick.BackStick;



public class GenLanguage extends LanguageProvider {
    public GenLanguage(DataGenerator generator, String locale) {
        super(generator, BackStick.BSMODID, locale);
    }
    @Override
    protected void addTranslations() {
        add("itemGroup." + SetMain.TAB_NAME, "BackStick");
        add(DurabilityCraftingItem.TOOLTIP, "Debug: { %s | %s | %s }");

        add(RandomEnchantedBook.ENCHANTMENT_FAILED, "Book Enchantment Failed! You have no LVL!");
        add(RandomEnchantedBook.RANDOM_ENCHANTMENTS, "Book randomly enchanted! LVL %s, cost %s!");
        add(RandomEnchantedBook.MINI_RANDOM_ENCHANTMENTS, "Book slightly enchanted randomly! LVL %s, cost 1!");
        add(RandomEnchantedBook.COPY_ENCHANTMENTS, "Book is enchanted with copying! Cost %s!");
        add(RandomEnchantedBook.COPY_ENCHANTMENTS_FAILED, "Copy Enchantment Failed! You LVL %s, but cost %s!");

        add(RegMod.WOODEN_BACKSTICK.get(), "Wooden BackStick");
        add(RegMod.STONE_BACKSTICK.get(), "Stone BackStick");
        add(RegMod.COPPER_BACKSTICK.get(), "Copper BackStick");
        add(RegMod.IRON_BACKSTICK.get(), "Iron BackStick");
        add(RegMod.GOLDEN_BACKSTICK.get(), "Golden BackStick");
        add(RegMod.DIAMOND_BACKSTICK.get(), "Diamond BackStick");
        add(RegMod.NETHERITE_BACKSTICK.get(), "Netherite BackStick");

        add(RegMod.WOODEN_BACKBREACKER.get(), "Wooden BackBreacker");
        add(RegMod.STONE_BACKBREACKER.get(), "Stone BackBreacker");
        add(RegMod.COPPER_BACKBREACKER.get(), "Copper BackBreacker");
        add(RegMod.IRON_BACKBREACKER.get(), "Iron BackBreacker");
        add(RegMod.GOLDEN_BACKBREACKER.get(), "Golden BackBreacker");
        add(RegMod.DIAMOND_BACKBREACKER.get(), "Diamond BackBreacker");
        add(RegMod.NETHERITE_BACKBREACKER.get(), "Netherite BackBreacker");

        add(RegMod.WOODEN_BACKENGRAVER.get(), "Wooden BackEngraver");
        add(RegMod.STONE_BACKENGRAVER.get(), "Stone BackEngraver");
        add(RegMod.COPPER_BACKENGRAVER.get(), "Copper BackEngraver");
        add(RegMod.IRON_BACKENGRAVER.get(), "Iron BackEngraver");
        add(RegMod.GOLDEN_BACKENGRAVER.get(), "Golden BackEngraver");
        add(RegMod.DIAMOND_BACKENGRAVER.get(), "Diamond BackEngraver");
        add(RegMod.NETHERITE_BACKENGRAVER.get(), "Netherite BackEngraver");

        add(RegMod.WOODEN_BACKMUTATOR.get(), "Wooden BackMutator");
        add(RegMod.STONE_BACKMUTATOR.get(), "Stone BackMutator");
        add(RegMod.COPPER_BACKMUTATOR.get(), "Copper BackMutator");
        add(RegMod.IRON_BACKMUTATOR.get(), "Iron BackMutator");
        add(RegMod.GOLDEN_BACKMUTATOR.get(), "Golden BackMutator");
        add(RegMod.DIAMOND_BACKMUTATOR.get(), "Diamond BackMutator");
        add(RegMod.NETHERITE_BACKMUTATOR.get(), "Netherite BackMutator");

        add(RegMod.RANDOM_ENCHANTED_BOOK.get(), "Random Enchanted Book");

    }
}
