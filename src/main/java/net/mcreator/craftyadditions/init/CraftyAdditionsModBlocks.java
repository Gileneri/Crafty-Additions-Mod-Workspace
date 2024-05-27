
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftyadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftyadditions.block.SaltBlock;
import net.mcreator.craftyadditions.CraftyAdditionsMod;

public class CraftyAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftyAdditionsMod.MODID);
	public static final RegistryObject<Block> SALT = REGISTRY.register("salt", () -> new SaltBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
