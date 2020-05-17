package com.udit.singleton.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * Multion which means it has fixed set of unique Printer instances, that too
 * are being loaded lazily
 * 
 * @author udmishra
 *
 */
public class Printer {

	private static int instanceCount = 0;

	private Printer() {
		instanceCount++;
		System.out.println(instanceCount + " instances created so far !");
	}

	private static Map<PrinterType, Printer> printers = new HashMap<>();

	public static Printer getPrinter(PrinterType type) {

		Printer printer = printers.get(type);

		if (printer == null) {
			printer = new Printer();
			printers.put(type, printer);
		}

		return printer;
	}
}
