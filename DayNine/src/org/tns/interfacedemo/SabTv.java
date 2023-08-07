package org.tns.interfacedemo;

public class SabTv implements Sony {

//	public void demo() {
//		System.out.println("Interface Demo");
//	}
	
	public static void main(String[] args) {
		SabTv s=new SabTv();
		Sony.demo();
		System.out.println(s.noOfChannel);
		System.out.println(Sony.noOfChannel);
	}
	
}
