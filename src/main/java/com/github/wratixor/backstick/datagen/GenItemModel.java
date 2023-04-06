package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.github.wratixor.backstick.BackStick.BSMODID;

public class GenItemModel extends ItemModelProvider {

    public GenItemModel(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BSMODID, helper);
    }
    @Override
    protected void registerModels() {
        singleTexture(RegMod.WOODEN_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wooden_backstick"));
        singleTexture(RegMod.STONE_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/stone_backstick"));
        singleTexture(RegMod.COPPER_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_backstick"));
        singleTexture(RegMod.IRON_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_backstick"));
        singleTexture(RegMod.GOLDEN_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_backstick"));
        singleTexture(RegMod.DIAMOND_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_backstick"));
        singleTexture(RegMod.NETHERITE_BACKSTICK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/netherite_backstick"));

        singleTexture(RegMod.WOODEN_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wooden_backbreacker"));
        singleTexture(RegMod.STONE_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/stone_backbreacker"));
        singleTexture(RegMod.COPPER_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_backbreacker"));
        singleTexture(RegMod.IRON_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_backbreacker"));
        singleTexture(RegMod.GOLDEN_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_backbreacker"));
        singleTexture(RegMod.DIAMOND_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_backbreacker"));
        singleTexture(RegMod.NETHERITE_BACKBREACKER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/netherite_backbreacker"));

        singleTexture(RegMod.WOODEN_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wooden_backengraver"));
        singleTexture(RegMod.STONE_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/stone_backengraver"));
        singleTexture(RegMod.COPPER_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_backengraver"));
        singleTexture(RegMod.IRON_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_backengraver"));
        singleTexture(RegMod.GOLDEN_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_backengraver"));
        singleTexture(RegMod.DIAMOND_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_backengraver"));
        singleTexture(RegMod.NETHERITE_BACKENGRAVER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/netherite_backengraver"));

        singleTexture(RegMod.WOODEN_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wooden_backmutator"));
        singleTexture(RegMod.STONE_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/stone_backmutator"));
        singleTexture(RegMod.COPPER_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_backmutator"));
        singleTexture(RegMod.IRON_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iron_backmutator"));
        singleTexture(RegMod.GOLDEN_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/golden_backmutator"));
        singleTexture(RegMod.DIAMOND_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/diamond_backmutator"));
        singleTexture(RegMod.NETHERITE_BACKMUTATOR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/netherite_backmutator"));

    }
}
