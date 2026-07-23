package Inheritance;

public class Student extends Person {

	int age = 24;
	String Student = "Sham";

	public static void main(String[] args) {
		Student s = new Student();

		System.out.println("Person Class" + s.age);
		System.out.println("Teacher class" + s.age + s.Student);

	}
}
