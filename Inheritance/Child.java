package Inheritance;

public class Child extends Parent {

	int y = 20;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println("the value of x is : "+c.x);
		System.out.println("the value of y is : "+c.y);
	}
}
