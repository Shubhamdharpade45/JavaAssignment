package com.Interface;

public class ICICI implements Bank {
	@Override
	public void roi() {
		int roi = 10;
		System.out.println("Rate of intrest of the ICICI is " + roi);
	}

}
