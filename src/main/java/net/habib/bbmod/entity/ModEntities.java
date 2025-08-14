package net.habib.bbmod.entity;

import net.habib.bbmod.BBMod;
import net.habib.bbmod.entity.custom.BBEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static  final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BBMod.MODID);

    public static final RegistryObject<EntityType<BBEntity>> BB =
            ENTITY_TYPES.register("bb",
                    ()  -> EntityType.Builder.of(BBEntity::new, MobCategory.CREATURE)
                            .build(BBMod.MODID + "bb")); // Set the registry name


    // Register your entity types here
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
