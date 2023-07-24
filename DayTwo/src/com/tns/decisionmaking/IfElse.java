//Program to demonstrate on if..else statement
package com.tns.decisionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		
		if(age>18 && weight>45) {
			System.out.println("You're eligible to donate blood");
		}else {
			System.out.println("You're not eligible to donate blood");
		}
		
		sc.close();
	}

}
