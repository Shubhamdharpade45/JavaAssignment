package Inheritance;

public class Mobail extends Device {

	void mobailInfo() {
		System.out.println("OnePlus Nord CE4");
	}

	public static void main(String[] args) {
		Mobail m = new Mobail();
		m.deviceInfo();
		m.mobailInfo();
	}

}
