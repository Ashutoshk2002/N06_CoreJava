//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;

import bkc.metedu.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l=new Library();
		l.LibraryName="ARK";
		l.getlibraryname();
		
//		userid and getuserid() method is private,so we cant access into another package or class,only we can access to the same class
		
//		l.userID=123;
//		l.getuserid(); 
		
//		BookName and getbookname() method is default,so we cant access into another package,only we can access if within the same package
//		l.BookName="OOP";
//		l.getBookname();
	}

}
