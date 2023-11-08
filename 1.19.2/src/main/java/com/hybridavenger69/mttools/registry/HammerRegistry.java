package com.hybridavenger69.mttools.registry;

import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttools.items.item.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HammerRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTools_MODID);
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.WOODEN, 7, 6.5f,  props()));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.STONE, 7,6.5f, props()));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.IRON, 7,6.5f, props()));
    public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.COPPER, 7,6.5f, props()));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.GOLD,7,6.5f,  props()));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.DIAMOND,7,6.5f, props()));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.OBSIDIAN,7,6.5f, props()));
    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.EMERALD,7,6.5f, props()));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(ModTiers.VanillaTiers.NETHERITE,7,6.5f, props()));
    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

}
