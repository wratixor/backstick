package com.github.wratixor.backstick.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import com.github.wratixor.backstick.BackStick;

public class GenBlockTags extends BlockTagsProvider {
    public GenBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BackStick.BSMODID, helper);
    }
    @Override
    protected void addTags() {

    }

}
