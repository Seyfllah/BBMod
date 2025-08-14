package net.habib.bbmod.item;

import net.habib.bbmod.BBMod;
import net.habib.bbmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // This class is used to register mod items, such as custom tools, weapons, and other items.
    // It can be expanded with methods to register specific items as needed.
    // For example, you can create a DeferredRegister for items and register them in the constructor or a static block.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , BBMod.MODID);
}
