package com.udit.abstractfactory;

public class TeaFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		
		System.out.println("Preparing Tea...");
		System.out.println("Putting Tea Bag...");
		System.out.println("Boiling Water...");
		System.out.println("Pouring " + amount + " ml...");
		System.out.println("Adding Lemon...");
		System.out.println("Tea is Ready !!");
		System.out.println("-----------------------");
		
		return new Tea();
	}

}
