package de.nurmarvin.classycreepers.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Cuboid;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntityModel.class)
public class CreeperEntityModelMixin<T extends Entity> extends EntityModel<T> {
   private Cuboid hat;
   private Cuboid hat2;
   private Cuboid brim1;
   private Cuboid brim2;
   private Cuboid brim3;
   private Cuboid brim4;
   private Cuboid mono1;
   private Cuboid mono2;
   private Cuboid mono3;
   private Cuboid mono4;
   private Cuboid mono5;
   private Cuboid mono6;
   private Cuboid mono7;
   private Cuboid mono8;
   private Cuboid monoGlass;
   private Identifier topHat;

   @Inject(method = "<init>(F)V", at = @At("RETURN"))
   private void init(final float p_i46366_1_, final CallbackInfo callbackInfo) {
      this.topHat = new Identifier("classycreepers", "tophat.png");
      final int i = 6;
      (this.brim1 = new Cuboid(this, 9, 0)).addBox(4.0f, -8.0f, -4.0f, 1, 1, 8, 0.0f);
      this.brim1.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.brim2 = new Cuboid(this, 9, 0)).addBox(-5.0f, -8.0f, -4.0f, 1, 1, 8, 0.0f);
      this.brim2.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.brim3 = new Cuboid(this, 9, 0)).addBox(-5.0f, -8.0f, 4.0f, 10, 1, 1, 0.0f);
      this.brim3.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.brim4 = new Cuboid(this, 9, 0)).addBox(-5.0f, -8.0f, -5.0f, 10, 1, 1, 0.0f);
      this.brim4.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.hat = new Cuboid(this, 10, 0)).addBox(-4.0f, -16.0f, -4.0f, 8, 6, 8, 0.0f);
      this.hat.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.hat2 = new Cuboid(this, 0, 22)).addBox(-4.0f, -10.0f, -4.0f, 8, 2, 8, 0.0f);
      this.hat2.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono1 = new Cuboid(this, 0, 0)).addBox(1.0f, -7.0f, -5.0f, 2, 1, 1, 0.0f);
      this.mono1.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono2 = new Cuboid(this, 0, 0)).addBox(1.0f, -4.0f, -5.0f, 2, 1, 1, 0.0f);
      this.mono2.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono3 = new Cuboid(this, 0, 0)).addBox(0.0f, -6.0f, -5.0f, 1, 2, 1, 0.0f);
      this.mono3.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono4 = new Cuboid(this, 0, 0)).addBox(3.0f, -6.0f, -5.0f, 1, 2, 1, 0.0f);
      this.mono4.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono5 = new Cuboid(this, 0, 0)).addBox(4.0f, -6.0f, -4.0f, 1, 1, 1, 0.0f);
      this.mono5.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono6 = new Cuboid(this, 0, 0)).addBox(4.0f, -5.0f, -3.0f, 1, 2, 1, 0.0f);
      this.mono6.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono7 = new Cuboid(this, 0, 0)).addBox(4.0f, -3.0f, -2.0f, 1, 2, 1, 0.0f);
      this.mono7.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.mono8 = new Cuboid(this, 0, 0)).addBox(4.0f, -1.0f, -1.0f, 1, 1, 1, 0.0f);
      this.mono8.setRotationPoint(0.0f, 6.0f, 0.0f);
      (this.monoGlass = new Cuboid(this, -1, 19)).addBox(1.0f, -6.0f, -5.0f, 2, 2, 1, 0.0f);
      this.monoGlass.setRotationPoint(0.0f, 6.0f, 0.0f);
   }

   @Inject(method = "setAngles", at = @At("RETURN"))
   private void setAngles(T entity, float limbAngle, float limbDistance, float age, float headYaw,
                          float headPitch, float scale, final CallbackInfo callbackInfo) {
      this.hat.yaw = headYaw / 57.295776f;
      this.hat.pitch = headPitch / 57.295776f;
      this.hat2.yaw = headYaw / 57.295776f;
      this.hat2.pitch = headPitch / 57.295776f;
      this.brim1.yaw = headYaw / 57.295776f;
      this.brim1.pitch = headPitch / 57.295776f;
      this.brim2.yaw = headYaw / 57.295776f;
      this.brim2.pitch = headPitch / 57.295776f;
      this.brim3.yaw = headYaw / 57.295776f;
      this.brim3.pitch = headPitch / 57.295776f;
      this.brim4.yaw = headYaw / 57.295776f;
      this.brim4.pitch = headPitch / 57.295776f;
      this.mono1.yaw = headYaw / 57.295776f;
      this.mono1.pitch = headPitch / 57.295776f;
      this.mono2.yaw = headYaw / 57.295776f;
      this.mono2.pitch = headPitch / 57.295776f;
      this.mono3.yaw = headYaw / 57.295776f;
      this.mono3.pitch = headPitch / 57.295776f;
      this.mono4.yaw = headYaw / 57.295776f;
      this.mono4.pitch = headPitch / 57.295776f;
      this.mono5.yaw = headYaw / 57.295776f;
      this.mono5.pitch = headPitch / 57.295776f;
      this.mono6.yaw = headYaw / 57.295776f;
      this.mono6.pitch = headPitch / 57.295776f;
      this.mono7.yaw = headYaw / 57.295776f;
      this.mono7.pitch = headPitch / 57.295776f;
      this.mono8.yaw = headYaw / 57.295776f;
      this.mono8.pitch = headPitch / 57.295776f;
      this.monoGlass.yaw = headYaw / 57.295776f;
      this.monoGlass.pitch = headPitch / 57.295776f;
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void render(final T entity, final float limbAngle, final float limbDistance,
                       final float age, final float headYaw, final float headPitch,
                       final float scale, final CallbackInfo callbackInfo) {
      MinecraftClient.getInstance().getTextureManager().bindTexture(this.topHat);
      this.hat.render(scale);
      this.hat2.render(scale);
      this.brim1.render(scale);
      this.brim2.render(scale);
      this.brim3.render(scale);
      this.brim4.render(scale);
      this.mono1.render(scale);
      this.mono2.render(scale);
      this.mono3.render(scale);
      this.mono4.render(scale);
      this.mono5.render(scale);
      this.mono6.render(scale);
      this.mono7.render(scale);
      this.mono8.render(scale);
      this.monoGlass.render(scale);
   }
}
