package com.udit.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBasicSingleton {

	public static void main(String[] args) {
		basicTest();
		try {
			breakSingleTon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void basicTest() {
		BasicSingleton instance = BasicSingleton.getInstance();
		instance.setVal(10);

		BasicSingleton instance2 = BasicSingleton.getInstance();

		System.out.println(instance == instance2);
		System.out.println(instance.getVal());
		System.out.println(instance2.getVal());
	}

	private static void breakSingleTon() throws Exception {

		BasicSingleton instance = BasicSingleton.getInstance();
		instance.setVal(99);

		String fileName = "basic.data";

		writeToFile(fileName, instance);
		BasicSingleton instance2 = readFromFile(fileName);

		System.out.println(instance == instance2);
		System.out.println(instance.getVal());
		System.out.println(instance2.getVal());
	}

	private static BasicSingleton readFromFile(String fileName) throws Exception {
		try (FileInputStream fin = new FileInputStream(new File(fileName));
				ObjectInputStream oin = new ObjectInputStream(fin)) {
			return (BasicSingleton) oin.readObject();
		}
	}

	private static void writeToFile(String fileName, BasicSingleton instance) throws Exception {
		try (FileOutputStream fout = new FileOutputStream(new File(fileName));
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			oout.writeObject(instance);
		}
	}
}
