package glitchwitch.decoratives.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class Shutters extends DoorBlock {
	public Shutters() {
		super(FabricBlockSettings.of(Material.WOOD).hardness(1f).nonOpaque());
	}

	@Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) { return true; }
}
