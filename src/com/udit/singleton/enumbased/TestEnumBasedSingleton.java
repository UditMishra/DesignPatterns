package com.udit.singleton.enumbased;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEnumBasedSingleton {

	public static void main(String[] args) throws Exception {

		String fileName = "enumbased.data";

		EnumBasedSingleton instance = EnumBasedSingleton.INSTANCE;
		instance.setVal(111);
		writeToFile(fileName, instance);

		EnumBasedSingleton instance2 = readFromFile(fileName);

		/**
		 * Run it once, then comment Line no 15-17, We will find that though we saved
		 * with 111, but we will get 99 when we read from File
		 */
		System.out.println(instance2.getVal());
	}

	private static EnumBasedSingleton readFromFile(String fileName) throws Exception {
		try (FileInputStream fin = new FileInputStream(new File(fileName));
				ObjectInputStream oin = new ObjectInputStream(fin)) {
			return (EnumBasedSingleton) oin.readObject();
		}
	}

	private static void writeToFile(String fileName, EnumBasedSingleton instance) throws Exception {
		try (FileOutputStream fout = new FileOutputStream(new File(fileName));
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			oout.writeObject(instance);
		}
	}
}
