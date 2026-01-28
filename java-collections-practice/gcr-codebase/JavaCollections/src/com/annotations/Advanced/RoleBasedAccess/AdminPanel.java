package com.annotations.Advanced.RoleBasedAccess;

class AdminPanel {
	@RoleAllowed("ADMIN")
	public void deleteUser() {
		System.out.println("User deleted.");
	}
}