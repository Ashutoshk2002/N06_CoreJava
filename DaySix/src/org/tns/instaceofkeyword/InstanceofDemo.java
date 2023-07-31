package org.tns.instaceofkeyword;

class RBI{
	protected String IfscCode="RBISONGPA01";
}
class SBI extends RBI{
	public SBI() {
		super.IfscCode="RBISONGPA01";
		String IfscCode="SBIN002161";
		System.out.println(IfscCode);
	}
	 
}
//program to demonstarte instace of operator
public class InstanceofDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
	}

}
