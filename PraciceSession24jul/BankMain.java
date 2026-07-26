package PraciceSession24jul;

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();

		b.deposite(20000);
		System.out.println("Your account Balance is: " + b.getBalance());

		b.widthdraw(10000);
		System.out.println("Your account Balance is: " + b.getBalance());
	}
}
