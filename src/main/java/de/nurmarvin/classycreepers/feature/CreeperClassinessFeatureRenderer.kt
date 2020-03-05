package de.nurmarvin.classycreepers.feature

import net.minecraft.client.model.ModelPart
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.entity.feature.FeatureRenderer
import net.minecraft.client.render.entity.feature.FeatureRendererContext
import net.minecraft.client.render.entity.model.CreeperEntityModel
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.entity.mob.CreeperEntity
import net.minecraft.util.Identifier

class CreeperClassinessFeatureRenderer(
    context: FeatureRendererContext<CreeperEntity, CreeperEntityModel<CreeperEntity>>) : FeatureRenderer<CreeperEntity, CreeperEntityModel<CreeperEntity>>(context) {
    companion object {
        val TOP_HAT = Identifier("classycreepers", "tophat.png")
    }

    private val hat: ModelPart
    private val hat2: ModelPart
    private val brim1: ModelPart
    private val brim2: ModelPart
    private val brim3: ModelPart
    private val brim4: ModelPart
    private val mono1: ModelPart
    private val mono2: ModelPart
    private val mono3: ModelPart
    private val mono4: ModelPart
    private val mono5: ModelPart
    private val mono6: ModelPart
    private val mono7: ModelPart
    private val mono8: ModelPart
    private val monoGlass: ModelPart

    init {
        val model = CreeperEntityModel<CreeperEntity>(1.0f)

        ModelPart(model, 9, 0).also { brim1 = it }.addCuboid(4.0f, -8.0f, -4.0f, 1f, 1f, 8f, 0.0f)
        brim1.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 9, 0).also { brim2 = it }.addCuboid(-5.0f, -8.0f, -4.0f, 1f, 1f, 8f, 0.0f)
        brim2.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 9, 0).also { brim3 = it }.addCuboid(-5.0f, -8.0f, 4.0f, 10f, 1f, 1f, 0.0f)
        brim3.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 9, 0).also { brim4 = it }.addCuboid(-5.0f, -8.0f, -5.0f, 10f, 1f, 1f, 0.0f)
        brim4.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 10, 0).also { hat = it }.addCuboid(-4.0f, -16.0f, -4.0f, 8f, 6f, 8f, 0.0f)
        hat.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 22).also { hat2 = it }.addCuboid(-4.0f, -10.0f, -4.0f, 8f, 2f, 8f, 0.0f)
        hat2.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono1 = it }.addCuboid(1.0f, -7.0f, -5.0f, 2f, 1f, 1f, 0.0f)
        mono1.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono2 = it }.addCuboid(1.0f, -4.0f, -5.0f, 2f, 1f, 1f, 0.0f)
        mono2.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono3 = it }.addCuboid(0.0f, -6.0f, -5.0f, 1f, 2f, 1f, 0.0f)
        mono3.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono4 = it }.addCuboid(3.0f, -6.0f, -5.0f, 1f, 2f, 1f, 0.0f)
        mono4.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono5 = it }.addCuboid(4.0f, -6.0f, -4.0f, 1f, 1f, 1f, 0.0f)
        mono5.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono6 = it }.addCuboid(4.0f, -5.0f, -3.0f, 1f, 2f, 1f, 0.0f)
        mono6.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono7 = it }.addCuboid(4.0f, -3.0f, -2.0f, 1f, 2f, 1f, 0.0f)
        mono7.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, 0, 0).also { mono8 = it }.addCuboid(4.0f, -1.0f, -1.0f, 1f, 1f, 1f, 0.0f)
        mono8.setPivot(0.0f, 6.0f, 0.0f)
        ModelPart(model, -1, 19).also { monoGlass = it }.addCuboid(1.0f, -6.0f, -5.0f, 2f, 2f, 1f, 0.0f)
        monoGlass.setPivot(0.0f, 6.0f, 0.0f)
    }

    override fun render(matrices: MatrixStack, vertexConsumers: VertexConsumerProvider,
                        light: Int, entity: CreeperEntity?, limbAngle: Float,
                        limbDistance: Float, tickDelta: Float, customAngle: Float,
                        headYaw: Float, headPitch: Float) {
        val vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TOP_HAT))

        listOf(this.hat, this.hat2, this.brim1, this.brim2, this.brim3, this.brim4, this.mono1, this.mono2, this.mono3,
            this.mono4, this.mono5, this.mono6, this.mono7, this.mono8, this.monoGlass)
            .forEach {
                this.setAngles(it, headYaw, headPitch)
                it.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV)
            }
    }

    private fun setAngles(modelPart: ModelPart, headYaw: Float, headPitch: Float) {
        modelPart.yaw = headYaw / 57.295776f
        modelPart.pitch = headPitch / 57.295776f
    }
}