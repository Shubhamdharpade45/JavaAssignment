package Inheritance;

public class Child2 extends Parent2 {
	

	void c2() {
		System.out.println("Child 2 class method ");
	}
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.c2();
		c2.p2();
	}
}
