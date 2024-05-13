package io.github.yousendri.yous_backpacks;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YousBackpacks implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Yous Backpacks");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}