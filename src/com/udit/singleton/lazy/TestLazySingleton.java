package com.udit.singleton.lazy;

public class TestLazySingleton {

	public static void main(String[] args) {
		
		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		
		System.out.println(instance == instance2);
	}
}
