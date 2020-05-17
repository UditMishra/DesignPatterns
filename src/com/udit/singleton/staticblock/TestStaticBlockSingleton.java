package com.udit.singleton.staticblock;

public class TestStaticBlockSingleton {

	public static void main(String[] args) {
		
		StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		System.out.println(instance == instance2);
	}
}
