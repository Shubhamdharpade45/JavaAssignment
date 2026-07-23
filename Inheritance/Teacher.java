package Inheritance;

public class Teacher extends Person {

	int a = 22;
	String tName = "Rahul Sir";

	public static void main(String[] args) {
		Teacher t = new Teacher();

		System.out.println("Person Class " + t.gender);
		System.out.println("Teacher class " + t.a + t.tName);

	}
}
