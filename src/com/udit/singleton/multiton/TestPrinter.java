package com.udit.singleton.multiton;

public class TestPrinter {

	public static void main(String[] args) {

		Printer p1 = Printer.getPrinter(PrinterType.DOT_MATRIX);
		Printer p2 = Printer.getPrinter(PrinterType.LED);
		Printer p3 = Printer.getPrinter(PrinterType.LASER);
		Printer p4 = Printer.getPrinter(PrinterType.LASER);
		Printer p5 = Printer.getPrinter(PrinterType.DOT_MATRIX);
		Printer p6 = Printer.getPrinter(PrinterType.LED);

		System.out.println(p1 == p5);
		System.out.println(p2 == p6);
		System.out.println(p3 == p4);

	}
}
