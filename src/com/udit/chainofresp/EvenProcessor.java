package com.udit.chainofresp;

public class EvenProcessor extends NumberProcessor {

	public EvenProcessor(int number) {
		super(number);
	}

	@Override
	public void process() {
		if (number % 2 == 0) {
			System.out.println("Number is Even");
		}
		super.process();
	}

}
