package PraciceSession24jul;

public class Electricity {
	int calculateBill(int unit) {

		int bill = 0;

		if (unit <= 100) {

			bill = unit * 5;
			System.out.println("Your total units:- " + unit);
			System.out.println("Total Electricity bill:- " + bill);

		} else if (unit > 100 && unit <= 200) {
			bill = unit * 7;
			System.out.println("Your total units:- " + unit);
			System.out.println("Total Electricity bill:- " + bill);

		} else if (unit > 200) {
			bill = unit * 10;
			System.out.println("Your total units:- " + unit);
			System.out.println("Total Electricity bill:- " + bill);
		}

		return bill;
	}

}
