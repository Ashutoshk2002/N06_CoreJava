package com.tns.uncheckedexception;

import java.util.Scanner;



public class ArrayOutOfBoundException {
	static void display(int arr[]) {
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled"+ e);
		}
		finally {
//			it always executes
			System.out.println("Finally block always Exceuted");
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		display(arr);
		
	}
}
