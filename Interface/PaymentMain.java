package com.Interface;

public class PaymentMain {

	public static void main(String[] args) {
		Payment p;
		p=new Upi();
		p.pay(3000);
		
		p=new CreditCard();
		p.pay(4000);
		
		p=new NetBanking();
		p.pay(7000);
	}
}
