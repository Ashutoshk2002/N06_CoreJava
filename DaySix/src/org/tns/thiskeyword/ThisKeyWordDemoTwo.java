package org.tns.thiskeyword;

class Bank{
	long accountNo;
	
	Bank(long accountNo){
		this.accountNo=accountNo;
		System.out.println(this.accountNo);
	}
	
}

public class ThisKeyWordDemoTwo {

	public static void main(String[] args) {
		Bank a=new Bank(3485949302L);
	}

}
