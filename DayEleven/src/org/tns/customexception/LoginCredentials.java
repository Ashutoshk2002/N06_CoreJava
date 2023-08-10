package org.tns.customexception;

//program to demonstrate on custom exception
//to use custom exception extends an exception class(parent)

public class LoginCredentials extends Exception {

	public String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
}
