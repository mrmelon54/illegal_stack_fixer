package com.mrmelon54.IllegalStackFixer.forge;

import dev.architectury.platform.forge.EventBuses;
import com.mrmelon54.IllegalStackFixer.IllegalStackFixer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IllegalStackFixer.MOD_ID)
public class IllegalStackFixerForge {
    public IllegalStackFixerForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(IllegalStackFixer.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        IllegalStackFixer.init();
    }
}
