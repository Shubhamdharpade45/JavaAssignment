package com.Interface;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e;
		
		e = new Manager();
		e.calculateSalary();
		
		e = new Devloper();
		e.calculateSalary();
	}
}
