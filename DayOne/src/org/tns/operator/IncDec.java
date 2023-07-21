//program to demonstrate Increment and Decrement operator

package org.tns.operator;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println(num1++);
		System.out.println(++num1);
		System.out.println(num1--);
		System.out.println(--num1);
		
		sc.close();

	}

}
