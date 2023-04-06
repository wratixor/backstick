package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.github.wratixor.backstick.BackStick.BSMODID;


public class GenRecipe extends RecipeProvider {
    public GenRecipe(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        // wood stick rotate
        ShapelessRecipeBuilder.shapeless(RegMod.WOODEN_BACKSTICK.get())
                .requires(Tags.Items.RODS_WOODEN)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.STICK)
                .requires(RegMod.WOODEN_BACKSTICK.get())
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        // other stick
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', ItemTags.STONE_TOOL_MATERIALS)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', Tags.Items.INGOTS_COPPER)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', Tags.Items.INGOTS_IRON)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', Tags.Items.INGOTS_GOLD)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', Tags.Items.GEMS_DIAMOND)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKSTICK.get(), 4)
                .pattern("i")
                .pattern("i")
                .define('i', Tags.Items.INGOTS_NETHERITE)
                .group(BSMODID)
                .unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN))
                .save(consumer);


    }
}
