package dev.emi.trinkets.api.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.item.Item;

public class TrinketRendererRegistry {

	private static final Map<Item, TrinketRenderer> RENDERERS = new HashMap<>();

	public static void registerRenderer(Item item, TrinketRenderer trinketRenderer) {
		RENDERERS.put(item, trinketRenderer);
	}

	public static Optional<TrinketRenderer> getRenderer(Item item) {
		return Optional.ofNullable(RENDERERS.get(item));
	}
}