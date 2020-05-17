package com.udit.chainofresp;

public class FactorialProcessor extends NumberProcessor {

	public FactorialProcessor(int number) {
		super(number);
	}

	@Override
	public void process() {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= 1;
		}
		System.out.println("Factorial = " + factorial);
		super.process();
	}

}
