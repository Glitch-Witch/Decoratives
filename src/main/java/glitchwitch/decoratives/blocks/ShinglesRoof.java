package glitchwitch.decoratives.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;

public class ShinglesRoof extends StairsBlock {
	public ShinglesRoof() {
		super(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).nonOpaque());
	}
}
