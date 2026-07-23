package Inheritance;

public class Car extends Vehical{

	void drive() {
		System.out.println("Drive the car: ");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.Start();
		c.drive();
		
		
	}
}

