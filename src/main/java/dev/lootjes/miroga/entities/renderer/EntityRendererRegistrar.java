package dev.lootjes.miroga.entities.renderer;

import dev.lootjes.miroga.entities.EntityRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.ZombieEntityRenderer;

public class EntityRendererRegistrar {
    public static void register() {
        EntityRendererRegistry.INSTANCE.register(EntityRegistry.TRASHZOMBIE, (dispatcher, context) -> {
            return new ZombieEntityRenderer(dispatcher);
        });
    }
}
