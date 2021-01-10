package net.fabricmc.example;

import net.minecraft.client.util.math.Vector3d;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TorchTest  extends Item {
    public TorchTest(Settings settings) {
        super(settings);
    }



    public static final float INACCURACY_DEFAULT = 1.0F;
    public static final float VELOCITY_MAX = 1.5F;
    public static final float velocityFactor = 1.5F;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        final float PITCHOFFSET=0F;
        System.out.println(" use itemn!");
        //todo
          Entitytest ball = ExampleMod.CUBE.create(world);


        //getUpVector doesnt exist i guess? because fabric is ??
        Vec3d vector3d1 = user.getOppositeRotationVector(1.0F);
        //      float projectileAngle = 0;//is degrees so can be -10, +10, etc
        Quaternion quaternion = new Quaternion(new Vector3f(vector3d1), PITCHOFFSET, true);

        // getLook doesnt exist? again because fabric is ??????.
        //
        // //so find something that might work and guess

        //ok comment out the "shooting flying part.
        //test out just it spawning
        /*
        Vector3d vector3d = user.getLook(1.0F);
        Vector3f vector3f = new Vector3f(vector3d);
        vector3f.transform(quaternion);
        ball.shoot(
                vector3f.getX(), vector3f.getY(), vector3f.getZ(),
                velocityFactor * VELOCITY_MAX, INACCURACY_DEFAULT);
        */
        System.out.println(" spawn one "+ ball);
        world.spawnEntity(ball);

        return super.use(world, user, hand);
    }
}
