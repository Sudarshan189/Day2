package com.sudarshan.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day2.Amstrong;

class AmstrongTest {

	@Test
	void testAmstrongCheck() {
		assertEquals(true, Amstrong.amstrongCheck(153));
		assertEquals(true, Amstrong.amstrongCheck(-153));
		assertEquals(false, Amstrong.amstrongCheck(203));
		assertEquals(false, Amstrong.amstrongCheck(0235));
		assertEquals(true, Amstrong.amstrongCheck(153));
	}

}
