package net.fabricmc.example;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class Entitytest  extends ThrownItemEntity {
    public Entitytest(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }


    public static Object createMobAttributes() {
        return null;
    }

    @Override
    protected Item getDefaultItem() {
        return Items.TORCH;
    }
}
