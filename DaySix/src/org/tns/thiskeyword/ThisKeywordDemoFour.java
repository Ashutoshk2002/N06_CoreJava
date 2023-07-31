package org.tns.thiskeyword;

class Director{
	String name;
	 Director() {
		this.name="ARK";
		display(name);
	}
	
	void display(String name) {
		System.out.println("Director Name : "+name);
	}
}

public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d=new Director();
//		d.display("Ark");
	}

}
