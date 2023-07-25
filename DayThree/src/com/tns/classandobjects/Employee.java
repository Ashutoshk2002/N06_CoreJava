//program to demonstrate class and objects
package com.tns.classandobjects;
//class declaration
public class Employee {
	//default data members 
	String empName;
	float salary;
	int empID;
	String department;
	private int empxyz=10;
	
//	method declaration and definition
	void display() {
		System.out.println("Emp ID : "+empID+"\nEmp Name : "+empName+"\nEmp Salary : "+salary+"\nDepartment : "+department);
	}
	
	public int getter() {
		return empxyz;
	}
}
