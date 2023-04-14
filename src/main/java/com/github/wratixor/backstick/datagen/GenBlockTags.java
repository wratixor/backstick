package com.github.wratixor.backstick.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.github.wratixor.backstick.BackStick.BSMODID;

public class GenBlockTags extends BlockTagsProvider {
    public GenBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BSMODID, helper);
    }
    @Override
    protected void addTags() {

    }

}
