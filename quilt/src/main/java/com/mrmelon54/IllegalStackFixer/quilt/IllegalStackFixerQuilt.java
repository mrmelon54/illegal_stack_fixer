package com.mrmelon54.IllegalStackFixer.quilt;

import com.mrmelon54.IllegalStackFixer.fabriclike.IllegalStackFixerFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class IllegalStackFixerQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        IllegalStackFixerFabricLike.init();
    }
}
