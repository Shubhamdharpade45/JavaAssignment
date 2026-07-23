package Inheritance;

public class Child1 extends Parent1 {
	int c=3;
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println("This is a A class Vriable: "+c.a);
		System.out.println("This is a B class Vriable: "+c.b);
		System.out.println("This is a C class Vriable: "+c.c);
	}

}
