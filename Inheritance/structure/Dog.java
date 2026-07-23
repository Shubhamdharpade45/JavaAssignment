package Inheritance.structure;

public class Dog extends Animal {
	void m2() {
		System.out.println("m4 method of Dog");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.m1();
		d.m2();
	}

}
