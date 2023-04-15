package com.github.wratixor.backstick.setup;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

    public static ForgeConfigSpec.IntValue REB_MIN_LVL;
    public static ForgeConfigSpec.IntValue REB_MAX_RANDOM_LEVEL;
    public static ForgeConfigSpec.IntValue REB_OFFHAND_RANDOM_LEVEL;
    public static ForgeConfigSpec.BooleanValue REB_TREASURE_RANDOM_POSSIBLE;


    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER) {
        SERVER_BUILDER.comment("Random Enchanted Book settings").push("REB");

        REB_MIN_LVL = SERVER_BUILDER
                .comment("Minimum LVL for use REB")
                .defineInRange("min_lvl", 3, 1, 512);
        REB_OFFHAND_RANDOM_LEVEL = SERVER_BUILDER
                .comment("Maximum LVL for offhand random enchants")
                .defineInRange("ofh_lvl", 16, 1, 512);
        REB_MAX_RANDOM_LEVEL = SERVER_BUILDER
                .comment("Maximum LVL for random enchants")
                .defineInRange("max_lvl", 64, 1, 512);
        REB_TREASURE_RANDOM_POSSIBLE = SERVER_BUILDER
                .comment("Set TREASURE enchant POSSIBLE in random enchants")
                .define("treasure_possible", true);

        SERVER_BUILDER.pop();
    }
}
