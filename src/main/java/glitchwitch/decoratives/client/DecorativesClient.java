package glitchwitch.decoratives.client;

import glitchwitch.decoratives.Decoratives;
import glitchwitch.decoratives.client.model.DualModelRegistry;
import net.fabricmc.api.ClientModInitializer;

public class DecorativesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		cupboardModel("oak_cupboard");
		cupboardModel("birch_cupboard");

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
