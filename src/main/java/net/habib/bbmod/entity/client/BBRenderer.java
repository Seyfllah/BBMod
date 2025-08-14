package net.habib.bbmod.entity.client;

import net.habib.bbmod.entity.custom.BBEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BBRenderer extends GeoEntityRenderer<BBEntity> {
    public BBRenderer(EntityRendererProvider.Context context) {
        super(context, new BBModel());
    }
}
