package PraciceSession24jul;

public class StudentMarks {

	private String name;
	private int marks;

	void setName(String name) {
		this.name = name;
	}

	void setMarks(int marks) {
		this.marks = marks;

		if (marks > 100 || marks < 0) {
			System.err.print("Invalise Marks..!");
		}
	}

	// setter method

	String getName() {
		return name;
	}

	int getMarks() {
		return marks;
	}
}
