package com.tnsif.synchronization;

public class Account implements Bank {
<<<<<<< HEAD

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
=======
	private int accNo;
	private String name;
	private int balance;

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
>>>>>>> temp

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

<<<<<<< HEAD
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

=======
>>>>>>> temp
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD
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

=======
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public synchronized void deposit(int amount) throws DepositLimitExceedsException {
		if (amount>Bank.DEPOSIT_LIMIT)
			throw new DepositLimitExceedsException("can't deposit "+amount+" as deposit limit exceeded..");
		balance+=amount;
>>>>>>> temp
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
<<<<<<< HEAD
		if (amount > balance - Bank.MINIMUM_BALANCE) {
			throw new InsufficientBalanceException();
		}
		balance -= amount;

=======
		if (amount>balance-Bank.MINIMUM_BALANCE)
			throw new InsufficientBalanceException("Can't withdraw, Insufficient balance : "+balance);
		balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
>>>>>>> temp
	}

}
