package com.exam.helper;

public class UserFoundException extends Exception{
	
	public UserFoundException() {
		super("User with this Username there in DB !! try with another one");
	}
	
	public UserFoundException(String msg) {
		super(msg);
	}

}
