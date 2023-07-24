//Program to demonstrate on bunjee jumping using nested if

package com.tns.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		
		
		if(age>=12) {
			if(weight>=40) {
				System.out.println("Eligible for bunjee jumping");
				if(weight>110) {
					System.out.println("Extra ropes will be added");
				}
			}else {
				System.out.println("Not eligible for bunjee jumping: Weight criteria not passed");
			}
		}else {
			System.out.println("Not eligible for bunjee jumping: Age criteria not passed");
		}
		
		
		sc.close();

	}

}
