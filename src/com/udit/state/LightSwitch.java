package com.udit.state;

public class LightSwitch {

	private State state;

	public LightSwitch() {
		state = new OffState();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return this.state;
	}
	
	public void on() {
		this.state.on(this);
	}
	
	public void off() {
		this.state.off(this);
	}
}
