package glitchwitch.decoratives;

import glitchwitch.decoratives.blocks.Cupboard;
import glitchwitch.decoratives.blocks.Shutters;
import glitchwitch.decoratives.blocks.TiledRoof;
import glitchwitch.decoratives.blocks.TiledRoofCap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlockRegistry {
	public static final Cupboard BIRCH_CUPBOARD = new Cupboard();
	public static final Cupboard OAK_CUPBOARD = new Cupboard();
	public static final TiledRoof TILED_ROOF = new TiledRoof();
	public static final TiledRoofCap TILED_ROOF_CAP = new TiledRoofCap();

	public static final Shutters OAK_SHUTTERS = new Shutters();
	public static final Shutters SPRUCE_SHUTTERS = new Shutters();
	public static final Shutters BIRCH_SHUTTERS = new Shutters();
	public static final Shutters JUNGLE_SHUTTERS = new Shutters();
	public static final Shutters ACACIA_SHUTTERS = new Shutters();
	public static final Shutters DARK_OAK_SHUTTERS = new Shutters();
	public static final Shutters CRIMSON_SHUTTERS = new Shutters();
	public static final Shutters WARPED_SHUTTERS = new Shutters();

	public static void registerBlocks() {
		registerWithBlockItem("birch_cupboard", BIRCH_CUPBOARD);
		registerWithBlockItem("oak_cupboard", OAK_CUPBOARD);
		registerWithBlockItem("tiled_roof", TILED_ROOF);
		registerWithBlockItem("tiled_roof_cap", TILED_ROOF_CAP);

		registerWithBlockItem("oak_shutters", OAK_SHUTTERS);
		registerWithBlockItem("spruce_shutters", SPRUCE_SHUTTERS);
		registerWithBlockItem("birch_shutters", BIRCH_SHUTTERS);
		registerWithBlockItem("jungle_shutters", JUNGLE_SHUTTERS);
		registerWithBlockItem("acacia_shutters", ACACIA_SHUTTERS);
		registerWithBlockItem("dark_oak_shutters", DARK_OAK_SHUTTERS);
		registerWithBlockItem("crimson_shutters", CRIMSON_SHUTTERS);
		registerWithBlockItem("warped_shutters", WARPED_SHUTTERS);

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
