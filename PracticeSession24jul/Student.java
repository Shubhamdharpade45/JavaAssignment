package PraciceSession24jul;

import java.util.Scanner;

public class Student {	

	void calculateAverage() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Your English Mark");
		int english = sc.nextInt();
		
		System.out.println("Enter Your Math Marks");
		int math = sc.nextInt();
		
		System.out.println("Enter Your Science Marks");
		int science = sc.nextInt();
		
		sc.close();
		double average = (english + math + science) / 3.0;

		if (average > 75) {
			System.out.println("Hey "+name+" You Are Pass with A Grade & Your Average is: " + average);
		} else if (average >= 60 && average <= 75) {
			System.out.println("Hey "+name+" You Are Pass with B Grade & Your Average is: " + average);
		} else if (average >= 40 && average <= 60) {
			System.out.println("Hey "+name+" You Are Pass with C grade & Your Average is: " + average);
		} else {
			System.err.println("Hey "+name+" You Are Pass with"+ "Fail...! beacuse your average " + average + " is less than 40");
		}
	}

}
