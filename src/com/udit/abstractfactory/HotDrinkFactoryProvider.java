package com.udit.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class HotDrinkFactoryProvider {

	private static Map<BeverageType, HotDrinkFactory> factoris = new HashMap<>();
	
	static {
		factoris.put(BeverageType.TEA, new TeaFactory());
		factoris.put(BeverageType.COFFEE, new CoffeeFactory());
	}
	
	private HotDrinkFactoryProvider() {
	}

	public static HotDrinkFactory getFactory(BeverageType type) {
		return factoris.get(type);
	}
}
