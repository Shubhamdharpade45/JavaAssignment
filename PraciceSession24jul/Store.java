package PraciceSession24jul;

import java.util.Scanner;

public class Store {

	void calculateBill() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name");
		String productName = sc.nextLine();

		System.out.println("Select Product quantity");
		int quantity = sc.nextInt();

		System.out.println("Enter Price");
		double price = sc.nextDouble();

		double bill = quantity * price;
		double disscount = (bill * 20) / 100;

		if (bill >= 5000) {
			bill = bill - disscount;
			System.out.println("Total bill is : " + bill);
		} else {

//			 bill= quantity * price;
			System.out.println("Total bill is: " + bill);
		}
		
		sc.close();

	}

}
