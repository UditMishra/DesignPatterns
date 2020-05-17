package com.udit.decorator;

/**
 * To add a new feature, first compose the existing i.e. Shape and then add other field
 * 
 * @author udmishra
 *
 */
public class ColoredShape implements Shape {

	private Shape s;
	private String color;

	public ColoredShape(Shape s, String color) {
		this.s = s;
		this.color = color;
	}

	@Override
	public String info() {
		return s.info() + " and Color " + this.color;
	}

}
