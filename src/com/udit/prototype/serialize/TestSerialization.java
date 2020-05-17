package com.udit.prototype.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Foo f = new Foo(32, new String[] {"something", "anything"});
		
		Foo f2 = null;
		
		File file = new File("foo.data");
		
		try(
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) 
		{
			oout.writeObject(f);
			f2 = (Foo) oin.readObject();
		}
		
		System.out.println(f2);
		
		f2.getData()[0] = "everything";
		f2.getData()[1] = "nothing";
		
		System.out.println("\nAfter changing the deserialized object, printing deserialized and original object");
		System.out.println(f2);
		System.out.println(f);
		
	}
}
