package com.github.wratixor.backstick.setup;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.github.wratixor.backstick.BackStick.BSMODID;

@Mod.EventBusSubscriber(modid = BSMODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegModTabs {
    @SubscribeEvent
    public void buildTabs(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(BSMODID, "all"), builder ->
                builder.title(Component.translatable("itemGroup." + BSMODID + ".all"))
                       .icon(() -> new ItemStack(RegMod.WOODEN_BACKSTICK.get()))
                       .displayItems((parameters, output) -> {
                            output.accept(RegMod.WOODEN_BACKSTICK.get());
                            output.accept(RegMod.STONE_BACKSTICK.get());
                            output.accept(RegMod.COPPER_BACKSTICK.get());
                            output.accept(RegMod.IRON_BACKSTICK.get());
                            output.accept(RegMod.GOLDEN_BACKSTICK.get());
                            output.accept(RegMod.DIAMOND_BACKSTICK.get());
                            output.accept(RegMod.NETHERITE_BACKSTICK.get());
                            output.accept(RegMod.WOODEN_BACKBREACKER.get());
                            output.accept(RegMod.STONE_BACKBREACKER.get());
                            output.accept(RegMod.COPPER_BACKBREACKER.get());
                            output.accept(RegMod.IRON_BACKBREACKER.get());
                            output.accept(RegMod.GOLDEN_BACKBREACKER.get());
                            output.accept(RegMod.DIAMOND_BACKBREACKER.get());
                            output.accept(RegMod.NETHERITE_BACKBREACKER.get());
                            output.accept(RegMod.WOODEN_BACKENGRAVER.get());
                            output.accept(RegMod.STONE_BACKENGRAVER.get());
                            output.accept(RegMod.COPPER_BACKENGRAVER.get());
                            output.accept(RegMod.IRON_BACKENGRAVER.get());
                            output.accept(RegMod.GOLDEN_BACKENGRAVER.get());
                            output.accept(RegMod.DIAMOND_BACKENGRAVER.get());
                            output.accept(RegMod.NETHERITE_BACKENGRAVER.get());
                            output.accept(RegMod.WOODEN_BACKMUTATOR.get());
                            output.accept(RegMod.STONE_BACKMUTATOR.get());
                            output.accept(RegMod.COPPER_BACKMUTATOR.get());
                            output.accept(RegMod.IRON_BACKMUTATOR.get());
                            output.accept(RegMod.GOLDEN_BACKMUTATOR.get());
                            output.accept(RegMod.DIAMOND_BACKMUTATOR.get());
                            output.accept(RegMod.NETHERITE_BACKMUTATOR.get());
                            output.accept(RegMod.RANDOM_ENCHANTED_BOOK.get());
                        })
        );
    }

}
