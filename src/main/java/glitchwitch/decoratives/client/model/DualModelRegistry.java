package glitchwitch.decoratives.client.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class DualModelRegistry {
	public static DualModelRegistry INSTANCE = new DualModelRegistry();

	protected final List<Registration> registrations = new ArrayList<>();
	protected final Set<Identifier> allMatches = new HashSet<>();

	public void addRegistration(Identifier solidModel, Identifier translucentModel, Identifier match, Identifier... extraMatches) {
		checkDuplicateMatch(match);
		for (Identifier extraMatch : extraMatches) {
			checkDuplicateMatch(extraMatch);
		}
		registrations.add(new Registration(solidModel, translucentModel, match, extraMatches));
	}

	protected void checkDuplicateMatch(Identifier match) {
		if (!allMatches.add(match)) {
			throw new IllegalArgumentException("Cannot add another registration for model \"" + match + "\"!");
		}
	}

	public void init() {
		ModelLoadingRegistry.INSTANCE.registerResourceProvider(manager -> (id, context) -> {
			for (Registration registration : registrations) {
				if (id.equals(registration.match)) {
					UnbakedModel solidModel = context.loadModel(registration.solidModel);
					UnbakedModel translucentModel = context.loadModel(registration.translucentModel);
					return new DualUnbakedModel(solidModel, translucentModel);
				}
				if (ArrayUtils.contains(registration.extraMatches, id)) {
					return context.loadModel(registration.match);
				}
			}
			return null;
		});
	}

	protected static class Registration {
		protected Identifier solidModel;
		protected Identifier translucentModel;
		protected Identifier match;
		protected Identifier[] extraMatches;

		protected Registration(Identifier solidModel, Identifier translucentModel, Identifier match, Identifier... extraMatches) {
			this.solidModel = solidModel;
			this.translucentModel = translucentModel;
			this.match = match;
			this.extraMatches = extraMatches;
		}
	}
}
