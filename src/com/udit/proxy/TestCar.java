package com.udit.proxy;

public class TestCar {

	public static void main(String[] args) {
		
		Driver d = new Driver("Udit", 28);
		Drivable car = new Car(d);
		car.drive();
		
		/**
		 * So far so good.
		 * Now, let's try to drive a car with an underAge driver.
		 * 
		 * It is able to drive, which shouldn't happened.
		 */
		
		Driver young = new Driver("Ayush", 15);
		Drivable car2 = new Car(young);
		car2.drive();
		
		/**
		 * We want the car to be driven only if drivers age > 18
		 * yet we do not want to modify the Original Car Object
		 * 
		 * Proxy comes to rescue here
		 */
		
		Drivable car3 = new ProxyCar(young);
		car3.drive();
	}
	
	
}
