package PraciceSession24jul;

public class MarksMain {
	public static void main(String[] args) {
		StudentMarks sm = new StudentMarks();
		sm.setName("Shubham");
		System.out.println("Name: " + sm.getName());

		sm.setMarks(981);
		System.out.println("Marks: " + sm.getMarks());
	}
}
