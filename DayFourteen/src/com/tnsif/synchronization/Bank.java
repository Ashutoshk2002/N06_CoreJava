package com.tnsif.synchronization;

public interface Bank {
	public static final int DEPOSIT_LIMIT = 25000;
	static final int MINIMUM_BALANCE = 1000;

	void deposit(int amount) throws DepositLimitExceedException;

	public abstract void withdraw(int amount) throws InsufficientBalanceException;
}
