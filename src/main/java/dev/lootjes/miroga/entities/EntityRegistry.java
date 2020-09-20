package dev.lootjes.miroga.entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry {

    public static final EntityType<TrashZombie> TRASHZOMBIE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("miroga", "trashzombie"),
            FabricEntityTypeBuilder.<TrashZombie>create(SpawnGroup.CREATURE, TrashZombie::new).dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build()
    );

    public static void register(){
        FabricDefaultAttributeRegistry.register(TRASHZOMBIE, TrashZombie.createDungeonAttributes());
    }
}
