package glitchwitch.decoratives;

import glitchwitch.decoratives.blocks.Cupboard;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Decoratives implements ModInitializer {

	public static final String MODID = "decoratives";
	public static final ItemGroup IG = FabricItemGroupBuilder.build(
		new Identifier(Decoratives.MODID, "general"),
		() -> new ItemStack(new Cupboard()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		BlockRegistry.registerBlocks();
	}
}
