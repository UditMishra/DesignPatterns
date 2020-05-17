package com.udit.chainofresp;

public class TestNumberProcessors {

	public static void main(String[] args) {

		int number = 10;
		
		NumberProcessor nm = new EvenProcessor(number);
		nm.addProcessor(new SquareProcessor(number));
		nm.addProcessor(new FactorialProcessor(number));
		
		nm.process();
		System.out.println("------------------------");
		
		/**
		 * The above chain is loosely coupled i.e. we can rearrange the order
		 * 
		 */
		
		nm = new SquareProcessor(number);
		nm.addProcessor(new FactorialProcessor(number));
		nm.addProcessor(new EvenProcessor(number));
		
		nm.process();
		
		/**
		 * The disadvantages with this design pattern is that it can get broken -
		 * 		1. if a processor fails to call the next processor, the command gets dropped
		 * 		2. if a processor calls the wrong processor, it can lead to a cycle
		 */
		
	}

}
