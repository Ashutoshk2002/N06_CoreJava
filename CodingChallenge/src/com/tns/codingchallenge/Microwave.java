package com.tns.codingchallenge;
//not completed
import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of items: ");
		
		
		int items = sc.nextInt();
		System.out.print("Enter the heating time for one item : ");
        double time = sc.nextDouble();
		
        double heatingTime=0;
        
		switch(items) {
		case 1: 
			
	        heatingTime = time;
			break;
		
		case 2:
		
			heatingTime = (time*0.5)+time;
            break;
		case 3:
			
			heatingTime = 2*(time);
            break;
        default:
        	System.out.println("Heating more than 3 items are not recommended.");
        	System.exit(1);

		}
	}

}
