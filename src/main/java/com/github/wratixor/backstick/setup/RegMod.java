package com.github.wratixor.backstick.setup;

import com.github.wratixor.backstick.item.DurabilityCraftingItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.github.wratixor.backstick.BackStick.BSMODID;
import static com.github.wratixor.backstick.BackStick.LOGGER;

@Mod(BSMODID)
public class RegMod {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BSMODID);
    public static void init() {
        LOGGER.info("RegMod init() start");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 192, 5.0F, 1.5F, 17, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(BSMODID + ":tier_copper"),
            List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final TagKey<Item> ANY_BACKSTICK = ItemTags.create(new ResourceLocation(BSMODID + ":backstick"));
    public static final TagKey<Item> ANY_BACKBREACKER = ItemTags.create(new ResourceLocation(BSMODID + ":backbreacker"));
    public static final TagKey<Item> ANY_BACKENGRAVER = ItemTags.create(new ResourceLocation(BSMODID + ":backengraver"));
    public static final TagKey<Item> ANY_BACKMUTATOR = ItemTags.create(new ResourceLocation(BSMODID + ":backmutator"));

    public static final RegistryObject<Item> WOODEN_BACKSTICK = ITEMS.register("wooden_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> STONE_BACKSTICK = ITEMS.register("stone_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.COMMON).fireResistant()));
    public static final RegistryObject<Item> COPPER_BACKSTICK = ITEMS.register("copper_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final RegistryObject<Item> IRON_BACKSTICK = ITEMS.register("iron_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final RegistryObject<Item> GOLDEN_BACKSTICK = ITEMS.register("golden_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.UNCOMMON).fireResistant()));
    public static final RegistryObject<Item> DIAMOND_BACKSTICK = ITEMS.register("diamond_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> NETHERITE_BACKSTICK = ITEMS.register("netherite_backstick", () -> new Item(new Item.Properties().tab(SetMain.MODE_TAB).stacksTo(64).rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> WOODEN_BACKBREACKER = ITEMS.register("wooden_backbreacker", () -> new DurabilityCraftingItem(Tiers.WOOD, Rarity.COMMON, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BACKBREACKER = ITEMS.register("stone_backbreacker", () -> new DurabilityCraftingItem(Tiers.STONE, Rarity.COMMON));
    public static final RegistryObject<Item> COPPER_BACKBREACKER = ITEMS.register("copper_backbreacker", () -> new DurabilityCraftingItem(COPPER, Rarity.UNCOMMON));
    public static final RegistryObject<Item> IRON_BACKBREACKER = ITEMS.register("iron_backbreacker", () -> new DurabilityCraftingItem(Tiers.IRON, Rarity.UNCOMMON));
    public static final RegistryObject<Item> GOLDEN_BACKBREACKER = ITEMS.register("golden_backbreacker", () -> new DurabilityCraftingItem(Tiers.GOLD, Rarity.UNCOMMON));
    public static final RegistryObject<Item> DIAMOND_BACKBREACKER = ITEMS.register("diamond_backbreacker", () -> new DurabilityCraftingItem(Tiers.DIAMOND, Rarity.RARE));
    public static final RegistryObject<Item> NETHERITE_BACKBREACKER = ITEMS.register("netherite_backbreacker", () -> new DurabilityCraftingItem(Tiers.NETHERITE, Rarity.EPIC));
    public static final RegistryObject<Item> WOODEN_BACKENGRAVER = ITEMS.register("wooden_backengraver", () -> new DurabilityCraftingItem(Tiers.WOOD, Rarity.COMMON, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BACKENGRAVER = ITEMS.register("stone_backengraver", () -> new DurabilityCraftingItem(Tiers.STONE, Rarity.COMMON));
    public static final RegistryObject<Item> COPPER_BACKENGRAVER = ITEMS.register("copper_backengraver", () -> new DurabilityCraftingItem(COPPER, Rarity.UNCOMMON));
    public static final RegistryObject<Item> IRON_BACKENGRAVER = ITEMS.register("iron_backengraver", () -> new DurabilityCraftingItem(Tiers.IRON, Rarity.UNCOMMON));
    public static final RegistryObject<Item> GOLDEN_BACKENGRAVER = ITEMS.register("golden_backengraver", () -> new DurabilityCraftingItem(Tiers.GOLD, Rarity.UNCOMMON));
    public static final RegistryObject<Item> DIAMOND_BACKENGRAVER = ITEMS.register("diamond_backengraver", () -> new DurabilityCraftingItem(Tiers.DIAMOND, Rarity.RARE));
    public static final RegistryObject<Item> NETHERITE_BACKENGRAVER = ITEMS.register("netherite_backengraver", () -> new DurabilityCraftingItem(Tiers.NETHERITE, Rarity.EPIC));
    public static final RegistryObject<Item> WOODEN_BACKMUTATOR = ITEMS.register("wooden_backmutator", () -> new DurabilityCraftingItem(Tiers.WOOD, Rarity.COMMON, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BACKMUTATOR = ITEMS.register("stone_backmutator", () -> new DurabilityCraftingItem(Tiers.STONE, Rarity.COMMON));
    public static final RegistryObject<Item> COPPER_BACKMUTATOR = ITEMS.register("copper_backmutator", () -> new DurabilityCraftingItem(COPPER, Rarity.UNCOMMON));
    public static final RegistryObject<Item> IRON_BACKMUTATOR = ITEMS.register("iron_backmutator", () -> new DurabilityCraftingItem(Tiers.IRON, Rarity.UNCOMMON));
    public static final RegistryObject<Item> GOLDEN_BACKMUTATOR = ITEMS.register("golden_backmutator", () -> new DurabilityCraftingItem(Tiers.GOLD, Rarity.UNCOMMON));
    public static final RegistryObject<Item> DIAMOND_BACKMUTATOR = ITEMS.register("diamond_backmutator", () -> new DurabilityCraftingItem(Tiers.DIAMOND, Rarity.RARE));
    public static final RegistryObject<Item> NETHERITE_BACKMUTATOR = ITEMS.register("netherite_backmutator", () -> new DurabilityCraftingItem(Tiers.NETHERITE, Rarity.EPIC));



}
