/*
 * There are N people standing in a circle waiting to be executed.
 * The counting out begins at some point in the circle and proceeds around the circle around fix direction.
 * If each step, a certain no of people are skipped and the next person is executed. 
 * The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed)
 * ,until only the last person remains,who is given freedom.
 * 
 * Given the total no of person N and a number gave which indicates that k-1 person are skipped and k'th personed is killed in the circle.
 * The task is to choose the person in the initial circle that survive?
 * */
package org.tns.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {

		
	public static int survive(int n, int k)
		{
			if (n==1)
				return 1;
		
		else
			return (survive(n-1,k)+k-1)%n+1;     //every time 1 person is killed so remaining n-1
		}

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n and k: ");
		
		int n = sc.nextInt();
		int k =sc.nextInt();
		System.out.println(survive(n,k));
		sc.close();
	}

}
