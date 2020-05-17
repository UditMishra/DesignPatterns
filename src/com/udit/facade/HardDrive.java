package com.udit.facade;

public class HardDrive {

	public byte[] read(int start, int end) {
		System.out.println("Reading from Boot Sector " + start + " till " + (start + end));
		return "Program File Details".getBytes();
	}
}
