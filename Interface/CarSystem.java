package com.Interface;

public class CarSystem implements GPS ,Bluetooth {

	@Override
	public void turnOnBluetooth() {
		System.out.println("Blurtooth thured on");
		
	}

	@Override
	public void turnOnGps() {
		System.out.println("Gps turned on");
		
	}

}
