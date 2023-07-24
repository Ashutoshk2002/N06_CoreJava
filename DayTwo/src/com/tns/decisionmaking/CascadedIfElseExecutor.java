//Program to demonstrate on cascaded if..else statement
package com.tns.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age1=sc.nextInt();
		int age2=sc.nextInt();
		int age3=sc.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println("Age 1: "+age1+" is greater");
		}else if(age2>age1 && age2>age3) {
			System.out.println("Age 2: "+age2+" is greater");
		}else {
			System.out.println("Age 3: "+age3+" is greater");
		}
		
		
		sc.close();
	}

}
