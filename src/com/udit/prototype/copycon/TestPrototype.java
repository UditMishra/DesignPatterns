package com.udit.prototype.copycon;

public class TestPrototype {

	public static void main(String[] args) {

		Address address = new Address("North First Street", 105);
		String[] names = { "Udit", "Mishra"};
		
		Person udit = new Person(names, address);
		
		System.out.println(udit);
		
		System.out.println("\nAfter copying, printing copied object\n");
		
		Person amit = new Person(udit);
		
		System.out.println(amit);
		
		amit.getNames()[0] = "Amit";
		amit.getNames()[1]= "Jha";
		
		amit.getAddress().setStreetName("New Street");
		amit.getAddress().setHouseNo(301);
		
		System.out.println("\nAfter changing the copied object, printing copied and original object\n");

		System.out.println(amit);
		System.out.println(udit);
	}

}
