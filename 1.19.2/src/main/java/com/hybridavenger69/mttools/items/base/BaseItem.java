package com.hybridavenger69.mttools.items.base;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class BaseItem extends Item {
    public BaseItem(Function<Properties, Properties> properties) {
        super(properties.apply(new Properties()));
    }


}
