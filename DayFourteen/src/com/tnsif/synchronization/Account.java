package com.tnsif.synchronization;

public class Account implements Bank {

	private int accNo;
	private int balance;
	private String name;

	public Account(int accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}

	// getters and setters

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", name=" + name + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance() + ", getName()=" + getName() + "]";
	}

	@Override
	public synchronized void deposit(int amount) throws DepositLimitExceedException {
		if (amount > Bank.DEPOSIT_LIMIT) {
			throw new DepositLimitExceedException();
		}
		balance += amount;

	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance - Bank.MINIMUM_BALANCE) {
			throw new InsufficientBalanceException();
		}
		balance -= amount;

	}

}
