package com.tns.codingchallenge;

import java.util.Scanner;

/*Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30). 
 * The show timings are 10.15, 13.30, 18.00 and 22.00.
 *  The normal adult ticket price is $8.00, however, the adult matinee price is $5.00. 
 *  Adults are those over 13 years. 
 *  The normal children's ticket price is $4.00, however, the children's matinee price is $2.00. 
 *  Write a program that determines the price of a movie ticket
 * Sample Input:
16
10.15
Sample Output:
$8.00*/
public class MovieTicket {
	
	 static void TicketCalc(int age,float time) {
		if(time>12.00 && time<16.30 ) {
			if(age>13) {
				System.out.println("$5.00");
			}else if(age<13) {
				System.out.println("$2.00");
			}
			
		}else if(!(time>12.00 && time<16.30)) {
			if(age>13) {
				System.out.println("$8.00");
			}else if(age<13) {
				System.out.println("$4.00");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		System.out.print("Enter Time : ");
		float time=sc.nextFloat();
		System.out.print("Ticket Price : ");
		TicketCalc(age,time);
		
		sc.close();
	}
}
