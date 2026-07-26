package PraciceSession24jul;

import java.util.Scanner;

public class LoanEligibility {

	void checkElagibility() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name =sc.nextLine();
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		sc.close();

		if (salary > 25000.0 && (age > 18 && age < 60)) {
			System.out.println("Hey "+name+" your are Eligible for Loan..");
		} else {
			System.err.println("Not Eligibale For loan..! ");
		}
	}
}
