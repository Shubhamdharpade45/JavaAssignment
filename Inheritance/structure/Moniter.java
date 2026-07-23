package Inheritance.structure;

public class Moniter extends Student {

	void moniterInfo() {
		System.out.println("Information about Moniter");
	}

	public static void main(String[] args) {
		Moniter m = new Moniter();
		m.collageInfo();
		m.studentInfo();
		m.moniterInfo();
	}
}
