package com.functionalinterface.DataTagging;

public class Main {
	public static void main(String[] args) {
		SecurityFilter.processData(new PublicPost());
		SecurityFilter.processData(new PrivatePost());
	}
}
