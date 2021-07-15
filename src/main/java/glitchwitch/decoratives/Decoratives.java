package glitchwitch.decoratives;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Decoratives implements ModInitializer {
	public static final String MODID = "decoratives";
	public static final ItemGroup IG = FabricItemGroupBuilder.build(asId("general"), ()-> new ItemStack(BlockRegistry.BIRCH_CUPBOARD));

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
	}

	public static Identifier asId(String path) {
		return new Identifier(MODID, path);
	}
}
