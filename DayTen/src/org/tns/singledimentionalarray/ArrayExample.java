package org.tns.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	//program to demonstrate on 1D array using compile time input
	public static void main(String[] args) {
		//array initialization at compile time
		int arr[]= {66,55,33,22,11};
		System.out.println(arr[1]);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//program to demonstrate on 1D array using Run time input
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter No of Elements : ");
		n=sc.nextInt();
		
		int newarr[]=new int[n];
		System.out.println("Enter elements here : ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter element "+(i+1)+": ");
			newarr[i]=sc.nextInt();
		}
		
		Arrays.sort(newarr);
		System.out.println("Largest element is "+newarr[n-1]);
		System.out.println("Second Largest element is "+newarr[n-2]);
		System.out.println("Sorted Array");
		for(int i:newarr) {
			System.out.print(i+" ");
		}
		sc.close();
		
	}
	

}
