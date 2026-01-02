package com.oops.leveltwo;

public class PalindromeChecker {
	String text;
	

	// constructor
	PalindromeChecker(String text) {
		this.text=text;
		
	}
	
	// to check for palindrome
	public boolean isPalindrome() {
		//to reverse the string
		String reverseText=new StringBuilder(text).reverse().toString();
		
		return text.equals(reverseText);
	}
	
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" is palindrome");
			}
		else {
			System.out.println(text+" is not Palindrome");
		}
	}
	public static void main(String[] args) {
		 PalindromeChecker checker1 = new PalindromeChecker("racecar");
		 checker1.diplayResult();
		
		 PalindromeChecker checker2 = new PalindromeChecker("Hello");
		 checker2.diplayResult();
	}

}
