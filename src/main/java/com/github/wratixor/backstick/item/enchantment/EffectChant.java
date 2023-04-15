package com.github.wratixor.backstick.item.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EffectChant extends Enchantment {
    private final int max_lvl;

    public EffectChant(int max_lvl, EnchantmentCategory category, EquipmentSlot... slot) {
        super(Rarity.VERY_RARE, category, slot);
        this.max_lvl = max_lvl;
    }

    public int getMinCost(int p) {
        return p * 15;
    }

    public int getMaxCost(int p) {
        return this.getMinCost(p) + 50;
    }

    public int getMaxLevel() {
        return max_lvl;
    }



}
