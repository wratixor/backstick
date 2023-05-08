package com.github.wratixor.backstick.datagen;

import com.github.wratixor.backstick.setup.RegMod;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.github.wratixor.backstick.BackStick.BSMODID;



public class GenRecipe extends RecipeProvider {
    private static final String GENERATOR_RECIPE_PREFIX = "bs_gen_recipe_";
    private static int iterator = 0;
    private static final RecipeCategory category = RecipeCategory.MISC;
    public GenRecipe(PackOutput packOutput) {
        super(packOutput);
    }

    @Contract(" -> new")
    private @NotNull ResourceLocation genResourceLocation() {
        return new ResourceLocation(BSMODID, GENERATOR_RECIPE_PREFIX + iterator++);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        // wood stick rotate
        ShapelessRecipeBuilder.shapeless(category, RegMod.WOODEN_BACKSTICK.get(), 1).requires(Tags.Items.RODS_WOODEN).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.STICK, 1).requires(RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        // other stick
        ShapedRecipeBuilder.shaped(category, RegMod.STONE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.COPPER_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.IRON_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.GOLDEN_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.DIAMOND_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.NETHERITE_BACKSTICK.get(), 4).pattern("i").pattern("i").define('i', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_stick", has(Tags.Items.RODS_WOODEN)).save(consumer, genResourceLocation());
        // backbreackers
        ShapedRecipeBuilder.shaped(category, RegMod.WOODEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.STONE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.COPPER_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.IRON_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.GOLDEN_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.DIAMOND_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.NETHERITE_BACKBREACKER.get(), 1).pattern(" i").pattern("ii").define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backengravers
        ShapedRecipeBuilder.shaped(category, RegMod.WOODEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.STONE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.COPPER_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.IRON_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.GOLDEN_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.DIAMOND_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.NETHERITE_BACKENGRAVER.get(), 1).pattern("iii").pattern("  i").pattern("sss").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backmutators
        ShapedRecipeBuilder.shaped(category, RegMod.WOODEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.PLANKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.STONE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.STONE_TOOL_MATERIALS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.COPPER_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.COPPER_BACKSTICK.get()).define('s', Tags.Items.INGOTS_COPPER).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.IRON_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.IRON_BACKSTICK.get()).define('s', Tags.Items.INGOTS_IRON).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.GOLDEN_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', Tags.Items.INGOTS_GOLD).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.DIAMOND_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', Tags.Items.GEMS_DIAMOND).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, RegMod.NETHERITE_BACKMUTATOR.get(), 1).pattern(" i ").pattern("isi").pattern(" i ").define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', Tags.Items.INGOTS_NETHERITE).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // to netherite
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKBREACKER.get(), category, RegMod.NETHERITE_BACKBREACKER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKENGRAVER.get(), category, RegMod.NETHERITE_BACKENGRAVER.get());
        netheriteSmithing(consumer, RegMod.DIAMOND_BACKMUTATOR.get(), category, RegMod.NETHERITE_BACKMUTATOR.get());
        // torcherizing
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 4).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 2).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 16).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 32).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 64).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 128).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.TORCH, 512).pattern("c").pattern("i").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 1).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 2).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 4).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 8).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 16).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 32).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.REDSTONE_TORCH, 64).pattern("c").pattern("i").define('c', Tags.Items.DUSTS_REDSTONE).define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 4).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.WOODEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 2).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.STONE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 16).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.COPPER_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 32).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.IRON_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 64).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.GOLDEN_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 128).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.DIAMOND_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.SOUL_TORCH, 512).pattern("c").pattern("i").pattern("s").define('c', ItemTags.COALS).define('i', RegMod.NETHERITE_BACKSTICK.get()).define('s', ItemTags.SOUL_FIRE_BASE_BLOCKS).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // ladderizing
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 3).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.WOODEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 2).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.STONE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 8).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.COPPER_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 16).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.IRON_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 32).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.GOLDEN_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 64).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.DIAMOND_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Blocks.LADDER, 128).pattern("i i").pattern("iii").pattern("i i").define('i', RegMod.NETHERITE_BACKSTICK.get()).group(BSMODID).unlockedBy("has_backstick", has(RegMod.ANY_BACKSTICK)).save(consumer, genResourceLocation());
        // backbreacker recipes
        ShapelessRecipeBuilder.shapeless(category, Items.BRICK, 4).requires(RegMod.ANY_BACKBREACKER).requires(ItemTags.TERRACOTTA).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.BRICK, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.BRICKS).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.GLOWSTONE_DUST, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.GLOWSTONE).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.SAND, 2).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.GRAVEL).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.GRAVEL, 2).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.COBBLESTONE).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.GRAVEL, 3).requires(RegMod.ANY_BACKBREACKER).requires(Tags.Items.STONE).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.CLAY_BALL, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.CLAY).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.MELON_SLICE, 9).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.MELON).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.STRING, 4).requires(RegMod.ANY_BACKBREACKER).requires(ItemTags.WOOL).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.PRISMARINE_SHARD, 4).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.PRISMARINE).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.PRISMARINE_SHARD, 9).requires(RegMod.ANY_BACKBREACKER).requires(Blocks.PRISMARINE_BRICKS).group(BSMODID).unlockedBy("has_backbreacker", has(RegMod.ANY_BACKBREACKER)).save(consumer, genResourceLocation());
        // backengravier recipe
        ShapedRecipeBuilder.shaped(category, Blocks.SKELETON_SKULL, 1).pattern("bbb").pattern("beb").pattern("bbb").define('b', Blocks.BONE_BLOCK).define('e', RegMod.ANY_BACKENGRAVER).group(BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.CHEST, 1).requires(RegMod.ANY_BACKENGRAVER).requires(ItemTags.LOGS).requires(ItemTags.LOGS).group(BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.BARREL, 2).requires(RegMod.ANY_BACKENGRAVER).requires(ItemTags.LOGS).requires(ItemTags.LOGS).requires(ItemTags.LOGS).group(BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, RegMod.RANDOM_ENCHANTED_BOOK.get(), 1).requires(RegMod.ANY_BACKENGRAVER).requires(Tags.Items.GEMS_LAPIS).requires(Tags.Items.GEMS_LAPIS).requires(Items.WRITABLE_BOOK).group(BSMODID).unlockedBy("has_backengraver", has(RegMod.ANY_BACKENGRAVER)).save(consumer, genResourceLocation());

        // backmutator recipe
        ShapelessRecipeBuilder.shapeless(category, Blocks.TERRACOTTA, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.TERRACOTTA).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.WHITE_WOOL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.WOOL).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.WHITE_BED, 1).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.BEDS).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.MELON, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.PUMPKIN).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.PUMPKIN, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.MELON).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.FLINT, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.GRAVEL).requires(Tags.Items.GRAVEL).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Items.FLINT, 6).pattern("bbb").pattern("bmb").pattern("bbb").define('b', Tags.Items.GRAVEL).define('m', RegMod.ANY_BACKMUTATOR).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.LEATHER, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Items.ROTTEN_FLESH).requires(Items.ROTTEN_FLESH).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Items.LEATHER, 6).pattern("bbb").pattern("bmb").pattern("bbb").define('b', Items.ROTTEN_FLESH).define('m', RegMod.ANY_BACKMUTATOR).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapedRecipeBuilder.shaped(category, Items.EXPERIENCE_BOTTLE, 2).pattern("dbd").pattern("ama").pattern("ebe").define('b', Items.GLASS_BOTTLE).define('d', Tags.Items.GEMS_DIAMOND).define('a', Tags.Items.GEMS_AMETHYST).define('e', Tags.Items.GEMS_EMERALD).define('m', RegMod.ANY_BACKMUTATOR).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.GHAST_TEAR, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.NUGGETS_IRON).requires(Tags.Items.GUNPOWDER).requires(Tags.Items.FEATHERS).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Items.SLIME_BALL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Items.GREEN_DYE).requires(Items.BONE_MEAL).requires(Items.EGG).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.CLAY, 3).requires(RegMod.ANY_BACKMUTATOR).requires(ItemTags.DIRT).requires(ItemTags.SAND).requires(Tags.Items.GRAVEL).group(BSMODID).unlockedBy("has_backmutator", has(RegMod.ANY_BACKMUTATOR)).save(consumer, genResourceLocation());
        // heads
        ShapelessRecipeBuilder.shapeless(category, Blocks.SKELETON_SKULL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Tags.Items.BONES).requires(Tags.Items.BONES).group(BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.ZOMBIE_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Items.ROTTEN_FLESH).requires(Items.ROTTEN_FLESH).group(BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.CREEPER_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Tags.Items.GUNPOWDER).requires(Tags.Items.GUNPOWDER).group(BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.WITHER_SKELETON_SKULL, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Tags.Items.HEADS).requires(Items.WITHER_ROSE).requires(Items.WITHER_ROSE).group(BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());
        ShapelessRecipeBuilder.shapeless(category, Blocks.DRAGON_HEAD, 1).requires(RegMod.ANY_BACKMUTATOR).requires(Blocks.SKELETON_SKULL).requires(Blocks.ZOMBIE_HEAD).requires(Blocks.CREEPER_HEAD).requires(Blocks.WITHER_SKELETON_SKULL).group(BSMODID).unlockedBy("has_head", has(Tags.Items.HEADS)).save(consumer, genResourceLocation());


        LOGGER.info("Generate recipe finish ({})", iterator);

    }
}
