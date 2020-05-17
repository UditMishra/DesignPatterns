package com.udit.decorator;

/**
 * Adding transparency as feature to existing Shape
 * 
 * @author udmishra
 *
 */
public class TransparentShape implements Shape {

	private Shape s;
	private int transparency;

	public TransparentShape(Shape s, int transparency) {
		this.s = s;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return s.info() + " and Transaprency " + this.transparency;
	}
}
