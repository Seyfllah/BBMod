package net.habib.bbmod.entity.client;

import net.habib.bbmod.BBMod;
import net.habib.bbmod.entity.custom.BBEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class BBModel extends GeoModel<BBEntity> {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(BBMod.MODID, "geo/bbv2.geo.json");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(BBMod.MODID, "textures/entities/bbv2.png");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(BBMod.MODID, "animations/bbv2.animation.json");

    @Override
    public ResourceLocation getModelResource(BBEntity animatable) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(BBEntity animatable) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BBEntity animatable) {
        return this.animations;
    }
}
