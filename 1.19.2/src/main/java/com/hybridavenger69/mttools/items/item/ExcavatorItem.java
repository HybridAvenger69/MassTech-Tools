package com.hybridavenger69.mttools.items.item;

import com.hybridavenger69.mttools.items.base.ExcavatorBase;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class ExcavatorItem extends ExcavatorBase
{
    public ExcavatorItem(Tier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder)
    {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}