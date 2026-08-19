package me.paypur.tconjei.client;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.BooleanValue ENABLE_TOOLTIP;

    static{
        BUILDER.push("TConJEI client config");
        BUILDER.pop();

        ENABLE_TOOLTIP = BUILDER.comment("Enable tooltip under Tinker's materials").define("enable_tooltip", true);

        SPEC = BUILDER.build();
    }
}
