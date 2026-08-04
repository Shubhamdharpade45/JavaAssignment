package com.Interface;

public class FoodMain {
	
	public static void main(String[] args) {
		
		FoodDelivery f;
		
		f= new Swigy();
		f.deliverOrder();
		
		f=new Zomato();
		f.deliverOrder();
		
		f=new UberEates();
		f.deliverOrder();
	}

}
