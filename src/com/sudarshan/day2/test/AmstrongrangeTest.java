package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.Amstrongrange;

class AmstrongrangeTest {

	@Test
	void testAmstrongCheck() {
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, Amstrongrange.amstrongCheck(100, 1000));
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, Amstrongrange.amstrongCheck(100, 1000));
	}

}
