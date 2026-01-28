package com.reflection.Advanced.MethodExecutionTime;

public class SlowTask {
	public void process() throws InterruptedException {
		Thread.sleep(500);
	}
}
