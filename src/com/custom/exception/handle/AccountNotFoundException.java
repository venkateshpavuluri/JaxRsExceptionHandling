package com.custom.exception.handle;

public class AccountNotFoundException extends RuntimeException {
	
	public AccountNotFoundException(String msg)
	{
		super(msg);
		
	}

}
