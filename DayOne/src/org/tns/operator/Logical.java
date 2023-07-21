//program to demonstrate Relational operator

package org.tns.operator;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1%2==0 && num2%2==0) {
			System.out.println("Both values are even");
		}else if(num1%2==0 || num2%2==0) {
			System.out.println("One of the value is even");
		}
		else {
			System.out.println("Both are not even");
		}
		System.out.println();
		sc.close();

	}

}
