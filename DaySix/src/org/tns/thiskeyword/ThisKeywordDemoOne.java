//program to demonstrate on this keyword is used to refer current instance of class
package org.tns.thiskeyword;

class Account{
	long accountNo;
	
	void setAccNo(long accountNo) {
		this.accountNo=accountNo;
	}
	
	void display() {
		System.out.println(accountNo);
	}
	
	
}
//driver class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a=new Account();
//		a.accountNo=12344566779L;
		a.setAccNo(12344566779L);
		a.display();

	}

}
