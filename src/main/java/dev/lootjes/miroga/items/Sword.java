package dev.lootjes.miroga.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sword {
    public static final Item ITEM = new Item(new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("miroga", "SWORD"), ITEM);
    }


}
