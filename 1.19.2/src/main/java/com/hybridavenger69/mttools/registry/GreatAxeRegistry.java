package com.hybridavenger69.mttools.registry;

import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttools.items.item.ExcavatorItem;
import com.hybridavenger69.mttools.items.item.GreatAxeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GreatAxeRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTools_MODID);


    public static final RegistryObject<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.WOODEN, 7, 6.5f,  props()));

    public static final RegistryObject<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.STONE, 7, 6.5f,  props()));

    public static final RegistryObject<Item> COPPER_GREATAXE = ITEMS.register("copper_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.COPPER, 7, 6.5f,  props()));

    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.IRON, 7, 6.5f,  props()));

    public static final RegistryObject<Item> GOLD_GREATAXE = ITEMS.register("gold_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.GOLD, 7, 6.5f,  props()));

    public static final RegistryObject<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.DIAMOND, 7, 6.5f,  props()));

    public static final RegistryObject<Item> OBSIDIAN_GREATAXE = ITEMS.register("obsidian_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.OBSIDIAN, 7, 6.5f,  props()));

    public static final RegistryObject<Item> EMERALD_GREATAXE = ITEMS.register("emerald_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.EMERALD, 7, 6.5f,  props()));

    public static final RegistryObject<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe",
            () -> new GreatAxeItem(ModTiers.VanillaTiers.NETHERITE, 7, 6.5f,  props()));



    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }
}
