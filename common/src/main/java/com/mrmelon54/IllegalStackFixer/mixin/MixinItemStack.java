package com.mrmelon54.IllegalStackFixer.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class MixinItemStack {
    @Shadow
    public abstract int getMaxStackSize();

    @Inject(method = "getCount", at = @At("RETURN"), cancellable = true)
    private void safeCount(CallbackInfoReturnable<Integer> cir) {
        if (cir.getReturnValue() > getMaxStackSize())
            cir.setReturnValue(getMaxStackSize());
    }
}
