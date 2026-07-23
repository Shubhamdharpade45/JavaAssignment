package Inheritance;

public class Cat extends Animals {
	void showCat() {
		System.out.println("This is Cat class ");
	}
	public static void main(String[] args) {
		Cat c= new Cat();
		c.showLiving();
		c.showAnimal();
		c.showCat();
	}
}
