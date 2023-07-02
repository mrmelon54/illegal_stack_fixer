package com.mrmelon54.IllegalStackFixer.fabric;

import com.mrmelon54.IllegalStackFixer.fabriclike.IllegalStackFixerFabricLike;
import net.fabricmc.api.ModInitializer;

public class IllegalStackFixerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        IllegalStackFixerFabricLike.init();
    }
}
