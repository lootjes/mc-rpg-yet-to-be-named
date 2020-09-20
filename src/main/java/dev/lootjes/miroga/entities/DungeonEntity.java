package dev.lootjes.miroga.entities;

import dev.lootjes.miroga.attributes.DungeonAttribute;
import dev.lootjes.miroga.attributes.DungeonEntityAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.world.World;

public class DungeonEntity extends MobEntity {
    public DungeonEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return null;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {
    }

    @Override
    public Arm getMainArm() {
        return Arm.RIGHT;
    }

    public static DefaultAttributeContainer.Builder createDungeonAttributes() {
        return MobEntity.createMobAttributes()
                .add(DungeonEntityAttributes.LEVEL);
    }
}
