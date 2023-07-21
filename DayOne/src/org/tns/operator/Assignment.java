//program to demonstrate Assignment operator

package org.tns.operator;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=num1;
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
		num2+=num1;
		System.out.println("Addition Num2 : "+num2);
		num2-=num1;
		System.out.println("Minus Num2 : "+num2);
		num2*=num1;
		System.out.println("Multiplication Num2 : "+num2);
		
		
		System.out.println();
		sc.close();

	}

}
