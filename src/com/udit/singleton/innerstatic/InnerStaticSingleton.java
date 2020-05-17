package com.udit.singleton.innerstatic;

/**
 * This approach guarantees thread safety and it is much more concise
 * 
 * @author udmishra
 *
 */
public class InnerStaticSingleton {

	private InnerStaticSingleton() {
	}

	private static class Impl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}

	public static InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}

}
