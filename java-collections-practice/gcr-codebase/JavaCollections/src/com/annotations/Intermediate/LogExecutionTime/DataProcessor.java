package com.annotations.Intermediate.LogExecutionTime;

import java.time.Duration;

public class DataProcessor {
	@LogExecutionTime
	public void heavyComputation() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(2));
	}
}
