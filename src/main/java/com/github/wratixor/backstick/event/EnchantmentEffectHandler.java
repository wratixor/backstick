package com.github.wratixor.backstick.event;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnchantmentEffectHandler {

    @SubscribeEvent
    public static void takeAll(TickEvent.PlayerTickEvent event){
        if (event.phase == TickEvent.Phase.END || event.player.level.isClientSide()) return;

        int nv_lvl = EnchantmentHelper.getEnchantmentLevel(RegMod.NIGHT_VISION.get(), event.player);
        int sp_lvl = EnchantmentHelper.getEnchantmentLevel(RegMod.SPEED.get(), event.player);
        int st_lvl = EnchantmentHelper.getEnchantmentLevel(RegMod.STRENGTH.get(), event.player);
        int jb_lvl = EnchantmentHelper.getEnchantmentLevel(RegMod.JUMP_BOOST.get(), event.player);

        if (nv_lvl > 0 ) {event.player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 230, nv_lvl - 1, false, false));}
        if (sp_lvl > 0 ) {event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 70, sp_lvl - 1, false, false));}
        if (st_lvl > 0 ) {event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 70, sp_lvl - 1, false, false));}
        if (jb_lvl > 0 ) {event.player.addEffect(new MobEffectInstance(MobEffects.JUMP, 70, sp_lvl - 1, false, false));}
    }

}
