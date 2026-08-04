package com.Interface;

public class CreditCard implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Payment through CreditCard " + amount);
	}
}
