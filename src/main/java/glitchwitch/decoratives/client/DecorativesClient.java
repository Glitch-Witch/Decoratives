package glitchwitch.decoratives.client;

import glitchwitch.decoratives.BlockRegistry;
import glitchwitch.decoratives.Decoratives;
import glitchwitch.decoratives.client.model.DualModelRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DecorativesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		cupboardModel("oak_cupboard");
		cupboardModel("birch_cupboard");

		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.SHINGLES_OAK_PLANKS_ROOF, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.SHINGLES_OAK_PLANKS_ROOF_CAP, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.OAK_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.SPRUCE_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BIRCH_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.JUNGLE_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ACACIA_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.DARK_OAK_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CRIMSON_SHUTTERS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.WARPED_SHUTTERS, RenderLayer.getTranslucent());

		DualModelRegistry.INSTANCE.init();
	}

	private static void dualBlockItemModel(String blockItemId, String solidModelPath, String translucentModelPath) {
		DualModelRegistry.INSTANCE.addRegistration(
				Decoratives.asId("block/solid/" + solidModelPath),
				Decoratives.asId("block/translucent/" + translucentModelPath),
				Decoratives.asId("block/" + blockItemId),
				Decoratives.asId("item/" + blockItemId)
		);
	}

	private static void dualBlockModel(String modelPath, String solidModelPath, String translucentModelPath) {
		DualModelRegistry.INSTANCE.addRegistration(
				Decoratives.asId("block/solid/" + solidModelPath),
				Decoratives.asId("block/translucent/" + translucentModelPath),
				Decoratives.asId("block/" + modelPath)
		);
	}

	private static void cupboardModel(String modelPath) {
		dualBlockItemModel(modelPath, modelPath, "cupboard_glass_doors");
		dualBlockModel(modelPath + "_open", modelPath + "_open", "cupboard_glass_doors_open");
	}
}
