package com.tns.codingchallenge;

import java.util.Scanner;

/*
Shahid is a computer science student and his teacher gave him a simple question to solve within time but 
he is little busy in his life, so he asked you to solve this problem.

Problem statement : You have been given an array of positive integers A1,A2,...,An with legnth N and
 you have to print an array of same length(N) where the values in the new array are 
 the sum of every number in the array, except the number at that index.

Input:
The first line of input contains a single integer T denoting the number of test cases.
Each test cases contain two lines.First line contains N, 
the length of the array and second line contains N space separated positive integers.
Output:
For each test case, output a single array of same length.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤105
0 <= A[i] <= 109
Example:
Input
2
4
1 2 3 4
3
4 5 6
Output

9 8 7 6
11 10 9
Explanation

Test case 1: For the first index, the result will be 2+3+4= 9, similarly for the second, third and fourth index the corresponding results will be 8, 7 and 6 respectively.*/
public class TheArrayProblem {
	
	static void swap(int a,int b) {
		int temp= a;
		a=b;
		b=temp;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Testcases : ");
		int t=sc.nextInt();
		
		while(t!=0) {
			
			System.out.print("Enter Size of an Array: ");
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			System.out.print("Enter Element in an Array : ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt()
;			}
			int result[]=new int[n];
//		input	1 2 3 4
//		output	9 8 7 6
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=arr[i];
			}
			
			for(int i=0;i<n;i++) {
				result[i]=sum-arr[i];
				System.out.print(result[i]+" ");
			}
			
			t--;
		}
		
		
	}

}
