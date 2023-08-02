package org.tns.statickeyword;

class Demo{
	static int num;
	static String name;
	static {
//		num=10; gives error for non static variable
		name="Ashutosh";
	}
}


public class StaticBlockExecutor {

	public static void main(String[] args) {
		System.out.println(Demo.name);
		System.out.println(Demo.num);

	}

}
