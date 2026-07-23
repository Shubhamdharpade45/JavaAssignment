package Inheritance.structure;

public class Tiger extends Cat {
	void m4() {
		System.out.println("m4 method of Tiger");
	}

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.m1();
		t.m3();
		t.m4();
	}
}
