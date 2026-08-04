package com.Interface;

public class BankMain {

	public static void main(String[] args) {
		Bank b;
		
		b=new Sbi();
		b.roi();
		
		b=new ICICI();
		b.roi();
		
		b=new HDFC();
		b.roi();
	}
}
