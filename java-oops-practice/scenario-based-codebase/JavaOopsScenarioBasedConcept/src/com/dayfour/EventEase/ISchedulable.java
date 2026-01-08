package com.dayfour.EventEase;

public interface ISchedulable {
	void schedule();

	boolean reschedule(String date);

	void cancel();
}
