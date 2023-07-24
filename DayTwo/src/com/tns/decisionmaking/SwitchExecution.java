//Program to demonstrate on switch case

package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchExecution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 : Song 1");
		System.out.println("2 : Song 2");
		System.out.println("3 : Song 3");
		System.out.println("Enter Your Choice : ");
		int songno=sc.nextInt();
		
		
		switch(songno) {
		case 1:System.out.println("Playing song 1");
				break;
		case 2:System.out.println("Playing song 2");
				break;
		case 3:System.out.println("Playing song 3");
				break;
		default:System.out.println("Invalid Input");
		}
		sc.close();
	}

}
