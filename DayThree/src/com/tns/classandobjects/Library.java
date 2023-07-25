//program to demonstrate on default and parameterized constructor
package com.tns.classandobjects;
//class declaration
public class Library {
	public long noofBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	public Library() {
		System.out.println("Default Constructor");
	}
	
	public Library(long noofBooks, String authorName, String bookName, double price) {
		
		this.noofBooks = noofBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}

	@Override
	public String toString() {
		return "Library [noofBooks=" + noofBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	
	
}
