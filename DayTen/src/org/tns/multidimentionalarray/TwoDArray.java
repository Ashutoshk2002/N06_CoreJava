package org.tns.multidimentionalarray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows: ");
		int n=sc.nextInt();
		System.out.println("Enter No of Column: ");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
				}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
	}

}
