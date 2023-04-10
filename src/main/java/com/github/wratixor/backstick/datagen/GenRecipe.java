package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import com.github.wratixor.backstick.BackStick;



public class GenRecipe extends RecipeProvider {
    private static final String GENERATOR_RECIPE_PREFIX = "bs_gen_recipe_";
    private static int iterator = 0;
    public GenRecipe(DataGenerator generator) {
        super(generator);
    }

    @Contract(" -> new")
    private @NotNull ResourceLocation genResourceLocation() {
        return new ResourceLocation(BackStick.BSMODID, GENERATOR_RECIPE_PREFIX + iterator++);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        // wood stick rotate
        ShapelessRecipeBuilder.shapeless(RegMod.WOODEN_BACKSTICK.get(), 1).requires(Tags.Items.RODS_WOODEN).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.STICK, 1).requires(RegMod.WOODEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        // other stick
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', ItemTags.STONE_TOOL_MATERIALS).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_COPPER).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_IRON).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_GOLD).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.GEMS_DIAMOND).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_NETHERITE).group(BackStick.BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        // backbreackers
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.WOODEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.STONE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.COPPER_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.IRON_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backengravers
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backmutators
        ShapedRecipeBuilder.shaped(RegMod.WOODEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.STONE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.COPPER_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.IRON_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.GOLDEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.DIAMOND_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.NETHERITE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // to netherite
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKBREACKER.get(), RegMod.NETHERITE_BACKBREACKER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKENGRAVER.get(), RegMod.NETHERITE_BACKENGRAVER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKMUTATOR.get(), RegMod.NETHERITE_BACKMUTATOR.get());
        // torcherizing
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 4).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 2).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 16).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 32).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 64).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 128).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.TORCH, 512).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 1).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.WOODEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 2).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.STONE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 4).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.COPPER_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 8).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.IRON_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 16).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 32).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_TORCH, 64).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 4).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 2).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 16).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 32).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 64).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 128).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.SOUL_TORCH, 512).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // ladderizing
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 3).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.WOODEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 2).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.STONE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 8).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.COPPER_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 16).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.IRON_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 32).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 64).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Blocks.LADDER, 128).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BackStick.BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backbreacker recipes
        ShapelessRecipeBuilder.shapeless(Items.BRICK, 4).requires(RegMod.ANY_BACKBREACKER).requires(ItemTags.TERRACOTTA).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.BRICK, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.BRICKS).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.GLOWSTONE_DUST, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.GLOWSTONE).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.SAND, 2).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.GRAVEL).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.GRAVEL, 2).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.COBBLESTONE).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.GRAVEL, 3).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.STONE).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.CLAY_BALL, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.CLAY).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.MELON_SLICE, 9).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.MELON).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.STRING, 4).requires(RegMod.ANY_BACKBREACKER).requires(ItemTags.WOOL).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.PRISMARINE_SHARD, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.PRISMARINE).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.PRISMARINE_SHARD, 9).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.PRISMARINE_BRICKS).group(BackStick.BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        // backengravier recipe
        ShapedRecipeBuilder.shaped(Blocks.SKELETON_SKULL, 1).pattern("bbb").pattern("beb").pattern("bbb").define('b', Blocks.BONE_BLOCK).define('e', RegMod.ANY_BACKENGRAVER).group(BackStick.BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.CHEST, 1).requires(RegMod.ANY_BACKENGRAVER).requires(ItemTags.LOGS).requires(ItemTags.LOGS).group(BackStick.BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.BARREL, 2).requires(RegMod.ANY_BACKENGRAVER).requires(ItemTags.LOGS).requires(ItemTags.LOGS).requires(ItemTags.LOGS).group(BackStick.BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(RegMod.RANDOM_ENCHANTED_BOOK.get(), 1).pattern("xxx").pattern("ebl").pattern("xxx").define('x', Items.EXPERIENCE_BOTTLE).define('l', Tags.Items.GEMS_LAPIS).define('b', Items.WRITABLE_BOOK).define('e', RegMod.ANY_BACKENGRAVER).group(BackStick.BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());

        // backmutator recipe
        ShapelessRecipeBuilder.shapeless(Blocks.TERRACOTTA, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.TERRACOTTA).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.WHITE_WOOL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.WOOL).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.WHITE_BED, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.BEDS).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.MELON, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.PUMPKIN).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.PUMPKIN, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.MELON).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.FLINT, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.GRAVEL).requires(Tags.Items.GRAVEL).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Items.FLINT, 6).pattern("bbb").pattern("bmb").pattern("bbb").define('b', Tags.Items.GRAVEL).define('m', RegMod.ANY_BACKMUTATOR).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.LEATHER, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Items.ROTTEN_FLESH).requires(Items.ROTTEN_FLESH).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Items.LEATHER, 6).pattern("bbb").pattern("bmb").pattern("bbb").define('b', Items.ROTTEN_FLESH).define('m', RegMod.ANY_BACKMUTATOR).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(Items.EXPERIENCE_BOTTLE, 2).pattern("dbd").pattern("ama").pattern("ebe").define('b', Items.GLASS_BOTTLE).define('d', Tags.Items.GEMS_DIAMOND).define('a', Tags.Items.GEMS_AMETHYST).define('e', Tags.Items.GEMS_EMERALD).define('m', RegMod.ANY_BACKMUTATOR).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.GHAST_TEAR, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.NUGGETS_IRON).requires(Tags.Items.GUNPOWDER).requires(Tags.Items.FEATHERS).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Items.SLIME_BALL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Items.GREEN_DYE).requires(Items.BONE_MEAL).requires(Items.EGG).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.CLAY, 3).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.DIRT).requires(ItemTags.SAND).requires(Tags.Items.GRAVEL).group(BackStick.BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        // heads
        ShapelessRecipeBuilder.shapeless(Blocks.SKELETON_SKULL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Tags.Items.BONES).requires(Tags.Items.BONES).group(BackStick.BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.ZOMBIE_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Items.ROTTEN_FLESH).requires(Items.ROTTEN_FLESH).group(BackStick.BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.CREEPER_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Tags.Items.GUNPOWDER).requires(Tags.Items.GUNPOWDER).group(BackStick.BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.WITHER_SKELETON_SKULL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Items.WITHER_ROSE).requires(Items.WITHER_ROSE).group(BackStick.BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(Blocks.DRAGON_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.SKELETON_SKULL).requires(Blocks.ZOMBIE_HEAD).requires(Blocks.CREEPER_HEAD).requires(Blocks.WITHER_SKELETON_SKULL).group(BackStick.BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());


        BackStick.LOGGER.info("Generate recipe finish ({})", iterator);

    }
}
