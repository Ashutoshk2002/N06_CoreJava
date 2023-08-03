package com.tns.polymorphism;
//program to demonstrate of method overloading

class bollywood{
	String s1;
	String s2;
	String s3;
	
	static void showcouple(String s1,String s2) {
		System.out.println(s1+" loves "+s2);
	}
	
	static void showcouple(String s1,String s2,String s3) {
		System.out.println(s1+" loves "+s2+" and "+s2+" loves "+s3);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		bollywood.showcouple("A","B");
		bollywood.showcouple("A","B","C");
	
	}

}
