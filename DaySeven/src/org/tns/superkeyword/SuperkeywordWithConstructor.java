package org.tns.superkeyword;
class Google{
	String ceo;
	Google(String ceo2){
		System.out.println("Parent class constructor : CEO -> "+ceo2);
	}
}

 class youtube extends Google{
	
	String userid;

	public youtube(String ceo,String userid) {
		super(ceo);
		this.userid=userid;
		System.out.println();
	}
	
}

public class SuperkeywordWithConstructor {

	public static void main(String[] args) {
		youtube y=new youtube("Ashutosh","ABC");
		
	}

}
