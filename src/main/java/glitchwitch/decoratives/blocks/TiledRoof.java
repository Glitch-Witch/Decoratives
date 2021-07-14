package glitchwitch.decoratives.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class TiledRoof extends HorizontalFacingBlock {

	public TiledRoof() {
		super(FabricBlockSettings.of(Material.WOOD).hardness(1f));
		setDefaultState(
			this.stateManager.getDefaultState()
				.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
		);
	}

	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		Direction dir = state.get(FACING);
		return switch (dir) {
			case NORTH -> Block.createCuboidShape(0, -1, -6, 16, 3, 16);
			case SOUTH -> Block.createCuboidShape(0, 0, -3, 16, 22, 1);
			case EAST -> Block.createCuboidShape(3, 0, 0, 16, 16, 16);
			case WEST -> Block.createCuboidShape(0, 0, 0, 13, 16, 16);
			default -> Block.createCuboidShape(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(Properties.HORIZONTAL_FACING);
	}


	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing());
	}

}