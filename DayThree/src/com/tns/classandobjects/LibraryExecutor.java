//program to demonstrate on default and parameterized constructor

package com.tns.classandobjects;

public class LibraryExecutor {

	public static void main(String[] args) {
		
		Library l=new Library();
		
		Library ll=new Library(5,"Ashutosh","OOPs",999);
		
		System.out.println(ll.toString());
	}

}
