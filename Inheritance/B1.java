package Inheritance;

public class B1 extends A1 {
	void m2() {
		System.out.println("m2 method of B1");
	}

	public static void main(String[] args) {
		B1 b = new B1();
		b.m1();
		b.m2();
	}

}
