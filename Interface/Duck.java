package com.Interface;

public class Duck implements Flyable , Swimmable {
	
	@Override
	public void fly() {
		
		System.out.println("Duck Can Fly");
		
	}

	@Override
	public void swim() {
		
		System.out.println("Duck can Swim");
		
	}
}
