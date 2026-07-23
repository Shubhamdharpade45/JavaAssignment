package Inheritance;

public class Laptop extends Device {
	void laptopInfo() {
		System.out.println("Realme Book Slim ");
	}

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.deviceInfo();
		l.laptopInfo();
	}

}
