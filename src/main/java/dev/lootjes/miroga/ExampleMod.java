package dev.lootjes.miroga;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements DedicatedServerModInitializer {
	private static Enchantment FROST = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("tutorial", "frost"),
			new SwordDamageEnchantment()
	);
	@Override
	public void onInitializeServer() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
