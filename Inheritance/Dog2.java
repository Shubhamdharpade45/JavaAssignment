package Inheritance;

public class Dog2 extends Animal2 {
	void d1() {

		System.out.println("This is d1 method of Dog2");

	}

	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.d1();
		d2.a2();
	}

}
