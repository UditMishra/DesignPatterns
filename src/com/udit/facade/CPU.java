package com.udit.facade;

public class CPU {

	public void freeze() {
		System.out.println("Freezed");
	}

	public void jump(int position) {
		System.out.println("Jumping to Address - " + position);
	}

	public void execute() {
		System.out.println("Executing the program");
	}
}
