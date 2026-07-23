package Inheritance;

public class Cat2 extends Animal2 {

	void c1() {

		System.out.println("This is c1 method of Cat2");

	}

	public static void main(String[] args) {
		Cat2 c2 = new Cat2();
		c2.c1();
		c2.a1();
	}
}
