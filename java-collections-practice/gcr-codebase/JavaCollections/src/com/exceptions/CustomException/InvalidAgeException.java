package com.exceptions.CustomException;

public class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String msg) {
		super(msg);
	}
}
