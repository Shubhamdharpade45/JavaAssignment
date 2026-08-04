package com.Interface;

public class VehicalMain {

	public static void main(String[] args) {
		Vehical v;
		v=new Car();
		v.startEngine();
		
		v=new Bike();
		v.startEngine();
	}
}
