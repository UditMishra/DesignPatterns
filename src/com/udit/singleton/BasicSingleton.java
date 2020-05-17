package com.udit.singleton;

import java.io.Serializable;

/**
 * Basic Singleton, but it has race conditions and serialization issues
 * 
 * @author udmishra
 *
 */
class BasicSingleton implements Serializable {

	private static final long serialVersionUID = 8062420744913769593L;
	private static final BasicSingleton INSTANCE = new BasicSingleton();

	private BasicSingleton() {
	}

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	/**
	 * This method fixes de-serialization issues 
	 */
//	protected Object readResolve() {
//		return INSTANCE;
//	}

}