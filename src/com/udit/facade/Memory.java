package com.udit.facade;

public class Memory {

	public void load(int position, byte[] data) {
		System.out.println("Loaded Program in memory at Address - " + position + ", data - " + new String(data));
	}
}
