package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.Duplicateremove;

class DuplicateremoveTest {

	@Test
	void testRemoveDuplicate() {
		assertEquals("abc", Duplicateremove.removeDuplicate("abcabcabc"));
	}

}
