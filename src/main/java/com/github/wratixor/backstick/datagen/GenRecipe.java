package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
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
        ShapelessRecipeBuilder.shapeless(RegMod.WOODEN_BACKSTICK.get()).requires(Tags.Items.RODS_WOODEN).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.STICK).requires(RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        // other stick
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer);
        // backbreackers
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        // backengravers
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        // backmutators
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        // to netherite
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKBREACKER.get(), RegMod.NETHERITE_BACKBREACKER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKENGRAVER.get(), RegMod.NETHERITE_BACKENGRAVER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKMUTATOR.get(), RegMod.NETHERITE_BACKMUTATOR.get());
        // torcherizing
        ShapedRecipeBuilder.shaped(Blocks.TORCH,   4).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH,   2).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH,  16).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH,  32).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH,  64).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 128).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 512).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH,   4).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH,   2).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH,  16).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH,  32).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH,  64).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 128).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 512).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer);
        // backengraver recipes
        




    }
}
