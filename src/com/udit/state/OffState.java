package com.udit.state;

public class OffState extends State {

	public OffState() {
		System.out.println("Light is switched off");
	}
	
	public void on(LightSwitch ls) {
		System.out.println("Swithing Light to On...");
		ls.setState(new OnState());
	}
}
