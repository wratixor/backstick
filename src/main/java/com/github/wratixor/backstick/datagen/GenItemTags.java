package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.github.wratixor.backstick.BackStick.BSMODID;


public class GenItemTags extends ItemTagsProvider {
    public GenItemTags(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper helper) {
        super(generator, provider, BSMODID, helper);
    }
    @Override
    protected void addTags() {
        tag(RegMod.ANY_BACKSTICK).replace(false)
                .add(RegMod.WOODEN_BACKSTICK.get())
                .add(RegMod.STONE_BACKSTICK.get())
                .add(RegMod.COPPER_BACKSTICK.get())
                .add(RegMod.IRON_BACKSTICK.get())
                .add(RegMod.GOLDEN_BACKSTICK.get())
                .add(RegMod.DIAMOND_BACKSTICK.get())
                .add(RegMod.NETHERITE_BACKSTICK.get())
        ;
        tag(RegMod.ANY_BACKBREACKER).replace(false)
                .add(RegMod.WOODEN_BACKBREACKER.get())
                .add(RegMod.STONE_BACKBREACKER.get())
                .add(RegMod.COPPER_BACKBREACKER.get())
                .add(RegMod.IRON_BACKBREACKER.get())
                .add(RegMod.GOLDEN_BACKBREACKER.get())
                .add(RegMod.DIAMOND_BACKBREACKER.get())
                .add(RegMod.NETHERITE_BACKBREACKER.get())
        ;
        tag(RegMod.ANY_BACKENGRAVER).replace(false)
                .add(RegMod.WOODEN_BACKENGRAVER.get())
                .add(RegMod.STONE_BACKENGRAVER.get())
                .add(RegMod.COPPER_BACKENGRAVER.get())
                .add(RegMod.IRON_BACKENGRAVER.get())
                .add(RegMod.GOLDEN_BACKENGRAVER.get())
                .add(RegMod.DIAMOND_BACKENGRAVER.get())
                .add(RegMod.NETHERITE_BACKENGRAVER.get())
        ;
        tag(RegMod.ANY_BACKMUTATOR).replace(false)
                .add(RegMod.WOODEN_BACKMUTATOR.get())
                .add(RegMod.STONE_BACKMUTATOR.get())
                .add(RegMod.COPPER_BACKMUTATOR.get())
                .add(RegMod.IRON_BACKMUTATOR.get())
                .add(RegMod.GOLDEN_BACKMUTATOR.get())
                .add(RegMod.DIAMOND_BACKMUTATOR.get())
                .add(RegMod.NETHERITE_BACKMUTATOR.get())
        ;

        tag(ItemTags.create(new ResourceLocation("forge:books"))).replace(false)
                .add(RegMod.RANDOM_ENCHANTED_BOOK.get())
        ;

    }

}
