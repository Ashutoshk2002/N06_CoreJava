//program to demonstrate encapuslation

package com.tns.encapsulation;

public class UBOI {
	private long accountNo;
	private String accType;
	private long atmCardNo;
	private int pinNo;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "UBOI [accountNo=" + accountNo + ", accType=" + accType + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ "]";
	}
	
	
	
	
	
}
