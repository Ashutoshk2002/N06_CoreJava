package com.tns.uncheckedexception;

public class FinallyBlockNotExecutor {
	static void display(int arr[]) {
		try {
			System.out.println(arr[2]);
//			if try and catch block contain System.exit(0) then finally block will not executed.
			System.exit(0);
		}
		catch(Exception e) {
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
