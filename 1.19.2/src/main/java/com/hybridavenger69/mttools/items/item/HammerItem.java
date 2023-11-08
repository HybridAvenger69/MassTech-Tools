package com.hybridavenger69.mttools.items.item;

import com.hybridavenger69.mttools.items.base.HammerBase;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class HammerItem extends HammerBase
{
    public HammerItem(Tier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder)
    {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}