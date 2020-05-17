package com.udit.bridge;

/**
 * Bridge pattern facilitates separate class hierarchies to work together even as they evolve independently.
 * It also solves the problem of creation of additional objects.
 * 
 * @author udmishra
 *
 */
public abstract class Shape {

	private Renderer r;

	public Shape(Renderer r) {
		this.r = r;
	}

	public abstract String getName();

	public String toString() {
		return String.format("Drawing %s as %s", getName(), r.whatToRenderAs());
	}

}
