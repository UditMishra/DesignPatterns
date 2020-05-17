package com.udit.bridge;

public class Triangle extends Shape {

	public Triangle(Renderer r) {
		super(r);
	}

	@Override
	public String getName() {
		return "Triangle";
	}

}
