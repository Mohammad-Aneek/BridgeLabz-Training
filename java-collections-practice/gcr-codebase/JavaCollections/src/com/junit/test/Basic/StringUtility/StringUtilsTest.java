package com.junit.test.Basic.StringUtility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.main.Basic.StringUtility.StringUtils;

class StringUtilsTest {

	StringUtils utils;

	@BeforeEach
	void setup() {
		this.utils = new StringUtils();
	}

	@Test
	void testReverse() {
		assertEquals("dcba", utils.reverse("abcd"));
		assertEquals("", utils.reverse(""));
		assertNull(utils.reverse(null));
	}

	@Test
	void testIsPalindrome() {
		assertTrue(utils.isPalindrome("radar"));
		assertTrue(utils.isPalindrome("Level"));
		assertFalse(utils.isPalindrome("hello"));
	}

	@Test
	void testToUpperCase() {
		assertEquals("JAVA", utils.toUpperCase("java"));
	}
}
