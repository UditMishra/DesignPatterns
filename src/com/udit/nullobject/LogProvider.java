package com.udit.nullobject;

import java.util.Random;

/**
 * This class is simulating runtime dependency which could be null sometimes.
 * 
 * In normal cases i.e. if random value is found to be 1, it returns Log implementation.
 * 
 * However, it returns null, if random value is found to be 0
 * 
 * @author udmishra
 *
 */
public class LogProvider {

	public static Log getLog() {
		int random = new Random().nextInt(2);
		return random == 0 ? null : new ConsoleLog();
	}
}
