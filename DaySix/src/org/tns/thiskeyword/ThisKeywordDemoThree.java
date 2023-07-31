package org.tns.thiskeyword;

class Team{
	int size;
	Team(){
		this(7);
		System.out.println("Default Constructor" +size);
	}
	
	Team(int size){
		this.size=size;
		System.out.println("Parameterized Constructor " + this.size);
	}
}

public class ThisKeywordDemoThree {

	public static void main(String args[]) {
		Team t=new Team();
//		Team tb=new Team(10);
	}
}
