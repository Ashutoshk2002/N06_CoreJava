package org.tns.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		
		System.out.print("Enter the no of stars : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
//	HW1 left angle traingle in * form
//		1
//		1 2
//		1 2 3 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
//HW2 Count no of digit

		System.out.print("Enter the digit : ");
		int digit=sc.nextInt();
		int count=0;
		while(digit!=0) {
			digit/=10;
			++count;
		}
		System.out.println("Total no of digit : "+count);
		
		sc.close();

	}

}
