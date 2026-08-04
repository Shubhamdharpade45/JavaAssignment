package com.Interface;

public class Manager implements Employee {

	@Override
	public void calculateSalary() {

		System.out.println("Salary of the Manager  " + (Employee.salary + 5000));

	}

}
