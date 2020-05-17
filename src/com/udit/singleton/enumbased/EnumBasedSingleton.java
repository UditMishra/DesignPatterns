package com.udit.singleton.enumbased;

/**
 * Enum solves both the problems of race conditions and deserialization but it
 * is not effectively seralizable as in it does not serializes the state. It
 * just serializes the Enum constant
 * 
 * @author udmishra
 *
 */
public enum EnumBasedSingleton {

	INSTANCE;

	EnumBasedSingleton() {
		val = 99;
	}

	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}
