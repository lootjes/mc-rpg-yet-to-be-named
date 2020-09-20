package dev.lootjes.miroga.attributes;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.util.registry.Registry;

public class DungeonEntityAttributes {
    public static final EntityAttribute LEVEL = register("dungeon.level", (new DungeonAttribute("attribute.name.level", 1.0D)).setTracked(true));

    private static EntityAttribute register(String id, EntityAttribute attribute) {
        return (EntityAttribute) Registry.register(Registry.ATTRIBUTE, id, attribute);
    }
}
