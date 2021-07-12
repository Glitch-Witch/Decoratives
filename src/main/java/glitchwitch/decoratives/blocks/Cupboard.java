package glitchwitch.decoratives.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Cupboard extends HorizontalFacingBlock {

	public Cupboard() {
		super(FabricBlockSettings.of(Material.WOOD).strength(1).nonOpaque().solidBlock((i, j, k)-> false));
		setDefaultState(
			this.stateManager.getDefaultState()
				.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
				.with(Properties.OPEN, false)
		);
	}

	@Override
	@SuppressWarnings("deprecation")
	public VoxelShape getOutlineShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
		Direction dir = state.get(FACING);
		return switch (dir) {
			case NORTH -> Block.createCuboidShape(0, 0, 0, 16, 16, 13);
			case SOUTH -> Block.createCuboidShape(0, 0, 3, 16, 16, 16);
			case EAST -> Block.createCuboidShape(3, 0, 0, 16, 16, 16);
			case WEST -> Block.createCuboidShape(0, 0, 0, 13, 16, 16);
			default -> Block.createCuboidShape(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(Properties.HORIZONTAL_FACING);
		stateManager.add(Properties.OPEN);
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing());
	}

	@Override
	@SuppressWarnings("deprecation")
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		boolean open = state.get(Properties.OPEN);
		world.setBlockState(pos, state.with(Properties.OPEN, !open));
		return ActionResult.SUCCESS;
	}

}
