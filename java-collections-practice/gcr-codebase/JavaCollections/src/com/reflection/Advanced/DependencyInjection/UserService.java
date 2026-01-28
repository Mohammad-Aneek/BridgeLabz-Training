package com.reflection.Advanced.DependencyInjection;

public class UserService {
	@Inject
	private Repository repo;

	public void action() {
		repo.save();
	}
}
