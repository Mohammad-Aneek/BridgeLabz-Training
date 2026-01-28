package com.annotations.CustomAnnotation.BugReport;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		Method m = SoftwareModule.class.getMethod("feature");

		BugReport[] reports = m.getAnnotationsByType(BugReport.class);

		for (BugReport r : reports) {
			System.out.println("Bug Found: " + r.description());
		}
	}
}
