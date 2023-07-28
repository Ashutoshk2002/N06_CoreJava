package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	public static void ageCalculator(int birthyr, int curryr) {
		if(curryr > birthyr) {
			System.out.println(curryr - birthyr);
		}else {
			System.out.println((100-birthyr)+ curryr);
		}
		
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth year and current year: ");
		
		
		int birthyr = sc.nextInt();
		int curryr = sc.nextInt();
		ageCalculator(birthyr, curryr);


	}

}
