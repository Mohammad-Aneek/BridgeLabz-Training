package com.annotations.BuiltIn.Deprecated;

public class Main {
	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();
		api.oldFeature();
		api.newFeature();
	}
}
