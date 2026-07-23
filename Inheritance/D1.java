package Inheritance;

public class D1 extends C1 {
	void m4() {
		System.out.println("m4 method of D1");
	}

	public static void main(String[] args) {
		D1 d = new D1();
		d.m1();
		d.m3();
		d.m4();
	}
}
