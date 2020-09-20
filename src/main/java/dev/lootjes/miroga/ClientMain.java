package dev.lootjes.miroga;

import dev.lootjes.miroga.entities.EntityRegistry;
import dev.lootjes.miroga.entities.renderer.EntityRendererRegistrar;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ClientMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
    }
}