package com.udit.state;

public class State {

	public void on(LightSwitch ls) {
		System.out.println("Light is already switched on");
	}

	public void off(LightSwitch ls) {
		System.out.println("Light is already switched off");
	}
}
