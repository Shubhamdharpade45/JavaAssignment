package com.Interface;

public class AUthenticationMain {
	public static void main(String[] args) {
		Authentication a;
		
		a= new Mail();
		a.logIn();

		a= new Google();
		a.logIn();

		a= new Fb();
		a.logIn();
		
		
	}

}
