package com.udit.singleton.innerstatic;

public class TestInnerStaticSingleton {

	public static void main(String[] args) {
		InnerStaticSingleton instance = InnerStaticSingleton.getInstance();
		InnerStaticSingleton instance2 = InnerStaticSingleton.getInstance();
		System.out.println(instance == instance2);
	}
}
