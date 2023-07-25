//program to demonstrate class and objects

package com.tns.classandobjects;

public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empID=123;
		emp.empName="Ashutosh";
		emp.salary=100000;
		emp.department="SDE";
		
		emp.display();
		
	}

}
