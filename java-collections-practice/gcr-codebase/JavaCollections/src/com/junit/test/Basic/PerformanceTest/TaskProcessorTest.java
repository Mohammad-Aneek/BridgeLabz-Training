package com.junit.test.Basic.PerformanceTest;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.main.Basic.PerformanceTest.TaskProcessor;

class TaskProcessorTest {

	TaskProcessor processor = new TaskProcessor();

	@Test
	@Timeout(value = 2, unit = TimeUnit.SECONDS)
	void testPerformanceFail() throws InterruptedException {
		processor.longRunningTask();
	}

	@Test
	@Timeout(value = 4, unit = TimeUnit.SECONDS)
	void testPerformancePass() throws InterruptedException {
		processor.longRunningTask();
	}

}
