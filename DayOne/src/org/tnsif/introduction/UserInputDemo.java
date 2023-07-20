package org.tnsif.introduction;

import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String a = sc.next();
		System.out.println("String is : " + a);

		System.out.println("Enter the String : ");
		String b = sc.nextLine();
		System.out.println("String is : " + b);
		sc.close();
	}

}
