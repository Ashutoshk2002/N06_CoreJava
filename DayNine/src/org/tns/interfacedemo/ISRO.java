package org.tns.interfacedemo;

public class ISRO implements ChandrayanThree{

	@Override
	public void status() {
		System.out.println("Successfully Launched");
	}
	
	public static void main(String[] args) {
		ISRO i=new ISRO();
		i.status();
	}
}
