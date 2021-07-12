package glitchwitch.decoratives;

import glitchwitch.decoratives.blocks.Cupboard;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlockRegistry {
	public static final Cupboard BIRCH_CUPBOARD = new Cupboard();
	public static final Cupboard OAK_CUPBOARD = new Cupboard();

	public static void registerBlocks() {
		registerWithBlockItem("birch_cupboard", BIRCH_CUPBOARD);
		registerWithBlockItem("oak_cupboard", OAK_CUPBOARD);
	}

	@SuppressWarnings("unused")
	private static void register(Block block, String name) {
		Identifier blockID = new Identifier(Decoratives.MODID, name);
		Registry.register(Registry.BLOCK, blockID, block);
	}

	private static void registerWithBlockItem(String name, Block block) {

		FabricItemSettings genericItemSettings = new FabricItemSettings().group(Decoratives.IG);
		Identifier blockID = new Identifier(Decoratives.MODID, name);
		BlockItem item = new BlockItem(block, genericItemSettings);

		Registry.register(Registry.BLOCK, blockID, block);
		Registry.register(Registry.ITEM, blockID, item);
	}
}