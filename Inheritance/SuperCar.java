package Inheritance;

public class SuperCar extends Car1 {
	void displaysuperCar() {
		System.out.println("this is superCar class :");
	}

	public static void main(String[] args) {
		SuperCar s = new SuperCar();
		s.displayCar();
		s.displaysuperCar();
		s.displayVehical();
	}
}
