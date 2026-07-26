package PraciceSession24jul;

import java.util.Scanner;

public class MenDrivan {

	void programs() {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter program name you Want to perform like: ");
		System.out.println("Odd-Even , Prime, Revers");
		String operation = sc.nextLine();

		switch (operation) {
		case "Odd-Even":
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("Number is Even ");
			} else {
				System.out.println("Number is Odd");
			}
			break;

		case "Prime":
			System.out.println("Enter a Number: ");
			int num2 = sc.nextInt();

			boolean isPrime = true;
			for (int i = 2; i < num2 - 1; i++) {

				if (num2 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (num2 <= 1) {
				System.out.println("Not prime");
			} else if (isPrime) {
				System.out.println("Number is prime");
			} else {
				System.out.println("Not prime");
			}
			break;

		case "Revers":
			int revers = 0;
			System.out.println("Enter a Number: ");
			int num3 = sc.nextInt();

			while (num3 != 0) {
				int lastDigit = num3 % 10;

				revers = revers * 10 + lastDigit;

				num3 = num3 / 10;
			}
			System.out.println(revers);

		default:

			System.err.println("Invalid Program Name");

		}
		sc.close();

	}

}
