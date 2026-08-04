package com.Interface;

public class AllInOnePrinter implements Printer1, Scanner {

	@Override
	public void scanDocument() {
		System.out.println("Documents Scanned Succesfylly");
	}

	@Override
	public void printDocument() {
		System.out.println("Document Print Sucessfully");
		
	}

}
