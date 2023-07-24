package org.tns.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		
		System.out.println("Enter the no of stars : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
//		left angle traingle in * form
//		1
//		1 2
//		1 2 3  HW
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
