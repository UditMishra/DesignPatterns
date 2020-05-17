package com.udit.nullobject;

/**
 * Concrete implementation of Log interface. It does the actual work
 * 
 * @author udmishra
 *
 */
public class ConsoleLog implements Log {

	@Override
	public void info(String msg) {
		System.out.println("INFO : " + msg);
	}

	@Override
	public void error(String msg) {
		System.out.println("ERROR : " + msg);
	}

}
