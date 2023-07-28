//program to demonstrate on access specifier
package bkc.metedu.library;

public class Library {
	//different access modifier
	public String LibraryName;
	private int userID;
	String BookName;
	
	//public method
	public void getlibraryname() {
		System.out.println("Library Name is "+LibraryName);
	}
	//private method
	private void getuserid() {
		System.out.println("User ID is "+userID);
	}
	//default method
	void getBookname() {
		System.out.println("Book Name is "+BookName);
	}
}
