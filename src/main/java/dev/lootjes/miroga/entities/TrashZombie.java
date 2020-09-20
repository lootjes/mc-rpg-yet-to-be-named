package dev.lootjes.miroga.entities;

import dev.lootjes.miroga.attributes.DungeonEntityAttributes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.world.World;

public class TrashZombie extends DungeonEntity {

    public TrashZombie(EntityType<? extends DungeonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean tryAttack(Entity target) {
        this.dealDamage(this, target);
        this.onAttacking(target);
        boolean bl = target.damage(DamageSource.mob(this), (float) this.getAttributes().getValue(DungeonEntityAttributes.LEVEL));
        return bl;
    }

}
