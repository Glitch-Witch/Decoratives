package glitchwitch.decoratives;

import glitchwitch.decoratives.models.DualUnbakedModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class DecorativesClient implements ClientModInitializer {
	private static final Identifier ACTUAL_MODEL_ID = new Identifier(Decoratives.MODID, "block/oak_cupboard");
	private static final Identifier SOLID_MODEL_ID = new Identifier(Decoratives.MODID, "block/oak_cupboard");
	private static final Identifier TRANSLUCENT_MODEL_ID = new Identifier(Decoratives.MODID, "block/parents/glass_doors");

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BIRCH_CUPBOARD, RenderLayer.getTranslucent());
//		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.OAK_CUPBOARD,RenderLayer.getTranslucent());

		ModelLoadingRegistry.INSTANCE.registerResourceProvider(manager -> (id, context) -> {
			if (id.equals(ACTUAL_MODEL_ID)) {
				UnbakedModel solidModel = context.loadModel(SOLID_MODEL_ID);
				UnbakedModel translucentModel = context.loadModel(TRANSLUCENT_MODEL_ID);
				return new DualUnbakedModel(solidModel, translucentModel);
			}
			return null;
		});

	}
}
