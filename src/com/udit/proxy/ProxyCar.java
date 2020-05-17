package com.udit.proxy;

public class ProxyCar extends Car {

	public ProxyCar(Driver driver) {
		super(driver);
	}

	@Override
	public void drive() {
		if (driver.getAge() >= 18) {
			super.drive();
		} else {
			System.out.println("Sorry, Car can not be driven as driver is too young ! Details - " + driver);
		}
	}

}
