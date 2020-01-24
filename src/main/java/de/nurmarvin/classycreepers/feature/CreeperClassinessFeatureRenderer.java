package de.nurmarvin.classycreepers.feature;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;

public final class CreeperClassinessFeatureRenderer
   extends FeatureRenderer<CreeperEntity, CreeperEntityModel<CreeperEntity>> {

   private static final Identifier TOP_HAT = new Identifier("classycreepers", "tophat.png");

   private final ModelPart hat;
   private final ModelPart hat2;
   private final ModelPart brim1;
   private final ModelPart brim2;
   private final ModelPart brim3;
   private final ModelPart brim4;
   private final ModelPart mono1;
   private final ModelPart mono2;
   private final ModelPart mono3;
   private final ModelPart mono4;
   private final ModelPart mono5;
   private final ModelPart mono6;
   private final ModelPart mono7;
   private final ModelPart mono8;
   private final ModelPart monoGlass;

   public CreeperClassinessFeatureRenderer(
      FeatureRendererContext<CreeperEntity, CreeperEntityModel<CreeperEntity>> context) {
      super(context);

      final CreeperEntityModel<CreeperEntity> model = new CreeperEntityModel<>(1.0F);
      (this.brim1 = new ModelPart(model, 9, 0)).addCuboid(4.0f, -8.0f, -4.0f, 1, 1, 8, 0.0f);
      this.brim1.setPivot(0.0f, 6.0f, 0.0f);
      (this.brim2 = new ModelPart(model, 9, 0)).addCuboid(-5.0f, -8.0f, -4.0f, 1, 1, 8, 0.0f);
      this.brim2.setPivot(0.0f, 6.0f, 0.0f);
      (this.brim3 = new ModelPart(model, 9, 0)).addCuboid(-5.0f, -8.0f, 4.0f, 10, 1, 1, 0.0f);
      this.brim3.setPivot(0.0f, 6.0f, 0.0f);
      (this.brim4 = new ModelPart(model, 9, 0)).addCuboid(-5.0f, -8.0f, -5.0f, 10, 1, 1, 0.0f);
      this.brim4.setPivot(0.0f, 6.0f, 0.0f);
      (this.hat = new ModelPart(model, 10, 0)).addCuboid(-4.0f, -16.0f, -4.0f, 8, 6, 8, 0.0f);
      this.hat.setPivot(0.0f, 6.0f, 0.0f);
      (this.hat2 = new ModelPart(model, 0, 22)).addCuboid(-4.0f, -10.0f, -4.0f, 8, 2, 8, 0.0f);
      this.hat2.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono1 = new ModelPart(model, 0, 0)).addCuboid(1.0f, -7.0f, -5.0f, 2, 1, 1, 0.0f);
      this.mono1.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono2 = new ModelPart(model, 0, 0)).addCuboid(1.0f, -4.0f, -5.0f, 2, 1, 1, 0.0f);
      this.mono2.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono3 = new ModelPart(model, 0, 0)).addCuboid(0.0f, -6.0f, -5.0f, 1, 2, 1, 0.0f);
      this.mono3.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono4 = new ModelPart(model, 0, 0)).addCuboid(3.0f, -6.0f, -5.0f, 1, 2, 1, 0.0f);
      this.mono4.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono5 = new ModelPart(model, 0, 0)).addCuboid(4.0f, -6.0f, -4.0f, 1, 1, 1, 0.0f);
      this.mono5.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono6 = new ModelPart(model, 0, 0)).addCuboid(4.0f, -5.0f, -3.0f, 1, 2, 1, 0.0f);
      this.mono6.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono7 = new ModelPart(model, 0, 0)).addCuboid(4.0f, -3.0f, -2.0f, 1, 2, 1, 0.0f);
      this.mono7.setPivot(0.0f, 6.0f, 0.0f);
      (this.mono8 = new ModelPart(model, 0, 0)).addCuboid(4.0f, -1.0f, -1.0f, 1, 1, 1, 0.0f);
      this.mono8.setPivot(0.0f, 6.0f, 0.0f);
      (this.monoGlass = new ModelPart(model, -1, 19))
         .addCuboid(1.0f, -6.0f, -5.0f, 2, 2, 1, 0.0f);
      this.monoGlass.setPivot(0.0f, 6.0f, 0.0f);
   }

   @Override
   public void render(final MatrixStack matrices, final VertexConsumerProvider vertexConsumers,
                      final int light, final CreeperEntity entity, final float limbAngle,
                      final float limbDistance, final float tickDelta, final float customAngle,
                      final float headYaw, final float headPitch) {
      final VertexConsumer
         vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TOP_HAT));

      this.setAngles(this.hat, headYaw, headPitch);
      this.setAngles(this.hat2, headYaw, headPitch);
      this.setAngles(this.brim1, headYaw, headPitch);
      this.setAngles(this.brim2, headYaw, headPitch);
      this.setAngles(this.brim3, headYaw, headPitch);
      this.setAngles(this.brim4, headYaw, headPitch);
      this.setAngles(this.mono1, headYaw, headPitch);
      this.setAngles(this.mono2, headYaw, headPitch);
      this.setAngles(this.mono3, headYaw, headPitch);
      this.setAngles(this.mono4, headYaw, headPitch);
      this.setAngles(this.mono5, headYaw, headPitch);
      this.setAngles(this.mono6, headYaw, headPitch);
      this.setAngles(this.mono7, headYaw, headPitch);
      this.setAngles(this.mono8, headYaw, headPitch);
      this.setAngles(this.monoGlass, headYaw, headPitch);

      this.hat.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.hat2.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.brim1.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.brim2.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.brim3.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.brim4.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono1.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono2.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono3.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono4.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono5.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono6.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono7.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.mono8.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
      this.monoGlass.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
   }

   private void setAngles(final ModelPart modelPart, float headYaw, float headPitch) {
      modelPart.yaw = headYaw / 57.295776f;
      modelPart.pitch = headPitch / 57.295776f;
   }
}
