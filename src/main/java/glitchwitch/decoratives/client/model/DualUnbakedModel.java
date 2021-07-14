package glitchwitch.decoratives.client.model;

import java.util.function.Function;
import java.util.Collection;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import com.mojang.datafixers.util.Pair;

import net.minecraft.util.Identifier;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelBakeSettings;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.UnbakedModel;

public class DualUnbakedModel implements UnbakedModel {
	private final UnbakedModel solidModel;
	private final UnbakedModel translucentModel;

	public DualUnbakedModel(UnbakedModel solidModel, UnbakedModel translucentModel) {
		this.solidModel = solidModel;
		this.translucentModel = translucentModel;
	}

	@Override
	public Collection<Identifier> getModelDependencies() {
		ImmutableSet.Builder<Identifier> builder = ImmutableSet.builder();
		builder.addAll(solidModel.getModelDependencies());
		builder.addAll(translucentModel.getModelDependencies());
		return builder.build();
	}

	@Override
	public Collection<SpriteIdentifier> getTextureDependencies(Function<Identifier, UnbakedModel> unbakedModelGetter,
															   Set<Pair<String, String>> unresolvedTextureReferences) {
		ImmutableSet.Builder<SpriteIdentifier> builder = ImmutableSet.builder();
		builder.addAll(solidModel.getTextureDependencies(unbakedModelGetter, unresolvedTextureReferences));
		builder.addAll(translucentModel.getTextureDependencies(unbakedModelGetter, unresolvedTextureReferences));
		return builder.build();
	}

	@Override
	public BakedModel bake(ModelLoader loader,
						   Function<SpriteIdentifier, Sprite> textureGetter,
						   ModelBakeSettings rotationContainer,
						   Identifier modelId) {
		return new DualBakedModel(
				solidModel.bake(loader, textureGetter, rotationContainer, modelId),
				translucentModel.bake(loader, textureGetter, rotationContainer, modelId)
		);
	}
}
