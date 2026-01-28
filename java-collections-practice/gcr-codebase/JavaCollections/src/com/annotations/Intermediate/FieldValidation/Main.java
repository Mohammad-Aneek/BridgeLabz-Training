package com.annotations.Intermediate.FieldValidation;

public class Main {
	public static void main(String[] args) throws Exception {
		Validator.validate(new User("username"));
		Validator.validate(new User("ThisUsernameIsTooLong"));
	}
}
