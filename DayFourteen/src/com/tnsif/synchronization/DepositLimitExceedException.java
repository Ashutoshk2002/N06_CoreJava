package com.tnsif.synchronization;

public class DepositLimitExceedException extends Exception {
	public DepositLimitExceedException()
	{
		super("Can't Deposit..Limit is exceeded");
	}
	public DepositLimitExceedException(String message)
	{
		super(message);
	}
}
