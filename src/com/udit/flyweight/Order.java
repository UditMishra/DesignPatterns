package com.udit.flyweight;

public interface Order {

	void serve();

	static Order of(String flavorName, int tableNumber) {
		CoffeeFlavor flavor = CoffeeFlavor.getCoffeeFlavor(flavorName);
		return () -> System.out.println("Serving " + flavor + " to table " + tableNumber);
	}
	
	/**
	 * If any class would have implemented Order interface, it would have given the implementation of serve()
	 * 
	 * serve() takes no argument and returns nothing.
	 * 
	 * We could have created Order from outside like - 
	 * 
	 * Order o = () -> System.out.println("MyOrder");
	 * 
	 * Here, we are creating Order through static method, which tells the behavior.
	 * 
	 * The return statement lambda is same as above and hence, it can be returned.
	 * 
	 * Whenever, the serve() will be invoked, that behavior will come into picture, i.e. it will output the details
	 */
}
