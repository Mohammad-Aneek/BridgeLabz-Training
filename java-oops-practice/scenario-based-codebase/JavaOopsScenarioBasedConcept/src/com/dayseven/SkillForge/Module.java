package com.dayseven.SkillForge;

import java.time.Duration;

public class Module {
	private String name;
	private Duration duration;
	private boolean completed;

	public Module(String name, int duration, boolean completed) {
		this.name = name;
		this.duration = Duration.ofMinutes(duration);
		this.completed = completed;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void markComplete() {
		completed = true;
		System.out.println(this + " marked as completed");
	}

	@Override
	public String toString() {
		return String.format("%s (%d minutes)", name, duration.toMinutes());
	}
}
