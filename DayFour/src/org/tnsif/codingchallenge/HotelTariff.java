package org.tnsif.codingchallenge;

import java.util.Scanner;

public class HotelTariff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month : ");
		int month=sc.nextInt();
		System.out.println("Enter Rent : ");
		float rent=sc.nextFloat();
		System.out.println("Enter Days : ");
		int days=sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println((rent+(rent*0.2f))*days);
			break;
			
		default:
			System.out.println("Invalid input");
		}

	}

}
