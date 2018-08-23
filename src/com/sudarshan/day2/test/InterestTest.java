package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.Interest;

class InterestTest {

	@Test
	void testSimpleInterest() {
		assertEquals(7.5, Interest.simpleInterest(100,(float)2.5,3));
	}

}
