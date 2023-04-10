package com.github.wratixor.backstick.item;

import com.github.wratixor.backstick.setup.RegMod;
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

import com.github.wratixor.backstick.BackStick;


public class RandomEnchantedBook extends Item {

    public static final String COPY_ENCHANTMENTS = "message." + BackStick.BSMODID + ".copy_enchantments";
    public static final String COPY_ENCHANTMENTS_FAILED = "message." + BackStick.BSMODID + ".copy_enchantments_failed";
    public static final String RANDOM_ENCHANTMENTS = "message." + BackStick.BSMODID + ".random_enchantments";
    public static final String MINI_RANDOM_ENCHANTMENTS = "message." + BackStick.BSMODID + ".mini_random_enchantments";
    public static final String ENCHANTMENT_FAILED = "message." + BackStick.BSMODID + ".enchantment_failed";


    public RandomEnchantedBook(int i) {
        super(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(i).rarity(Rarity.EPIC));
    }

    @Override
    public boolean isFoil(@NotNull ItemStack itemStack) {
        return true;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        ItemStack result = new ItemStack(Items.BOOK);

        if (player.experienceLevel >= 1) {

            if (hand == InteractionHand.MAIN_HAND) {

                boolean has_offhand = player.hasItemInSlot(EquipmentSlot.OFFHAND);
                boolean offhand_encanted_book = false;
                boolean offhand_enchanted = false;
                ItemStack off_hand_item = null;
                if (has_offhand) {
                    off_hand_item = player.getItemBySlot(EquipmentSlot.OFFHAND);
                    offhand_encanted_book = off_hand_item.is(Items.ENCHANTED_BOOK);
                    offhand_enchanted = off_hand_item.isEnchanted();

                }
                if (offhand_enchanted || offhand_encanted_book) {

                    result = new ItemStack(Items.ENCHANTED_BOOK);
                    int lvl_cost = 0;
                    Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(off_hand_item);

                    for (Map.Entry<Enchantment, Integer> entry : enchantments.entrySet()) {
                        lvl_cost += entry.getValue();

                    }

                    if (player.experienceLevel >= lvl_cost) {
                        EnchantmentHelper.setEnchantments(enchantments, result);
                        player.giveExperienceLevels(-lvl_cost);
                        if (level.isClientSide) {
                            player.sendSystemMessage(Component.translatable(COPY_ENCHANTMENTS, Integer.toString(lvl_cost)).withStyle(ChatFormatting.ITALIC));
                        }
                    } else if (level.isClientSide) {
                        result = new ItemStack(RegMod.RANDOM_ENCHANTED_BOOK.get());
                        player.sendSystemMessage(Component.translatable(COPY_ENCHANTMENTS_FAILED, Integer.toString(player.experienceLevel), Integer.toString(lvl_cost)).withStyle(ChatFormatting.ITALIC));
                    }
                    // copy enchant end if
                } else {

                    int clamp_lvl = Mth.clamp(player.experienceLevel, 1, 64);
                    int lvl_cost = Mth.clamp(clamp_lvl / 10, 1, 6);
                    result = EnchantmentHelper.enchantItem(player.getRandom(), result, clamp_lvl, true);
                    player.giveExperienceLevels(-lvl_cost);
                    if (level.isClientSide) {
                        player.sendSystemMessage(Component.translatable(RANDOM_ENCHANTMENTS, Integer.toString(clamp_lvl), Integer.toString(lvl_cost)).withStyle(ChatFormatting.ITALIC));
                    }
                } // mainhand end if
            } else {

                int clamp_lvl = Mth.clamp(player.experienceLevel, 1, 10);
                result = EnchantmentHelper.enchantItem(player.getRandom(), result, clamp_lvl, true);
                player.giveExperienceLevels(-1);
                if (level.isClientSide) {
                    player.sendSystemMessage(Component.translatable(MINI_RANDOM_ENCHANTMENTS, Integer.toString(clamp_lvl)).withStyle(ChatFormatting.ITALIC));
                } // offhand end if
            } // lvl > 0 end if
        } else {
            result = new ItemStack(RegMod.RANDOM_ENCHANTED_BOOK.get());
            if (level.isClientSide) {
                player.sendSystemMessage(Component.translatable(ENCHANTMENT_FAILED).withStyle(ChatFormatting.ITALIC));
            }
        }


        return InteractionResultHolder.success(result);
    }
}
