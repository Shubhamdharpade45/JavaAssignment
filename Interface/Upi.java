package com.Interface;

public class Upi implements Payment {
	
	@Override
	public void pay(double amount) {
		System.out.println("Payment through upi "+amount);
	}
	

}
