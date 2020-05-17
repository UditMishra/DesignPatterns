package com.udit.abstractfactory;

public class Coffee implements HotDrink {

	@Override
	public void consume() {
		System.out.println("This Coffee is delicious !");
	}

}
