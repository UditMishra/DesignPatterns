package com.udit.state;

public class OnState extends State {

	public OnState() {
		System.out.println("Light is switched on");
	}

	public void off(LightSwitch ls) {
		System.out.println("Swithing Light to Off...");
		ls.setState(new OffState());
	}
}
