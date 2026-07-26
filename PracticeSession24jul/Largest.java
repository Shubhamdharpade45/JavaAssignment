package PraciceSession24jul;

import java.util.Scanner;

public class Largest {

	void findLargest() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();

		System.out.println("Enter 3rd number");
		int num3 = sc.nextInt();

		System.out.println("Enter 4th number");
		int num4 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				if (num1 > num4) {
					System.out.println("Highest number = " + num1);
				} else {
					System.out.println("Highest number = " + num4);
				}
			} else {
				if (num3 > num4) {
					System.out.println("Highest number = " + num3);
				} else {
					System.out.println("Highest number = " + num4);
				}
			}
		} else {
			if (num2 > num3) {
				if (num2 > num4) {
					System.out.println("Highest number = " + num2);
				} else {
					System.out.println("Highest number = " + num4);
				}
			} else {
				if (num3 > num4) {
					System.out.println("Highest number = " + num3);
				} else {
					System.out.println("Highest number = " + num4);
				}
			}
		}

		sc.close();
	}

}
