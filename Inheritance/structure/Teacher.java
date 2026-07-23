package Inheritance.structure;

public class Teacher extends Collage {
	void teacherInfo() {
		System.out.println("Information about Teacher");
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.teacherInfo();
		t.collageInfo();
	}

}
