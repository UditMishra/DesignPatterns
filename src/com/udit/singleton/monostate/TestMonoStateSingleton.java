package com.udit.singleton.monostate;

public class TestMonoStateSingleton {

	public static void main(String[] args) {

		MonoStateSingleton instance = new MonoStateSingleton();

		instance.setVal(100);
		System.out.println(instance);

		MonoStateSingleton instance2 = new MonoStateSingleton();
		System.out.println(instance2);
	}
}
