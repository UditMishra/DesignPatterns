package com.udit.singleton.lazy;

/**
 * You create instance when asked for it.
 * It also suffers with same issues as of BasicSingleton
 * 
 * @author udmishra
 *
 */
public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	}

	/**
	 * This method can be marked as synchronized which will solve race condition issue.
	 * But, marking an entire method is an over killing. 
	 */
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
