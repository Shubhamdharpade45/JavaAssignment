package com.Interface;

public class PrinterMain {

	public static void main(String[] args) {
		Printer p;
		
		p=new InkPrinter();
		p.print();
		
		p=new LaserPrinter();
		p.print();
	}
}
