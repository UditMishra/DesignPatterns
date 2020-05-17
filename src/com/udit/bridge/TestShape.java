package com.udit.bridge;

public class TestShape {

	public static void main(String[] args) {
		
		/**
		 * Here, we have achieved 4 different behaviors, yet we have not created 4 different classes.
		 * Shape can evolve independently without affecting the Renderer and vice-versa.
		 * 
		 */
		Shape s1 = new Square(new VectorRenderer());
		System.out.println(s1);
		
		Shape s2 = new Square(new RasterRenderer());
		System.out.println(s2);
		
		Shape t1 = new Triangle(new VectorRenderer());
		System.out.println(t1);
		
		Shape t2 = new Triangle(new RasterRenderer());
		System.out.println(t2);
		
	}
}
