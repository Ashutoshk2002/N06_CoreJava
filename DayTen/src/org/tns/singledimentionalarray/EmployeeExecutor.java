package org.tns.singledimentionalarray;

import java.util.Scanner;

public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(1,"Ashutosh",20000.45);
		arr[1]=new Employee(2,"Darshan",30000.65);
		arr[2]=new Employee(3,"Saish",40000.15);
		
		for(int i=0;i<3;i++) {
			System.out.print(arr[i].getEmpId()+" "+arr[i].getName()+" "+arr[i].getSalary());
			System.out.println();
		}

		

	}

}
