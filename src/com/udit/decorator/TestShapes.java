package com.udit.decorator;

public class TestShapes {

	public static void main(String[] args) {

		Shape s1 = new Circle(5);
		System.out.println(s1.info());

		/**
		 * This approach aligns with Open/Close principle i.e. here, Shape is closed
		 * to modification but open to extension, hence we have ColoredShape and
		 * TransparentShape, yet they both retain the existing shape functionality.
		 */

		Shape s2 = new ColoredShape(s1, "Blue");
		System.out.println(s2.info());

		Shape s3 = new TransparentShape(s2, 5);
		System.out.println(s3.info());
		
		
		Shape s = new TransparentShape(new ColoredShape(new Circle(5), "Yello"), 9);
		System.out.println(s.info());
	}
}
