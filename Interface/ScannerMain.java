package com.Interface;

public class ScannerMain {
	public static void main(String[] args) {
		Printer1 p1 = new AllInOnePrinter();
		p1.printDocument();

		Scanner s = new AllInOnePrinter();
		s.scanDocument();
	}

}
