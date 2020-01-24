package de.nurmarvin.classycreepers.mixin;

import de.nurmarvin.classycreepers.feature.CreeperClassinessFeatureRenderer;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntityRenderer.class)
public abstract class CreeperEntityRendererMixin
   extends MobEntityRenderer<CreeperEntity, CreeperEntityModel<CreeperEntity>> {
   public CreeperEntityRendererMixin(final EntityRenderDispatcher renderManager,
                                     final CreeperEntityModel<CreeperEntity> model, final float f) {
      super(renderManager, model, f);
   }

   @Inject(method = "<init>", at = @At("RETURN"))
   private void init(final EntityRenderDispatcher entityRenderDispatcher,
                     final CallbackInfo callbackInfo) {
      this.addFeature(new CreeperClassinessFeatureRenderer(this));
   }
}
