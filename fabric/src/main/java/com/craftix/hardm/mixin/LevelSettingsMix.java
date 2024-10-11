package com.craftix.hardm.mixin;


import net.minecraft.world.level.LevelSettings;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LevelSettings.class)
public abstract class LevelSettingsMix {

    @Mutable
    @Shadow
    @Final
    private boolean hardcore;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void injected(CallbackInfo ci) {
        hardcore = true;
    }


}