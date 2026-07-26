package PraciceSession24jul;

import java.util.Scanner;

public class Calculator {

	void calculations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter operation Symbol ");
		char operator = sc.next().charAt(0);
		int operation = 0;
		sc.close();

		switch (operator) {

		case '+':
			operation = num1 + num2;
			System.out.println("Addition of 2 Number is: " + operation);
			break;

		case '-':
			operation = num1 - num2;
			System.out.println("Substraction of 2 Number is: " + operation);
			break;

		case '*':
			operation = num1 * num2;
			System.out.println("Multiplication of 2 Number is: " + operation);
			break;

		case '/':
			operation = num1 / num2;
			System.out.println("Division of 2 Number is: " + operation);
			break;
		}
	}

}
