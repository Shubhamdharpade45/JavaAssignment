package com.Interface;

public class CarSysteMain {
	public static void main(String[] args) {
		
		GPS g ;
		g = new CarSystem();
		g.turnOnGps();
		
		Bluetooth b = new CarSystem();
		b.turnOnBluetooth();
	}

}
