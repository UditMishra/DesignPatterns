package com.udit.facade;

public class TestComputer {

	public static void main(String[] args) {
		Computer c = new Computer();
		/**
		 * This method provides a simple abstraction for starting a Computer. There are
		 * lot of things happening behind the scene, but those details are hidden from
		 * the caller.
		 * 
		 */
		c.start();
	}

}
