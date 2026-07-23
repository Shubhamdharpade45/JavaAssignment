package Inheritance;

public class B extends  A{

	void showB() {
		System.out.println("This is yhe method of classs B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	}
}
