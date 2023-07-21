//program to demonstrate Bitwise operator

package org.tns.operator;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
		
		System.out.println("BitWise AND Num2 : "+(num1&num2));
		
		System.out.println("BitWise OR : "+(num1|num2));
		
		System.out.println("BitWise XOR : "+(num1^num2));
		
		System.out.println("Left Shift for Num1 : "+(num1<<2));
		
		System.out.println("Right Shift for Num1 : "+(num1>>2));
		
		
		System.out.println();
		sc.close();


	}

}
