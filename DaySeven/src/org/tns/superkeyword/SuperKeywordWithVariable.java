package org.tns.superkeyword;
//program to demonstrate super keyword with variable
class Building{
	int floors=23;
	String name="Galaxy";
}

class flat extends Building{
	int flatNo=1;
	String name="Ashutosh Khairnar";
	
	String print() {
		return super.name;
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		flat f=new flat();
		System.out.println(f.print());
	}

}
