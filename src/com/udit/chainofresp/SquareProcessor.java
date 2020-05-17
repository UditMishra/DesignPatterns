package com.udit.chainofresp;

public class SquareProcessor extends NumberProcessor {

	public SquareProcessor(int number) {
		super(number);
	}

	@Override
	public void process() {
		System.out.println("Square = " + (number * number));
		super.process();
	}

}
