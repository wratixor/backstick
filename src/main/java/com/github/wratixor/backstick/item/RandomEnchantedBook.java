package com.github.wratixor.backstick.item;

import com.github.wratixor.backstick.setup.SetMain;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class RandomEnchantedBook extends EnchantedBookItem {
    public RandomEnchantedBook() {
        super(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(1).rarity(Rarity.EPIC));
    }


}
