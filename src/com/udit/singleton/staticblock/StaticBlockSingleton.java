package com.udit.singleton.staticblock;

/**
 * When constructor can throw exception, this is used to overcome
 * It also suffers with same issues as of BasicSingleton
 * 
 * @author udmishra
 *
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	private String data;

	private StaticBlockSingleton(String data) throws Exception {
		if (data.contentEquals("Unsafe")) {
			throw new RuntimeException("Unsafe data, could not create instance !");
		}
		this.data = data;
	}

	static {
		try {
			instance = new StaticBlockSingleton("Unsafe");
			System.out.println("Object created successfully, data = " + instance.data);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Retrying for Object creation");
		try {
			instance = new StaticBlockSingleton("safe");
			System.out.println("Object created successfully, data = " + instance.data);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
