package glitchwitch.decoratives;

import glitchwitch.decoratives.blocks.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlockRegistry {
	public static final Cupboard BIRCH_CUPBOARD = new Cupboard();
	public static final Cupboard OAK_CUPBOARD = new Cupboard();


	public static final Shutters OAK_SHUTTERS = new Shutters();
	public static final Shutters SPRUCE_SHUTTERS = new Shutters();
	public static final Shutters BIRCH_SHUTTERS = new Shutters();
	public static final Shutters JUNGLE_SHUTTERS = new Shutters();
	public static final Shutters ACACIA_SHUTTERS = new Shutters();
	public static final Shutters DARK_OAK_SHUTTERS = new Shutters();
	public static final Shutters CRIMSON_SHUTTERS = new Shutters();
	public static final Shutters WARPED_SHUTTERS = new Shutters();

	public static final ShinglesRoof SHINGLES_OAK_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_SPRUCE_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BIRCH_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_ACACIA_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_JUNGLE_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_DARK_OAK_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_WARPED_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_CRIMSON_PLANKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_STONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_COBBLESTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_STONE_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_ANDESITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_POLISHED_ANDESITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_DIORITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_POLISHED_DIORITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_GRANITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_POLISHED_GRANITE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_DEEPSLATE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_COBBLED_DEEPSLATE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_POLISHED_DEEPSLATE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_DEEPSLATE_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_DEEPSLATE_TILES_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_SANDSTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_SMOOTH_SANDSTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_RED_SANDSTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_SMOOTH_RED_SANDSTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_SMOOTH_QUARTZ_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_QUARTZ_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_NETHER_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_END_STONE_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BLACKSTONE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_POLISHED_BLACKSTONE_BRICKS_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_WHITE_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_ORANGE_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_MAGENTA_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIGHT_BLUE_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_YELLOW_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIME_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_PINK_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_GRAY_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIGHT_GRAY_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_CYAN_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_PURPLE_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BLUE_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BROWN_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_GREEN_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_RED_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BLACK_TERRACOTTA_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_WHITE_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_ORANGE_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_MAGENTA_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIGHT_BLUE_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_YELLOW_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIME_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_PINK_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_GRAY_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_LIGHT_GRAY_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_CYAN_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_PURPLE_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BLUE_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BROWN_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_GREEN_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_RED_CONCRETE_ROOF = new ShinglesRoof();
	public static final ShinglesRoof SHINGLES_BLACK_CONCRETE_ROOF = new ShinglesRoof();

	public static final ShinglesRoofCap SHINGLES_OAK_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_SPRUCE_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BIRCH_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_ACACIA_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_JUNGLE_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_DARK_OAK_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_WARPED_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_CRIMSON_PLANKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_STONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_COBBLESTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_STONE_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_ANDESITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_POLISHED_ANDESITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_DIORITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_POLISHED_DIORITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_GRANITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_POLISHED_GRANITE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_DEEPSLATE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_COBBLED_DEEPSLATE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_POLISHED_DEEPSLATE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_DEEPSLATE_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_DEEPSLATE_TILES_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_SANDSTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_SMOOTH_SANDSTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_RED_SANDSTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_SMOOTH_RED_SANDSTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_SMOOTH_QUARTZ_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_QUARTZ_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_NETHER_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_END_STONE_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BLACKSTONE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_POLISHED_BLACKSTONE_BRICKS_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_WHITE_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_ORANGE_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_MAGENTA_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIGHT_BLUE_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_YELLOW_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIME_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_PINK_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_GRAY_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIGHT_GRAY_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_CYAN_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_PURPLE_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BLUE_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BROWN_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_GREEN_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_RED_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BLACK_TERRACOTTA_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_WHITE_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_ORANGE_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_MAGENTA_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIGHT_BLUE_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_YELLOW_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIME_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_PINK_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_GRAY_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_LIGHT_GRAY_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_CYAN_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_PURPLE_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BLUE_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BROWN_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_GREEN_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_RED_CONCRETE_ROOF_CAP = new ShinglesRoofCap();
	public static final ShinglesRoofCap SHINGLES_BLACK_CONCRETE_ROOF_CAP = new ShinglesRoofCap();

	public static void registerBlocks() {
		registerWithBlockItem("birch_cupboard", BIRCH_CUPBOARD);
		registerWithBlockItem("oak_cupboard", OAK_CUPBOARD);

		registerWithBlockItem("shingles_acacia_planks_roof", SHINGLES_ACACIA_PLANKS_ROOF);
		registerWithBlockItem("shingles_birch_planks_roof", SHINGLES_BIRCH_PLANKS_ROOF);
		registerWithBlockItem("shingles_crimson_planks_roof", SHINGLES_CRIMSON_PLANKS_ROOF);
		registerWithBlockItem("shingles_dark_oak_planks_roof", SHINGLES_DARK_OAK_PLANKS_ROOF);
		registerWithBlockItem("shingles_jungle_planks_roof", SHINGLES_JUNGLE_PLANKS_ROOF);
		registerWithBlockItem("shingles_oak_planks_roof", SHINGLES_OAK_PLANKS_ROOF);
		registerWithBlockItem("shingles_spruce_planks_roof", SHINGLES_SPRUCE_PLANKS_ROOF);
		registerWithBlockItem("shingles_warped_planks_roof", SHINGLES_WARPED_PLANKS_ROOF);

		registerWithBlockItem("shingles_oak_planks_roof_cap", SHINGLES_OAK_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_spruce_planks_roof_cap", SHINGLES_SPRUCE_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_birch_planks_roof_cap", SHINGLES_BIRCH_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_acacia_planks_roof_cap", SHINGLES_ACACIA_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_jungle_planks_roof_cap", SHINGLES_JUNGLE_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_dark_oak_planks_roof_cap", SHINGLES_DARK_OAK_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_warped_planks_roof_cap", SHINGLES_WARPED_PLANKS_ROOF_CAP);
		registerWithBlockItem("shingles_crimson_planks_roof_cap", SHINGLES_CRIMSON_PLANKS_ROOF_CAP);

		registerWithBlockItem("shingles_stone_roof", SHINGLES_STONE_ROOF);
		registerWithBlockItem("shingles_cobblestone_roof", SHINGLES_COBBLESTONE_ROOF);
		registerWithBlockItem("shingles_stone_bricks_roof", SHINGLES_STONE_BRICKS_ROOF);
		registerWithBlockItem("shingles_andesite_roof", SHINGLES_ANDESITE_ROOF);
		registerWithBlockItem("shingles_polished_andesite_roof", SHINGLES_POLISHED_ANDESITE_ROOF);
		registerWithBlockItem("shingles_diorite_roof", SHINGLES_DIORITE_ROOF);
		registerWithBlockItem("shingles_polished_diorite_roof", SHINGLES_POLISHED_DIORITE_ROOF);
		registerWithBlockItem("shingles_granite_roof", SHINGLES_GRANITE_ROOF);
		registerWithBlockItem("shingles_polished_granite_roof", SHINGLES_POLISHED_GRANITE_ROOF);
		registerWithBlockItem("shingles_deepslate_roof", SHINGLES_DEEPSLATE_ROOF);
		registerWithBlockItem("shingles_cobbled_deepslate_roof", SHINGLES_COBBLED_DEEPSLATE_ROOF);
		registerWithBlockItem("shingles_polished_deepslate_roof", SHINGLES_POLISHED_DEEPSLATE_ROOF);
		registerWithBlockItem("shingles_deepslate_bricks_roof", SHINGLES_DEEPSLATE_BRICKS_ROOF);
		registerWithBlockItem("shingles_deepslate_tiles_roof", SHINGLES_DEEPSLATE_TILES_ROOF);
		registerWithBlockItem("shingles_sandstone_roof", SHINGLES_SANDSTONE_ROOF);
		registerWithBlockItem("shingles_smooth_sandstone_roof", SHINGLES_SMOOTH_SANDSTONE_ROOF);
		registerWithBlockItem("shingles_red_sandstone_roof", SHINGLES_RED_SANDSTONE_ROOF);
		registerWithBlockItem("shingles_smooth_red_sandstone_roof", SHINGLES_SMOOTH_RED_SANDSTONE_ROOF);
		registerWithBlockItem("shingles_smooth_quartz_roof", SHINGLES_SMOOTH_QUARTZ_ROOF);
		registerWithBlockItem("shingles_quartz_bricks_roof", SHINGLES_QUARTZ_BRICKS_ROOF);
		registerWithBlockItem("shingles_bricks_roof", SHINGLES_BRICKS_ROOF);
		registerWithBlockItem("shingles_nether_bricks_roof", SHINGLES_NETHER_BRICKS_ROOF);
		registerWithBlockItem("shingles_end_stone_bricks_roof", SHINGLES_END_STONE_BRICKS_ROOF);
		registerWithBlockItem("shingles_blackstone_roof", SHINGLES_BLACKSTONE_ROOF);
		registerWithBlockItem("shingles_polished_blackstone_bricks_roof", SHINGLES_POLISHED_BLACKSTONE_BRICKS_ROOF);
		registerWithBlockItem("shingles_terracotta_roof", SHINGLES_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_white_terracotta_roof", SHINGLES_WHITE_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_orange_terracotta_roof", SHINGLES_ORANGE_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_magenta_terracotta_roof", SHINGLES_MAGENTA_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_light_blue_terracotta_roof", SHINGLES_LIGHT_BLUE_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_yellow_terracotta_roof", SHINGLES_YELLOW_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_lime_terracotta_roof", SHINGLES_LIME_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_pink_terracotta_roof", SHINGLES_PINK_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_gray_terracotta_roof", SHINGLES_GRAY_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_light_gray_terracotta_roof", SHINGLES_LIGHT_GRAY_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_cyan_terracotta_roof", SHINGLES_CYAN_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_purple_terracotta_roof", SHINGLES_PURPLE_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_blue_terracotta_roof", SHINGLES_BLUE_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_brown_terracotta_roof", SHINGLES_BROWN_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_green_terracotta_roof", SHINGLES_GREEN_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_red_terracotta_roof", SHINGLES_RED_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_black_terracotta_roof", SHINGLES_BLACK_TERRACOTTA_ROOF);
		registerWithBlockItem("shingles_white_concrete_roof", SHINGLES_WHITE_CONCRETE_ROOF);
		registerWithBlockItem("shingles_orange_concrete_roof", SHINGLES_ORANGE_CONCRETE_ROOF);
		registerWithBlockItem("shingles_magenta_concrete_roof", SHINGLES_MAGENTA_CONCRETE_ROOF);
		registerWithBlockItem("shingles_light_blue_concrete_roof", SHINGLES_LIGHT_BLUE_CONCRETE_ROOF);
		registerWithBlockItem("shingles_yellow_concrete_roof", SHINGLES_YELLOW_CONCRETE_ROOF);
		registerWithBlockItem("shingles_lime_concrete_roof", SHINGLES_LIME_CONCRETE_ROOF);
		registerWithBlockItem("shingles_pink_concrete_roof", SHINGLES_PINK_CONCRETE_ROOF);
		registerWithBlockItem("shingles_gray_concrete_roof", SHINGLES_GRAY_CONCRETE_ROOF);
		registerWithBlockItem("shingles_light_gray_concrete_roof", SHINGLES_LIGHT_GRAY_CONCRETE_ROOF);
		registerWithBlockItem("shingles_cyan_concrete_roof", SHINGLES_CYAN_CONCRETE_ROOF);
		registerWithBlockItem("shingles_purple_concrete_roof", SHINGLES_PURPLE_CONCRETE_ROOF);
		registerWithBlockItem("shingles_blue_concrete_roof", SHINGLES_BLUE_CONCRETE_ROOF);
		registerWithBlockItem("shingles_brown_concrete_roof", SHINGLES_BROWN_CONCRETE_ROOF);
		registerWithBlockItem("shingles_green_concrete_roof", SHINGLES_GREEN_CONCRETE_ROOF);
		registerWithBlockItem("shingles_red_concrete_roof", SHINGLES_RED_CONCRETE_ROOF);
		registerWithBlockItem("shingles_black_concrete_roof", SHINGLES_BLACK_CONCRETE_ROOF);

		registerWithBlockItem("shingles_stone_roof_cap", SHINGLES_STONE_ROOF_CAP);
		registerWithBlockItem("shingles_cobblestone_roof_cap", SHINGLES_COBBLESTONE_ROOF_CAP);
		registerWithBlockItem("shingles_stone_bricks_roof_cap", SHINGLES_STONE_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_andesite_roof_cap", SHINGLES_ANDESITE_ROOF_CAP);
		registerWithBlockItem("shingles_polished_andesite_roof_cap", SHINGLES_POLISHED_ANDESITE_ROOF_CAP);
		registerWithBlockItem("shingles_diorite_roof_cap", SHINGLES_DIORITE_ROOF_CAP);
		registerWithBlockItem("shingles_polished_diorite_roof_cap", SHINGLES_POLISHED_DIORITE_ROOF_CAP);
		registerWithBlockItem("shingles_granite_roof_cap", SHINGLES_GRANITE_ROOF_CAP);
		registerWithBlockItem("shingles_polished_granite_roof_cap", SHINGLES_POLISHED_GRANITE_ROOF_CAP);
		registerWithBlockItem("shingles_deepslate_roof_cap", SHINGLES_DEEPSLATE_ROOF_CAP);
		registerWithBlockItem("shingles_cobbled_deepslate_roof_cap", SHINGLES_COBBLED_DEEPSLATE_ROOF_CAP);
		registerWithBlockItem("shingles_polished_deepslate_roof_cap", SHINGLES_POLISHED_DEEPSLATE_ROOF_CAP);
		registerWithBlockItem("shingles_deepslate_bricks_roof_cap", SHINGLES_DEEPSLATE_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_deepslate_tiles_roof_cap", SHINGLES_DEEPSLATE_TILES_ROOF_CAP);
		registerWithBlockItem("shingles_sandstone_roof_cap", SHINGLES_SANDSTONE_ROOF_CAP);
		registerWithBlockItem("shingles_smooth_sandstone_roof_cap", SHINGLES_SMOOTH_SANDSTONE_ROOF_CAP);
		registerWithBlockItem("shingles_red_sandstone_roof_cap", SHINGLES_RED_SANDSTONE_ROOF_CAP);
		registerWithBlockItem("shingles_smooth_red_sandstone_roof_cap", SHINGLES_SMOOTH_RED_SANDSTONE_ROOF_CAP);
		registerWithBlockItem("shingles_smooth_quartz_roof_cap", SHINGLES_SMOOTH_QUARTZ_ROOF_CAP);
		registerWithBlockItem("shingles_quartz_bricks_roof_cap", SHINGLES_QUARTZ_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_bricks_roof_cap", SHINGLES_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_nether_bricks_roof_cap", SHINGLES_NETHER_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_end_stone_bricks_roof_cap", SHINGLES_END_STONE_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_blackstone_roof_cap", SHINGLES_BLACKSTONE_ROOF_CAP);
		registerWithBlockItem("shingles_polished_blackstone_bricks_roof_cap", SHINGLES_POLISHED_BLACKSTONE_BRICKS_ROOF_CAP);
		registerWithBlockItem("shingles_terracotta_roof_cap", SHINGLES_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_white_terracotta_roof_cap", SHINGLES_WHITE_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_orange_terracotta_roof_cap", SHINGLES_ORANGE_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_magenta_terracotta_roof_cap", SHINGLES_MAGENTA_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_light_blue_terracotta_roof_cap", SHINGLES_LIGHT_BLUE_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_yellow_terracotta_roof_cap", SHINGLES_YELLOW_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_lime_terracotta_roof_cap", SHINGLES_LIME_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_pink_terracotta_roof_cap", SHINGLES_PINK_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_gray_terracotta_roof_cap", SHINGLES_GRAY_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_light_gray_terracotta_roof_cap", SHINGLES_LIGHT_GRAY_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_cyan_terracotta_roof_cap", SHINGLES_CYAN_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_purple_terracotta_roof_cap", SHINGLES_PURPLE_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_blue_terracotta_roof_cap", SHINGLES_BLUE_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_brown_terracotta_roof_cap", SHINGLES_BROWN_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_green_terracotta_roof_cap", SHINGLES_GREEN_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_red_terracotta_roof_cap", SHINGLES_RED_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_black_terracotta_roof_cap", SHINGLES_BLACK_TERRACOTTA_ROOF_CAP);
		registerWithBlockItem("shingles_white_concrete_roof_cap", SHINGLES_WHITE_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_orange_concrete_roof_cap", SHINGLES_ORANGE_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_magenta_concrete_roof_cap", SHINGLES_MAGENTA_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_light_blue_concrete_roof_cap", SHINGLES_LIGHT_BLUE_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_yellow_concrete_roof_cap", SHINGLES_YELLOW_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_lime_concrete_roof_cap", SHINGLES_LIME_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_pink_concrete_roof_cap", SHINGLES_PINK_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_gray_concrete_roof_cap", SHINGLES_GRAY_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_light_gray_concrete_roof_cap", SHINGLES_LIGHT_GRAY_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_cyan_concrete_roof_cap", SHINGLES_CYAN_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_purple_concrete_roof_cap", SHINGLES_PURPLE_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_blue_concrete_roof_cap", SHINGLES_BLUE_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_brown_concrete_roof_cap", SHINGLES_BROWN_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_green_concrete_roof_cap", SHINGLES_GREEN_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_red_concrete_roof_cap", SHINGLES_RED_CONCRETE_ROOF_CAP);
		registerWithBlockItem("shingles_black_concrete_roof_cap", SHINGLES_BLACK_CONCRETE_ROOF_CAP);


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
