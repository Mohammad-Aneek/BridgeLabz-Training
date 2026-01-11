package com.linearsearch.SearchWord;

public class Main {
	public static void main(String[] args) {
		String[] text = { "Hello world", "Java programming", "Linear search example" };
		System.out.println(SearchWord.findSentenceWithWord(text, "Java"));
	}
}
