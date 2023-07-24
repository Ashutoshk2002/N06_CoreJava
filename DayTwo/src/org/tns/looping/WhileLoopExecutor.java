//print n to 1 using while loop
package org.tns.looping;

import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		while(n!=0) {
			System.out.print(n+" ");
			n--;
		}

	}

}
