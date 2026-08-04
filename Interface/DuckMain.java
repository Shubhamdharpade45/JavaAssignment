package com.Interface;

public class DuckMain {
	public static void main(String[] args) {
		
		Flyable f = new Duck();
		f.fly();
		
		Swimmable s= new Duck();
		s.swim();
	}

}
