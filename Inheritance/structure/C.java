package Inheritance.structure;

public class C extends B {
	int c = 3;

	void printVAriables() {
		System.out.println("Varibale of Class A" + a);
		System.out.println("Varibale of Class B" + b);
		System.out.println("Varibale of Class C" + c);

	}

	public static void main(String[] args) {
		C c = new C();
		c.printVAriables();
	}

}
