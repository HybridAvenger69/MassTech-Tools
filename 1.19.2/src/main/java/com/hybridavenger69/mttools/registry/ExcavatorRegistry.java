package com.hybridavenger69.mttools.registry;

import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttools.items.item.ExcavatorItem;
import com.hybridavenger69.mttools.items.item.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExcavatorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTools_MODID);

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.WOODEN, 7, 6.5f,  props()));

    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.STONE, 7,6.5f, props()));

    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.IRON, 7,6.5f, props()));

    public static final RegistryObject<Item> COPPER_EXCAVATOR = ITEMS.register("copper_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.COPPER, 7,6.5f, props()));

    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.GOLD,7,6.5f,  props()));

    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.DIAMOND,7,6.5f, props()));

    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.OBSIDIAN,7,6.5f, props()));

    public static final RegistryObject<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.EMERALD,7,6.5f, props()));

    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new ExcavatorItem(ModTiers.VanillaTiers.NETHERITE,7,6.5f, props()));
    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

}
