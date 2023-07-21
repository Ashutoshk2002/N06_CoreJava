//program to demonstrate Bitwise operator

package org.tns.operator;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		String result=num1>num2?"Num1>Num2":"Num2>Num1";
		System.out.println(result);
		
		sc.close();
	}

}
