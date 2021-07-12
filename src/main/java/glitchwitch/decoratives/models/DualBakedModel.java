package glitchwitch.decoratives.models;

import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.material.BlendMode;
import net.fabricmc.fabric.api.renderer.v1.material.MaterialFinder;
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;

import net.minecraft.block.BlockState;

import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;

import net.minecraft.item.ItemStack;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import net.minecraft.world.BlockRenderView;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;
import java.util.function.Supplier;

public class DualBakedModel extends ForwardingBakedModel {

		private static final ThreadLocal<MeshBuilder> MESH_BUILDER = ThreadLocal.withInitial(()->
			RendererAccess.INSTANCE.getRenderer().meshBuilder()
		);

		private static final ThreadLocal<MaterialFinder> MATERIAL_FINDER = ThreadLocal.withInitial(()->
			RendererAccess.INSTANCE.getRenderer().materialFinder()
		);

		private static final Direction[] CULL_FACES = ArrayUtils.add(Direction.values(), null);

		private final BakedModel solidModel;
		private final BakedModel translucentModel;

		protected Mesh solidMesh;
		protected Mesh translucentMesh;

		public DualBakedModel(BakedModel solidModel, BakedModel translucentModel) {
			this.solidModel = solidModel;
			this.translucentModel = translucentModel;
			wrapped = this.solidModel;
			initMeshes();
		}

		protected void initMeshes() {
			MaterialFinder finder = MATERIAL_FINDER.get();
			RenderMaterial solid = finder.blendMode(0, BlendMode.SOLID).find();
			RenderMaterial translucent = finder.blendMode(0, BlendMode.TRANSLUCENT).find();

			MeshBuilder builder = MESH_BUILDER.get();
			QuadEmitter emitter = builder.getEmitter();

			modelToMesh(solidModel, emitter, solid);
			solidMesh = builder.build();
			modelToMesh(translucentModel, emitter, translucent);
			translucentMesh = builder.build();
		}

		public static void modelToMesh(BakedModel model, QuadEmitter emitter, RenderMaterial material) {
			for (Direction cullFace : CULL_FACES) {
				for (BakedQuad quad : model.getQuads(null, cullFace, null)) {
					emitter.fromVanilla(quad, material, cullFace);
					emitter.emit();
				}
			}
		}

		@Override
		public void emitBlockQuads(BlockRenderView blockView,
								   BlockState state,
								   BlockPos pos,
								   Supplier<Random> randomSupplier,
								   RenderContext context) {
			context.meshConsumer().accept(solidMesh);
			context.meshConsumer().accept(translucentMesh);
		}

		@Override
		public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
			context.meshConsumer().accept(solidMesh);
			context.meshConsumer().accept(translucentMesh);
		}

		@Override
		public boolean isVanillaAdapter() {
			return false;
		}
	}
