package com.junit.test.Basic.ListManager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.junit.main.Basic.ListManager.ListManager;

class ListManagerTest {
	ListManager manager = new ListManager();

	@Test
	void testListOperations() {
		List<Integer> myList = new ArrayList<Integer>();

		manager.addElement(myList, 10);
		assertEquals(1, manager.getSize(myList));
		assertTrue(myList.contains(10));

		manager.removeElement(myList, 10);
		assertEquals(0, manager.getSize(myList));
		assertFalse(myList.contains(10));
	}
}
