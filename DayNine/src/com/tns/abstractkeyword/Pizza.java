package com.tns.abstractkeyword;

public class Pizza extends SandWitch {


	@Override
	void prepare() {
		System.out.println("Pizza ? Dont know bruhhh");
	}
	public static void main(String[] args) {
		
		Pizza p=new Pizza();
		p.prepare();
		
//		We cannot initiate abstract class
//		SandWitch s=new SandWitch();
		
		
	}
}
