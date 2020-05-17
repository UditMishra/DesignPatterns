package com.udit.singleton.doublecheck;

public class TestDoubleCheckLockingSingleton {

	public static void main(String[] args) {
		DoubleCheckLockingSingleton instance = DoubleCheckLockingSingleton.getInstance();
		DoubleCheckLockingSingleton instance2 = DoubleCheckLockingSingleton.getInstance();
		System.out.println(instance == instance2);
	}
}
