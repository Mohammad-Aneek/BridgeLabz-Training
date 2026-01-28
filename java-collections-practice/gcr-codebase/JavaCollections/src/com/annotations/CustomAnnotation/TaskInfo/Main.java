package com.annotations.CustomAnnotation.TaskInfo;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		TaskManager manager = new TaskManager();
		Method method = manager.getClass().getMethod("highPriorityTask");

		if (method.isAnnotationPresent(TaskInfo.class)) {
			TaskInfo info = method.getAnnotation(TaskInfo.class);
			System.out.println("Task Priority: " + info.priority());
			System.out.println("Assigned To: " + info.assignedTo());

			manager.highPriorityTask();
		}
	}
}
