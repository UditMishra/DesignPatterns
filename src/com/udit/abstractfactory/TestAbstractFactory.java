package com.udit.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		HotDrinkFactory f1 = HotDrinkFactoryProvider.getFactory(BeverageType.TEA);
		HotDrink d1 = f1.prepare(30);
		d1.consume();
		
		System.out.println("-----------------------");
		
		HotDrinkFactory f2 = HotDrinkFactoryProvider.getFactory(BeverageType.COFFEE);
		HotDrink d2 = f2.prepare(40);
		d2.consume();
	}
}
