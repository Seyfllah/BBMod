package net.habib.bbmod.events;


import net.habib.bbmod.entity.ModEntities;
import net.habib.bbmod.entity.custom.BBEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "bbmod", bus = Mod.EventBusSubscriber.Bus.MOD)
// This class is used to register mod events, such as common setup, client setup, and
// other mod-specific events. It can be expanded with methods annotated with @SubscribeEvent
// to handle specific events as needed.
public class ModEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        // This method can be used to register entity attributes
        // For example, you can add attributes for custom entities here
        event.put(ModEntities.BB.get(), BBEntity.setAttributes().build());
    }
}
