package org.tns.superkeyword;
//program to demonstrate super keyword with method
class MET{
	String ownername="Chhagan Bhujbal";
	String print(){
		return ownername;
	}
}

class IOE extends MET{
	int flatNo=1;
	String ownername="Shefali Bhujbal";
	String print(){
		return ownername;
	}
	void display() {
		System.out.println(super.print());
		
		}
}


public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		IOE a=new IOE();
		a.display();

	}

}
