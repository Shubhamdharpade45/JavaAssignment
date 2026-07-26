package PraciceSession24jul;

public class Car extends Vehical {

	void showSpeed() {
		System.out.println("Speed Of Car Is 265 km/hr ");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.showSpeed();
	}
}
