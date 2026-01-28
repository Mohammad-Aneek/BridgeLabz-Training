package com.annotations.BuiltIn.SupressWarnings;

import java.util.ArrayList;
import java.util.List;

public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("Hello");
		System.out.println(myList.get(0));
	}
}
