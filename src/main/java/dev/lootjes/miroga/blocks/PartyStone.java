package dev.lootjes.miroga.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PartyStone {
    public static final Item ITEM = new Item(new Item.Settings().group(ItemGroup.MISC).fireproof().maxCount(1));
    public static final Block BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK));
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("miroga", "partystone"), BLOCK);
        Registry.register(Registry.ITEM, new Identifier("miroga", "partystone"), new BlockItem(BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}
