package PraciceSession24jul;

public class Manager extends Employee {

	double bonous = salary*20/100;
	
	double calculateSalary() {
		salary=salary+bonous;
		
		System.out.println("Total Salary Including bonous: "+salary);
		
		return salary;
	}
	
	public static void main(String[] args) {
		Manager m = new Manager();
		
		m.calculateSalary();
	}
}
