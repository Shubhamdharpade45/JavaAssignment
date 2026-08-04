package com.Interface;

public class ShopingMain {
public static void main(String[] args) {
	
	Shoping s;
	s= new Amezon();
	s.placeOrder();
	
	s= new Flipkart();
	s.placeOrder();
	
	s= new Myntra();
	s.placeOrder();
}
}
