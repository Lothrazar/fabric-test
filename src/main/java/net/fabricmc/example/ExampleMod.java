package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	public static final Item TORCH_LAUNCHER = new TorchTest(new FabricItemSettings().group(ItemGroup.MISC));

	public static final EntityType<Entitytest> CUBE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("entitytesting", "cube"),
			FabricEntityTypeBuilder.create(SpawnGroup.MISC, Entitytest::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		EggEntity test;
		Registry.register(Registry.ITEM, new Identifier("example",
				"torch_launcher"), TORCH_LAUNCHER);
		//
		//FabricDefaultAttributeRegistry.register(CUBE, Entitytest.createMobAttributes());
	}
}
