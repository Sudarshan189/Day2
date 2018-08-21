package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.ReverseSentence;

class ReverseSentenceTest {

	@Test
	void testReverseString() {
		assertEquals("olleH droW ", ReverseSentence.reverseString("Hello Word"));
		assertEquals("olleH droW ", ReverseSentence.reverseString("Hello Word"));
	}

}
