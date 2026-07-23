package Inheritance;

public class ChildB extends BaseA {

	void m2() {
		System.out.println("This is M2 method of ChildB class");
	}
	public static void main(String[] args) {
		ChildB cb = new ChildB();
		cb.m2();
		cb.m1();
	}

}
