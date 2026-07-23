package Inheritance;

public class ChildC extends BaseA {
	void m3() {
		System.out.println("This is M3 method of Child3 class");
	}
	public static void main(String[] args) {
		ChildC c = new ChildC();
		c.m3();
		c.m1();
	}

}
