package com.Interface;

public class NetBanking implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Payment through NetBanking " + amount);
	}
}
