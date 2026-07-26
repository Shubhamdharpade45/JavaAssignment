package PraciceSession24jul;

public class Bank {
	private double balance;

	void deposite(double amount) {
		this.balance += amount;
	}

	void widthdraw(double amount) {
		this.balance -= amount;
	}

	double getBalance() {
		return balance;
	}
}
