
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nova.orbs.init;

import net.nova.orbs.item.OrbItem;
import net.nova.orbs.item.LightingOrbItem;
import net.nova.orbs.item.HealthPointItem;
import net.nova.orbs.item.FulfillingOrbItem;
import net.nova.orbs.item.FireOrbItem;
import net.nova.orbs.item.AquaOrbItem;
import net.nova.orbs.OrbsMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class OrbsModItems {
	public static Item FIRE_ORB;
	public static Item ORB;
	public static Item FULFILLING_ORB;
	public static Item AQUA_ORB;
	public static Item HEALTH_POINT;
	public static Item LIGHTING_ORB;

	public static void load() {
		FIRE_ORB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "fire_orb"), new FireOrbItem());
		ORB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "orb"), new OrbItem());
		FULFILLING_ORB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "fulfilling_orb"), new FulfillingOrbItem());
		AQUA_ORB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "aqua_orb"), new AquaOrbItem());
		HEALTH_POINT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "health_point"), new HealthPointItem());
		LIGHTING_ORB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(OrbsMod.MODID, "lighting_orb"), new LightingOrbItem());
	}
}
