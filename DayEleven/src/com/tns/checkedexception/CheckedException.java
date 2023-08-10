package com.tns.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Ashutosh Khairnar\\OneDrive\\Documents\\office.txt");
 			
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
			
		
		}
	}
}
