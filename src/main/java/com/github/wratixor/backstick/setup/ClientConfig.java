package com.github.wratixor.backstick.setup;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
    public static ForgeConfigSpec.BooleanValue ISDEBUG;

    public static void registerClientConfig(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        CLIENT_BUILDER.comment("Client settings").push("debug");

        ISDEBUG = CLIENT_BUILDER
                .comment("Enable debug tooltip (Unbreacking counter | Damage counter | Repair ingridient)")
                .define("debug", false);

        CLIENT_BUILDER.pop();
    }
}
