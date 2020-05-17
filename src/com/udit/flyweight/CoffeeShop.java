package com.udit.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	private List<Order> orders = new ArrayList<>();

	public void takeOrder(String flavorName, int tableNumber) {
		orders.add(Order.of(flavorName, tableNumber));
	}

	public void service() {
		orders.forEach(Order::serve);
	}
}
