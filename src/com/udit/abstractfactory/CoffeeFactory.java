package com.udit.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		
		System.out.println("Grinding Beans...");
		System.out.println("Boiling Water...");
		System.out.println("Pouring " + amount + " ml...");
		System.out.println("Adding Cream and Sugar...");
		System.out.println("Coffee is Ready !!");
		System.out.println("-----------------------");
		
		return new Coffee();
	}

}
