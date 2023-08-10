package org.tns.customexception;
//program to demonstrate the user defined exception
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID : ");
		String userid = sc.nextLine();
		System.out.print("Password : ");
		String password = sc.nextLine();

		try {
		if (userid.equals("ark.org") && password.equals("123")) {
			System.out.println("Credentials are matched");
		}else {
			throw new LoginCredentials("Invalid Credential");
		}
		}
		catch(LoginCredentials e){
			System.out.println(e);
		}
	}

}
