package com.udit.singleton.doublecheck;

/**
 * Double check locking resolves race condition issues, but it is an outdated
 * mechanism
 * 
 * @author udmishra
 *
 */
public class DoubleCheckLockingSingleton {

	private static DoubleCheckLockingSingleton instance;

	private DoubleCheckLockingSingleton() {
	}

	public static DoubleCheckLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}
}