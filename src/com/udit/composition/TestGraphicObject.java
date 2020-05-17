package com.udit.composition;

public class TestGraphicObject {

	public static void main(String[] args) {
		
		/**
		 * In all below examples, we are using draw() uniformly
		 * irrespective of whether the type of object is Circle or Square
		 * or a list or any combination.
		 */
		Circle c1 = new Circle("Blue");
		Circle c2 = new Circle("Red");
		
		GraphicObject circleList = new GraphicObject();
		circleList.setName("Circle List");
		
		circleList.getChildren().add(c1);
		circleList.getChildren().add(c2);
		
		Square s1 = new Square("Yellow");
		Square s2 = new Square("Green");
		
		GraphicObject squareList = new GraphicObject();
		squareList.setName("Sqaure List");
		
		squareList.getChildren().add(s1);
		squareList.getChildren().add(s2);
		
		System.out.println("Drawing Circle List");
		System.out.println("-----------------------");
		circleList.draw();
		System.out.println("-----------------------");
		
		System.out.println("Drawing Sqaure List");
		System.out.println("-----------------------");
		squareList.draw();
		System.out.println("-----------------------");
		
		GraphicObject drawingBoard = new GraphicObject();
		drawingBoard.setName("Drawing Board");
		
		drawingBoard.getChildren().add(circleList);
		drawingBoard.getChildren().add(squareList);
		
		System.out.println("Drawing Board");
		System.out.println("-----------------------");
		drawingBoard.draw();
		System.out.println("-----------------------");
		
		
	}
}
