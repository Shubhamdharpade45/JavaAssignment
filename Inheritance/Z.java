package Inheritance;

public class Z extends Y {
	int age = 23;
	String name = "Rahul";

	void m1() {
		Z z = new Z();

		System.out.println("Class x " + z.age + z.name);
		System.out.println("Class x " + z.ageY + z.nameY);
		System.out.println("Class x " + z.ageX + z.nameX);

	}

	public static void main(String[] args) {
		Z z1 = new Z();
		z1.m1();

	}

}
