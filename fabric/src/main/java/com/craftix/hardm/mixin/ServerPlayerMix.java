package com.craftix.hardm.mixin;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ServerPlayer.class)
public abstract class ServerPlayerMix {

  //  @Unique
  //  int hardmulnerability$ticksOfInvulnerability = 20 * AutoConfig.getConfigHolder(ModConfig.class).getConfig().timeSeconds;

    @Inject(method = "tick", at = @At("HEAD"))
    private void injected(CallbackInfo ci) {
 //      if (hardmulnerability$ticksOfInvulnerability > 0) {
 //          hardmulnerability$ticksOfInvulnerability--;
 //        //  System.out.println(hardmulnerability$ticksOfInvulnerability);
 //      }
    }


}