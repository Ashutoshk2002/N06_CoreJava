package com.tnsif.synchronization;

public class Executor {

	public static void main(String[] args) {
		Account accObj = new Account(101, 10000, "Ashutosh");
		AccountThread threadOne = new AccountThread(accObj);
		AccountThread threadTwo = new AccountThread(accObj);
		threadOne.setAmount(2000);
		threadOne.setType("withdraw");

		threadTwo.setAmount(8000);
		threadTwo.setType("withdraw");

		threadOne.start();
		threadTwo.start();

	}

}
