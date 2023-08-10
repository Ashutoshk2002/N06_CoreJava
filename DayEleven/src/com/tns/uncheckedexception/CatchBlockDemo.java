package com.tns.uncheckedexception;
//program to demonstrate multiple exception
public class CatchBlockDemo {

	static void print(int arr[]) {
		try {
			System.out.println(arr[4]);
		}
//		catch(Exception e) {
//			System.out.println("Catch Block 1 "+e);
//		} we should use Exception(superclass) in las t. Most priority is for child class and then for parent class 
		catch(ArrayIndexOutOfBoundsException  | NullPointerException e) {
			System.out.println("Catch Block 1 "+e);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		print(arr);
	}

}
