package com.udit.flyweight;

import java.util.WeakHashMap;

/**
 * Flyweight pattern tries to minimize the space by caching objects. 
 * Here, we're caching CoffeeFlavor objects
 * 
 * @author udmishra
 *
 */
public class CoffeeFlavor {

	private final String name;
	private static final WeakHashMap<String, CoffeeFlavor> cache = new WeakHashMap<>();

	private CoffeeFlavor(String name) {
		this.name = name;
	}

	public static CoffeeFlavor getCoffeeFlavor(String name) {
		synchronized (cache) {
			return cache.computeIfAbsent(name, CoffeeFlavor::new);
		}
	}

	public static int getCacheSize() {
		synchronized (cache) {
			return cache.size();
		}
	}

	@Override
	public String toString() {
		return name;
	}

}
