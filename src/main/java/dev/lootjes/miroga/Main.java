package dev.lootjes.miroga;

import dev.lootjes.miroga.blocks.BlockRegistry;
import dev.lootjes.miroga.entities.EntityRegistry;
import dev.lootjes.miroga.items.ItemRegistry;
import dev.lootjes.miroga.worldgen.WorldGenRegistrar;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class Main implements ModInitializer {
	private static RegistryKey<World> dimensionRegistryKey;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BlockRegistry.register();
		ItemRegistry.register();
		WorldGenRegistrar.register();
	}
}
