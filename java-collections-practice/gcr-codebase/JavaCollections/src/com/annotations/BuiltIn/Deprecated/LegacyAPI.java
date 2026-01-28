package com.annotations.BuiltIn.Deprecated;

public class LegacyAPI {
	/**
	 * @deprecated Use newFeature() instead. This method is slow.
	 */
	@Deprecated
	public void oldFeature() {
		System.out.println("Running old, slow code...");
	}

	public void newFeature() {
		System.out.println("Running new, fast code!");
	}
}
