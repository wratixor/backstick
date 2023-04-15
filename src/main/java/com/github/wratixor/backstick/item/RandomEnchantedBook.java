package com.github.wratixor.backstick.item;


import com.github.wratixor.backstick.setup.RegMod;
import com.github.wratixor.backstick.setup.ServerConfig;
import com.github.wratixor.backstick.setup.SetMain;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;


public class RandomEnchantedBook extends Item {

    public static final String COPY_ENCHANTMENTS = "message." + BSMODID + ".copy_enchantments";
    public static final String COPY_ENCHANTMENTS_FAILED = "message." + BSMODID + ".copy_enchantments_failed";
    public static final String RANDOM_ENCHANTMENTS = "message." + BSMODID + ".random_enchantments";
    public static final String ENCHANTMENT_FAILED = "message." + BSMODID + ".enchantment_failed";


    public RandomEnchantedBook() {
        super(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(1).rarity(Rarity.EPIC));
    }

    @Override
    public boolean isFoil(@NotNull ItemStack itemStack) {
        return true;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        ItemStack result = new ItemStack(RegMod.RANDOM_ENCHANTED_BOOK.get());
        if (level.isClientSide) { return InteractionResultHolder.success(result); }
        if (player.experienceLevel >= ServerConfig.REB_MIN_LVL.get()) {

            Map<Enchantment, Integer> enchantments;
            int lvl_cost;
            int clamp_lvl;
            ItemStack try_chant_item = new ItemStack(Items.BOOK);
            ItemStack off_hand_item = null;
            boolean offhand_encanted_book = false;
            boolean offhand_enchanted = false;

            if (hand == InteractionHand.MAIN_HAND) {
                boolean offhand_enchantable = false;
                clamp_lvl = Mth.clamp(player.experienceLevel, 1, ServerConfig.REB_MAX_RANDOM_LEVEL.get());
                if (player.hasItemInSlot(EquipmentSlot.OFFHAND)) {
                    off_hand_item = player.getItemBySlot(EquipmentSlot.OFFHAND);
                    offhand_encanted_book = off_hand_item.is(Items.ENCHANTED_BOOK);
                    offhand_enchanted = off_hand_item.isEnchanted();
                    offhand_enchantable = off_hand_item.isEnchantable();
                }
                if (offhand_enchantable) {
                    try_chant_item = off_hand_item.copy();
                }
            } else {
                clamp_lvl = Mth.clamp(player.experienceLevel, 1, ServerConfig.REB_OFFHAND_RANDOM_LEVEL.get());
            }

            if (offhand_enchanted || offhand_encanted_book) {
                enchantments = EnchantmentHelper.getEnchantments(off_hand_item);
            } else {
                player.sendSystemMessage(Component.translatable(RANDOM_ENCHANTMENTS, Integer.toString(clamp_lvl)).withStyle(ChatFormatting.ITALIC));
                enchantments = EnchantmentHelper.getEnchantments(EnchantmentHelper.enchantItem(player.getRandom(), try_chant_item, clamp_lvl, ServerConfig.REB_TREASURE_RANDOM_POSSIBLE.get()));
            }

            lvl_cost = calculateCost(enchantments);
            if (player.experienceLevel >= lvl_cost) {
                result = new ItemStack(Items.ENCHANTED_BOOK);
                EnchantmentHelper.setEnchantments(enchantments, result);
                player.giveExperienceLevels(-lvl_cost);
                player.sendSystemMessage(Component.translatable(COPY_ENCHANTMENTS, Integer.toString(lvl_cost)).withStyle(ChatFormatting.ITALIC));
            } else {
                player.sendSystemMessage(Component.translatable(COPY_ENCHANTMENTS_FAILED, Integer.toString(player.experienceLevel), Integer.toString(lvl_cost)).withStyle(ChatFormatting.ITALIC));
            }
        } else { // lvl = 0
                player.sendSystemMessage(Component.translatable(ENCHANTMENT_FAILED, Integer.toString(ServerConfig.REB_MIN_LVL.get())).withStyle(ChatFormatting.ITALIC));
        }
        return InteractionResultHolder.success(result);
    }

    private int calculateCost (Map < Enchantment, Integer > enchantments){
        int lvl_cost = 0;
        LOGGER.debug("Calculate size: {}", enchantments.size());
        for (Map.Entry<Enchantment, Integer> entry : enchantments.entrySet()) {
            lvl_cost += entry.getValue();
            LOGGER.debug("COST: {}, VALUE: {}, ENCHANT: {}", lvl_cost, entry.getValue(), entry.getKey().getDescriptionId());
            if (entry.getKey().isTreasureOnly()) {
                lvl_cost++;
                LOGGER.debug("TREASURE COST: {}", lvl_cost);
            }
            switch (entry.getKey().getRarity()) {
                case VERY_RARE:
                    lvl_cost++;
                    LOGGER.debug("SW VERY RARE COST: {}", lvl_cost);
                case RARE:
                    lvl_cost++;
                    LOGGER.debug("SW RARE COST: {}", lvl_cost);
                case UNCOMMON:
                    lvl_cost++;
                    LOGGER.debug("SW UNCOMMON COST: {}", lvl_cost);
            }
        }
        LOGGER.debug("TOTAL COST: {}", lvl_cost);
        return lvl_cost;
    }
}
