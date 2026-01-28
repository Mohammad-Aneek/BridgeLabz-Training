package com.annotations.Beginner.Todo;

public class Project {
	@Todo(task = "Add Dark Mode", assignedTo = "DevA")
	public void uiSettings() {
	}

	public void backendLogic() {
	}

	@Todo(task = "Implement Logging", assignedTo = "DevB", priority = "HIGH")
	public void dataProcessing() {
	}
}
