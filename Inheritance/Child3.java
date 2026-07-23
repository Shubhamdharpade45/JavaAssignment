package Inheritance;

public class Child3  extends Parent2{
	void c3() {
		System.out.println("Method of child 3 class");
	}
	
	public static void main(String[] args) {
		Child3 c3= new Child3();
		c3.c3();
		c3.p2();
	}

}
