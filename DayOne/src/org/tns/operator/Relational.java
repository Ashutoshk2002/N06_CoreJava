//program to demonstrate Relational operator
package org.tns.operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		System.out.println();
		sc.close();

	}

}
