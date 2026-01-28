package com.annotations.Advanced.RoleBasedAccess;

public class Main {

	public static void main(String[] args) throws Exception {
		AdminPanel adminPanel = new AdminPanel();

		Framework.invoke(adminPanel, "deleteUser", "ADMIN");
		Framework.invoke(adminPanel, "deleteUser", "USER");
	}

}
