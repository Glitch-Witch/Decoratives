package glitchwitch.decoratives;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class DecorativesShapes {

	public static final VoxelShape BASIC_SLAB = Block.createCuboidShape(0, 0, 0, 16, 8, 16);
	public static final VoxelShape BASIC_FULL_BLOCK = Block.createCuboidShape(0, 0, 0, 16, 16, 16);
	public static final VoxelShape STAIR_FACING_NORTH = VoxelShapes.combineAndSimplify(
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(0, 8, 0, 16, 16, 8),
		BooleanBiFunction.OR
	);

	public static final VoxelShape STAIR_FACING_SOUTH = VoxelShapes.combineAndSimplify(
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(0, 8, 8, 16, 16, 16),
		BooleanBiFunction.OR
	);

	public static final VoxelShape STAIR_FACING_EAST = VoxelShapes.combineAndSimplify(
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(8, 8, 0, 16, 16, 16),
		BooleanBiFunction.OR
	);

	public static final VoxelShape STAIR_FACING_WEST = VoxelShapes.combineAndSimplify(
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(0, 8, 0, 8, 16, 16),
		BooleanBiFunction.OR
	);
}
