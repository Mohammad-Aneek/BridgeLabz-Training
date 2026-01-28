package com.annotations.CustomAnnotation.TaskInfo;

public class TaskManager {
	@TaskInfo(priority = "HIGH", assignedTo = "Abhishek")
	public void highPriorityTask() {
		System.out.println("High priority task executed.");
	}
}
