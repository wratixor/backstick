package com.github.wratixor.backstick.item;

import com.github.wratixor.backstick.setup.ClientConfig;
import com.github.wratixor.backstick.setup.SetMain;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static java.lang.Math.pow;

@Mod(BSMODID)
public class DurabilityCraftingItem extends TieredItem {
    private static final String UNBREAKING_COUNTER_TAG = "UCT";
    public static final String TOOLTIP = "debug." + BSMODID + ".tooltip";

    public DurabilityCraftingItem(Tier tier, Rarity r) {
        super(tier, new Item.Properties().tab(SetMain.MODE_TAB).rarity(r).setNoRepair().fireResistant());
    }
    public DurabilityCraftingItem(Tier tier, Rarity r, Properties p) {
        super(tier, p.tab(SetMain.MODE_TAB).rarity(r).setNoRepair());
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack)
    {
        return true;
    }
    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack)
    {

        ItemStack result = itemStack.copy();
        int unb_lvl = itemStack.getEnchantmentLevel(Enchantments.UNBREAKING);
        /*
          if unbreacking lvl = 1                       then durability x 1.5
          if unbreacking lvl = MAX unbreacking lvl     then durability x 4
          Пересчёт прочности предмета для крафта матаном, с учётом того,
            что максимальный уровень чар может быть выше ванильного:
          На первом уровне чар прочность х 1.5
          На максимальном уровне чар прочность х 4
          Чем выше уровень чар - тем больше прирост прочности за уровень
         */
        if (unb_lvl > 0) {
            CompoundTag ct = result.getOrCreateTag();
            double unb_count = ct.getDouble(UNBREAKING_COUNTER_TAG);
            double unb_iterator = 0.5d + (pow((unb_lvl - 1.0d), 1.5d) * 2.5d / pow((Enchantments.UNBREAKING.getMaxLevel() - 1.0d), 1.5d));
            if (1 - unb_count > 0 ) {
                result.setDamageValue(itemStack.getDamageValue() + 1);
                unb_count += unb_iterator;
            } else {
                unb_count--;
            }
            ct.putDouble(UNBREAKING_COUNTER_TAG, unb_count);
        } else {
            result.setDamageValue(itemStack.getDamageValue() + 1);
        }
        if (result.getDamageValue() > result.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return result;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag flags) {
        super.appendHoverText(itemStack, level, list, flags);
        if( level != null && level.isClientSide && ClientConfig.ISDEBUG.get()) {
            double unb_count = itemStack.hasTag() ? itemStack.getOrCreateTag().getDouble(UNBREAKING_COUNTER_TAG) : 0;
            list.add(Component.translatable(TOOLTIP,
                    Double.toString(unb_count),
                    Integer.toString(itemStack.getDamageValue()),
                    this.getTier().getRepairIngredient().toJson().toString())
            );
        }
    }
}
