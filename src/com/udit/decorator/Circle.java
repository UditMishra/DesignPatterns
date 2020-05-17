package com.udit.decorator;

/**
 * This is a concrete implementation of shape
 * 
 * @author udmishra
 *
 */
public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String info() {
		return "Circle with radius " + this.radius;
	}

}
