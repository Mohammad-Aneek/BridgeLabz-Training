package com.functionalinterface.PasswordValidator;

public interface SecurityUtils {
	static boolean isStrongPassword(String password) {
		return password.length() >= 8 && password.contains("@");
	}
}
